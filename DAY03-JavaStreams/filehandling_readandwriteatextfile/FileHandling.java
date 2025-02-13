/*
1. File Handling - Read and Write a Text File
📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/
package com.filehandling_readandwriteatextfile;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\source.txt"; // Change this to your source file path
        String destinationFile = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\destination.txt"; // Change this to your destination file path

        // FileInputStream for reading the source file
        // FileOutputStream for writing to the destination file
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            // Buffer to hold file data
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred!");
            e.printStackTrace();
        }
    }
}
