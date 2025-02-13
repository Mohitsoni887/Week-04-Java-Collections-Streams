/*
Read a Large File Line by Line
📌 Problem Statement:
Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only lines containing the word "error".
Requirements:
Use BufferedReader for efficient reading.
Read line-by-line instead of loading the entire file.
Display only lines containing "error" (case insensitive).
*/
package com.readalargefilelinebyline;
import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\SampleFile.txt"; // Specify the large file path

        // Use try-with-resources to ensure automatic resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Lines containing 'error':\n");

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Check if the line contains "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            // Handle file-related exceptions
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
