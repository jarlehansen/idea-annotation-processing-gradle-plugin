package com.github.idea.annotation.processing

import groovy.xml.XmlUtil
import org.gradle.api.Plugin
import org.gradle.api.Project

class IdeaAnnotationProcessingPlugin implements Plugin<Project> {

    private static final String COMPILER_FILE = ".idea/compiler.xml"

    @Override
    void apply(Project project) {
        project.task('enableAnnotationProcessing') << {
            enableAnnotationProcessing()
        }
    }

    static void enableAnnotationProcessing() {
        def compilerXml = new XmlSlurper().parse(COMPILER_FILE)
        compilerXml.component.annotationProcessing.profile.@enabled = "true"
        XmlUtil.serialize(compilerXml, new FileWriter(new File(COMPILER_FILE)))
    }

}
