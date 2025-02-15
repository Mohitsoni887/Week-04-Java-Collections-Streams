/*
try-with-resources (Auto-closing Resources)
        Problem Statement:
        Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
        Use try-with-resources to ensure the file is automatically closed after reading.
        Handle any IOException that may occur.
        Expected Behavior:
        If the file exists, print its first line.
        If the file does not exist, catch IOException and print "Error reading file".
 */
package com.trywithresources_autoclosingresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        String fileName = "info.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("The file is empty");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

