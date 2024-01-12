package com.company.indorsoft.view.project

import com.company.indorsoft.entity.Project
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.data.renderer.TextRenderer
import com.vaadin.flow.router.Route
import io.jmix.flowui.component.grid.DataGrid
import io.jmix.flowui.view.*
import java.lang.reflect.TypeVariable


@Route(value = "projects", layout = MainView::class)
@ViewController("IDS_Project.list")
@ViewDescriptor("project-list-view.xml")
@LookupComponent("projectsDataGrid")
@DialogMode(width = "64em")
class ProjectListView: StandardListView<Project>() {

    @ViewComponent
    private val projectsDataGrid: DataGrid<Project>? = null

    @Subscribe
    private fun onInit(event: InitEvent) {
        projectsDataGrid?.addColumn { project -> project.employees.size }!!.setHeader("Number of employees")
    }

    


}
