package com.company.indorsoft.view.employee

import com.company.indorsoft.entity.Employee
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "employee/:id", layout = MainView::class)
@ViewController("IDS_Employee.detail")
@ViewDescriptor("employee-detail-view.xml")
@EditedEntityContainer("employeeDc")
class EmployeeDetailView: StandardDetailView<Employee>() {
}
