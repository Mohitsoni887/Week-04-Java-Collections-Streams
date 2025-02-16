/*
Create a Custom Annotation and Use It
✅ Problem Statement:
Create a custom annotation @TaskInfo to mark tasks with priority and assigned person.
🔹 Steps to Follow:
Define an annotation @TaskInfo with fields priority and assignedTo.
Apply this annotation to a method in TaskManager class.
Retrieve the annotation details using Reflection API.
*/
package com.createcustomannotation;
import java.lang.reflect.Method;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Retain annotation at runtime
@Target(ElementType.METHOD) // Can be applied to methods only
@interface TaskInfo {
    String priority();    // Priority field
    String assignedTo();  // Assigned person field
}

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }
}

public class CreateCustomAnnotation {
    public static void main(String[] args) {
        try {
            // Get the TaskManager class
            Class<?> taskManagerClass = TaskManager.class;

            // Get the completeTask() method
            Method method = taskManagerClass.getMethod("completeTask");

            // Check if @TaskInfo is present
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve annotation details
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
