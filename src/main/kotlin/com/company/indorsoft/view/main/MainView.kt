package com.company.indorsoft.view.main

import com.vaadin.flow.router.Route
import io.jmix.flowui.app.main.StandardMainView
import io.jmix.flowui.view.ViewController
import io.jmix.flowui.view.ViewDescriptor

@Route("")
@ViewController("IDS_MainView")
@ViewDescriptor("main-view.xml")
open class MainView : StandardMainView()
