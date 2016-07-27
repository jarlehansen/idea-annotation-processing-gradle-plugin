package com.github.idea.annotation.processing

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class IdeaAnnotationProcessingPluginSpec extends Specification {

    def "Initialize plugin"() {
        given:
        Project project = ProjectBuilder.builder().build()

        when:
        project.pluginManager.apply 'com.github.idea.annotation.processing'

        then:
        project.tasks.size() == 1
    }
}
