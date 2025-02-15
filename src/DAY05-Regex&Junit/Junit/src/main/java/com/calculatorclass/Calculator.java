/*
Basic JUnit Test: Testing a Calculator Class
Problem:
Create a Calculator class with methods add(int a, int b), subtract(int a, int b), multiply(int a, int b), and divide(int a, int b). Write JUnit test cases for each method.
👉 Bonus: Test for division by zero and handle exceptions properly.
 */

package com.calculatorclass;
public class Calculator {
    // Method to add
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide
    public int divide(int a, int b) {
        // Check if b is 0
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}