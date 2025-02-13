/*
Filter Streams - Convert Uppercase to Lowercase
📌 Problem Statement:
Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.
 */
package com.filterstreams_convertuppercasetolowercase;
import java.io.*;

public class FilterStreams {
    public static void main(String[] args) {
        // Define input and output file names
        String inputFile = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\UpperCaseCharacter.txt";   // Input file path
        String outputFile = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\LowerCaseCharacter.txt"; // Output file path

        // Use try-with-resources to handle file operations
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase and write it to the output file
                writer.write(line.toLowerCase());
                writer.newLine(); // Add a new line after writing each line
            }

            System.out.println("File conversion completed. Check " + outputFile);
        } catch (IOException e) {
            // Handle exceptions related to file reading/writing
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

