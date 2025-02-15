/*Multiple Catch Blocks
        💡 Problem Statement:
        Create a Java program that performs array operations.
        Accept an integer array and an index number.
        Retrieve and print the value at that index.
        Handle the following exceptions:
        ArrayIndexOutOfBoundsException if the index is out of range.
        NullPointerException if the array is null.
        Expected Behavior:
        If valid, print "Value at index X: Y".
        If the index is out of bounds, display "Invalid index!".
        If the array is null, display "Array is not initialized!".

 */
package com.multiplecatchblocks;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] array = {10, 20, 30, 40, 50}; // Example array

        try {
            System.out.print("Enter the index number: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}

