package com.company.indorsoft.view.user

import com.company.indorsoft.entity.User
import com.company.indorsoft.view.main.MainView
import com.vaadin.flow.router.Route
import io.jmix.flowui.view.*

@Route(value = "users", layout = MainView::class)
@ViewController("IDS_User.list")
@ViewDescriptor("user-list-view.xml")
@LookupComponent("usersDataGrid")
@DialogMode(width = "64em")
open class UserListView : StandardListView<User>()
