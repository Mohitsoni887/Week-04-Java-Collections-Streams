/*
Create and Use a Repeatable Annotation
✅ Problem Statement:
Define an annotation @BugReport that can be applied multiple times on a method.
🔹 Steps to Follow:
Define @BugReport with a description field.
Use @Repeatable to allow multiple bug reports.
Apply it twice on a method.
Retrieve and print all bug reports.
 */
package com.createanduserepeatableannotation;

import java.lang.reflect.Method;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Repeatable annotation
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
    String reportedBy();
}

// Container annotation to hold multiple BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class SoftwareModule {

    @BugReport(description = "Null pointer exception in edge cases", reportedBy = "Alice")
    @BugReport(description = "Performance issue with large datasets", reportedBy = "Bob")
    public void processTask() {
        System.out.println("Processing task...");
    }
}

public class BugReportProcessor {
    public static void main(String[] args) {
        try {
            // Get the SoftwareModule class
            Class<?> clazz = SoftwareModule.class;

            // Get the processTask() method
            Method method = clazz.getMethod("processTask");

            // Check if @BugReport (repeatable annotation) is present
            if (method.isAnnotationPresent(BugReport.class) || method.isAnnotationPresent(BugReports.class)) {
                BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

                System.out.println("Bug Reports for processTask():");
                for (BugReport bug : bugReports) {
                    System.out.println(" - " + bug.description() + " (Reported by: " + bug.reportedBy() + ")");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
