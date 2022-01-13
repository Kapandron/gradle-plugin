package com.clevertec.gradleplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class CustomTask  extends DefaultTask {

    @TaskAction
    public void customTask() {
        System.out.println("Init version of custom gradle task");
    }
}
