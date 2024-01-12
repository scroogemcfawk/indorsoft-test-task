package com.company.indorsoft.view.project

import com.company.indorsoft.entity.Employee
import com.company.indorsoft.entity.Project
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.component.ClickEvent
import com.vaadin.flow.router.Route
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup
import io.jmix.flowui.kit.component.button.JmixButton
import io.jmix.flowui.model.CollectionContainer
import io.jmix.flowui.model.InstanceContainer
import io.jmix.flowui.view.*
import io.jmix.flowui.view.Target
import org.springframework.beans.factory.annotation.Autowired

@Route(value = "project/:id", layout = MainView::class)
@ViewController("IDS_Project.detail")
@ViewDescriptor("project-detail-view.xml")
@EditedEntityContainer("projectDc")
class ProjectDetailView: StandardDetailView<Project>() {

    @ViewComponent
    private lateinit var projectDc: InstanceContainer<Project>

    @ViewComponent
    private lateinit var employeesDc: CollectionContainer<Employee>

    @ViewComponent
    private lateinit var employeesCheckbox: JmixCheckboxGroup<Employee>


    @Subscribe(id = "involveAll", subject = "clickListener")
    private fun onInvolveAllClick(event: ClickEvent<JmixButton>) {
        projectDc.item.employees.addAll(employeesDc.items)
        employeesCheckbox.updateSelection(employeesDc.items.toSet(), emptySet())
    }

}
