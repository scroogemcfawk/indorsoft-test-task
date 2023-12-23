package com.company.indorsoft.view.employee

import com.company.indorsoft.entity.Employee
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "employees", layout = MainView::class)
@ViewController("IDS_Employee.list")
@ViewDescriptor("employee-list-view.xml")
@LookupComponent("employeesDataGrid")
@DialogMode(width = "64em")
class EmployeeListView: StandardListView<Employee>() {
}
