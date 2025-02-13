/*
Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
*/
package com.queueinterface.reversequeue;
import java.util.*;

public class ReverseQueue {

        public static <T> void reverseQueue(Queue<T> queue) {
            Stack<T> stack = new Stack<>();

            //  Dequeue all elements from queue and push onto the stack
            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            //  Pop elements from stack and enqueue them back into the queue
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
        }

        public static void main(String[] args) {
            // Integer Queue
            Queue<Integer> intQueue = new LinkedList<>(Arrays.asList(10, 20, 30));
            System.out.println("Original Integer Queue: " + intQueue);
            reverseQueue(intQueue);
            System.out.println("Reversed Integer Queue: " + intQueue);
        }
    }


