package com.clevertec.gradleplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class LogPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        System.out.println("Init version of custom gradle plugin");

        project.getTasks().create("customTask", CustomTask.class);
    }

}
