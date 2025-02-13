/*
Implement a Stack Using Queues
Implement a stack data structure using two queues and support push, pop, and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3.
*/

package com.queueinterface.implementstackusingqueues;
import java.util.*;

class StackUsingQueues<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(T element) {
        // Add element to queue2
        queue2.add(element);

        // Move all elements from queue1 to queue2 to maintain LIFO order
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // Swap the references of queue1 and queue2
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop the top element from the stack
    public T pop() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return queue1.poll();
    }

    // Get the top element without removing it
    public T top() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return queue1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        // Create a stack using two queues
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop the top element (should be 3)
        System.out.println("Popped: " + stack.pop()); // Output: 3

        // Get the top element without removing it (should be 2)
        System.out.println("Top: " + stack.top()); // Output: 2

        // Pop the top element (should be 2)
        System.out.println("Popped: " + stack.pop()); // Output: 2

        // Pop the last element (should be 1)
        System.out.println("Popped: " + stack.pop()); // Output: 1

        // Check if the stack is empty (should be true)
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}


