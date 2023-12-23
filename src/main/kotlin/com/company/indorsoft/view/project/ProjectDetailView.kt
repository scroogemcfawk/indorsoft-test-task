package com.company.indorsoft.view.project

import com.company.indorsoft.entity.Project
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "project/:id", layout = MainView::class)
@ViewController("IDS_Project.detail")
@ViewDescriptor("project-detail-view.xml")
@EditedEntityContainer("projectDc")
class ProjectDetailView: StandardDetailView<Project>() {
}
