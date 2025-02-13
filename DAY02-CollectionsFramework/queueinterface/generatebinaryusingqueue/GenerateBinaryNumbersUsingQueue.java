
/*
Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
*/
package com.queueinterface.generatebinaryusingqueue;
import java.util.*;

public class GenerateBinaryNumbersUsingQueue {
    public static <T> List<T> generateBinaryNumbers(int N, Queue<T> queue) {
        List<T> result = new ArrayList<>();

        queue.add((T) "1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String current = (String) queue.poll(); // Get the front element
            result.add((T) current); // Store the binary number

            // Enqueue the next two binary numbers
            queue.add((T) (current + "0"));
            queue.add((T) (current + "1"));
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        Queue<String> queue = new LinkedList<>();

        // Using the generic method to generate binary numbers
        System.out.println("First " + N + " binary numbers: " + generateBinaryNumbers(N, queue));
    }
}

