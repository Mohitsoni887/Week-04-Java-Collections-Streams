/*
Testing Exception Handling
Problem:
Create a method divide(int a, int b) that throws an ArithmeticException if b is zero. Write a JUnit test to verify that the exception is thrown properly.
 */

package com.exceptionhandling;

public class ExceptionHandling {
    // Method to divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
