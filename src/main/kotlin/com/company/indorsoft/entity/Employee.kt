package com.company.indorsoft.entity

import io.jmix.core.MetadataTools
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.DependsOnProperties
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.data.impl.lazyloading.NotInstantiatedSet
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.eclipse.persistence.annotations.Property
import java.util.*

@JmixEntity
@Table(name = "IDS_EMPLOYEE")
@Entity(name = "IDS_Employee")
open class Employee {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @NotBlank
    @NotEmpty
    @Column(name = "NAME", nullable = false, length = 32)
    @NotNull
    var name: String? = null

    @Column(name = "PATRONYM", length = 64)
    var patronym: String? = null

    @NotBlank
    @NotEmpty
    @Column(name = "SURNAME", nullable = false, length = 32)
    @NotNull
    var surname: String? = null

    @JoinTable(
        name = "IDS_PROJECT_EMPLOYEE_LINK",
        joinColumns = [JoinColumn(name = "EMPLOYEE_ID")],
        inverseJoinColumns = [JoinColumn(name = "PROJECT_ID")]
    )
    @ManyToMany
    var projects: MutableSet<Project> = NotInstantiatedSet()

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null


    @InstanceName
    @DependsOnProperties("name", "surname")
    fun getInstanceName(metadataTools: MetadataTools): String =
        "${metadataTools.format(name)} ${metadataTools.format(surname)}".trim()
}
