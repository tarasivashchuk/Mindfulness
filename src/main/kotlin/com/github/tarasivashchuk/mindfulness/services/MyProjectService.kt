package com.github.tarasivashchuk.mindfulness.services

import com.intellij.openapi.project.Project
import com.github.tarasivashchuk.mindfulness.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
