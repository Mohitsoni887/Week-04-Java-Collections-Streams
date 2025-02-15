/*
Testing File Handling Methods
Problem:
Create a class FileProcessor with the following methods:
writeToFile(String filename, String content): Writes content to a file.
readFromFile(String filename): Reads content from a file.
Write JUnit tests to check if:
✅ The content is written and read correctly.
✅ The file exists after writing.
✅ Handling of IOException when the file does not exist.
 */
package com.filehandling;

import java.io.*;

public class FileProcessor {
    // Method to write content to a file
    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    // Method to read content from a file
    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim(); // Trim to remove trailing newline
    }
}

