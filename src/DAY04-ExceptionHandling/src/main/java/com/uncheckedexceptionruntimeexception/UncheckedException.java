/*Unchecked Exception (Runtime Exception)
        💡 Problem Statement:
        Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
        ArithmeticException if division by zero occurs.
        InputMismatchException if the user enters a non-numeric value.
        Expected Behavior:
        If the user enters valid numbers, print the result of the division.
        If the user enters 0 as the denominator, catch and handle ArithmeticException.
        If the user enters a non-numeric value, catch and handle InputMismatchException.

 */
package com.uncheckedexceptionruntimeexception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}

