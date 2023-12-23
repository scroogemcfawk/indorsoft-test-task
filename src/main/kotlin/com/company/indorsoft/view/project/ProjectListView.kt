package com.company.indorsoft.view.project

import com.company.indorsoft.entity.Project
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "projects", layout = MainView::class)
@ViewController("IDS_Project.list")
@ViewDescriptor("project-list-view.xml")
@LookupComponent("projectsDataGrid")
@DialogMode(width = "64em")
class ProjectListView: StandardListView<Project>() {
}
