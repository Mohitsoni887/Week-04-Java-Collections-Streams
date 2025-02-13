/*
Data Streams - Store and Retrieve Primitive Data
📌 Problem Statement:
Write a Java program that stores student details (roll number, name, GPA) in a binary file and retrieves it later.
Requirements:
Use DataOutputStream to write primitive data.
Use DataInputStream to read data.
Ensure proper closing of resources.
 */
package com.datastreams_storeandretrieveprimitivedata;
import java.io.*;

public class DataStream {
    public static void main(String[] args) {
        String fileName = "M:\\CapgeminiTraining\\Week-4\\src\\DAY03-JavaStreams\\src\\main\\resources\\StudentDetails.txt"; // Binary file to store student details

        // Writing student details to the file
        writeStudentData(fileName);

        // Reading and displaying student details from the file
        readStudentData(fileName);
    }

    // Method to write student details to a binary file
    private static void writeStudentData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing multiple student records
            dos.writeInt(101); // Roll Number
            dos.writeUTF("Alice Johnson"); // Name
            dos.writeDouble(3.8); // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob Smith");
            dos.writeDouble(3.5);

            dos.writeInt(103);
            dos.writeUTF("Charlie Brown");
            dos.writeDouble(3.9);

            System.out.println("Student details successfully written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read and display student details from the binary file
    private static void readStudentData(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nReading student details from " + fileName + ":");
            while (dis.available() > 0) { // Check if there is data left to read
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

