/*
ByteArray Stream - Convert Image to ByteArray
📌 Problem Statement:
Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.
*/
package com.bytearraystream_convertimagetobytearray;
import java.io.*;

public class ByteArrayStream {
    public static void main(String[] args) {
        // Define source and destination image file paths
        String sourceImage = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\OriginalImage.jpg";  // Replace with your image file path
        String destinationImage = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\NewImage.jpg";  // Output image file

        try {
            // Convert image to byte array
            byte[] imageData = imageToByteArray(sourceImage);

            // Write byte array back to new image file
            byteArrayToImage(imageData, destinationImage);

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: An I/O exception occurred!");
            e.printStackTrace();
        }
    }
    private static byte[] imageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray(); // Convert to byte array
        }
    }

    private static void byteArrayToImage(byte[] imageData, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
