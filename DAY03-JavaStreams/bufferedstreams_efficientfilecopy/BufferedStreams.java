/*
Buffered Streams - Efficient File Copy
📌 Problem Statement:
Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.
 */
package com.bufferedstreams_efficientfilecopy;
import java.io.*;

public class BufferedStreams {
    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\SampleFile.txt";  // Replace with your actual file path
        String destinationBuffered = "copy_buffered.txt";
        String destinationUnbuffered = "copy_unbuffered.txt";

        // Measure time for unbuffered file copy
        long unbufferedTime = copyFileUnbuffered(sourceFile, destinationUnbuffered);
        System.out.println("Unbuffered Copy Time: " + unbufferedTime + " ns (" + (unbufferedTime / 1_000_000) + " ms)");

        // Measure time for buffered file copy
        long bufferedTime = copyFileBuffered(sourceFile, destinationBuffered);
        System.out.println("Buffered Copy Time: " + bufferedTime + " ns (" + (bufferedTime / 1_000_000) + " ms)");

        // Compare performance
        System.out.println("\nBuffered copy was " + (double) unbufferedTime / bufferedTime + " times faster than unbuffered copy.");
    }

    private static long copyFileUnbuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error in unbuffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    private static long copyFileBuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}

