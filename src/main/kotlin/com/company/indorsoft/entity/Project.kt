package com.company.indorsoft.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.data.impl.lazyloading.NotInstantiatedSet
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.util.*

@JmixEntity
@Table(name = "IDS_PROJECT")
@Entity(name = "IDS_Project")
open class Project {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinTable(
        name = "IDS_PROJECT_EMPLOYEE_LINK",
        joinColumns = [JoinColumn(name = "PROJECT_ID")],
        inverseJoinColumns = [JoinColumn(name = "EMPLOYEE_ID")]
    )
    @ManyToMany
    var employees: MutableSet<Employee> = NotInstantiatedSet()

    @NotBlank
    @NotEmpty
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    var name: String? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null
}
