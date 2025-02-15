/*
Performance Testing Using @Timeout
Problem:
Create a method longRunningTask() that sleeps for 3 seconds before returning a result.
Use @Timeout(2) in JUnit to fail the test if the method takes more than 2 seconds.
*/
package com.performancetesting;

public class PerformanceUtils {
    // Simulates a long-running task by sleeping for 3 seconds
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulate delay of 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
        return "Task Completed";
    }
}
