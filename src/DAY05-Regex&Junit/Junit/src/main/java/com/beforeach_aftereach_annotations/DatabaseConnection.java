/*
 Testing @BeforeEach and @AfterEach Annotations
Problem:
Create a class DatabaseConnection with a method connect() and disconnect().
Use @BeforeEach to initialize a database connection before each test.
Use @AfterEach to close the connection after each test.
Write JUnit test cases to verify that the connection is established and closed correctly.

 */

package com.beforeach_aftereach_annotations;

public class DatabaseConnection {
    private boolean isConnected;

    // Method to establish a connection
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // Method to close the connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check if the connection is active
    public boolean isConnected() {
        return isConnected;
    }
}
