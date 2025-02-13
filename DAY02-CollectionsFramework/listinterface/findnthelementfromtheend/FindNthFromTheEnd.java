/*
Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.
*/

package com.listinterface.findnthelementfromtheend;
import java.util.LinkedList;
import java.util.ListIterator;

public class FindNthFromTheEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int N) {
        if (list == null || N <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        ListIterator<T> fast = list.listIterator();
        ListIterator<T> slow = list.listIterator();

        // Move fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is larger than the size of the list");
            }
            fast.next();
        }

        // Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // slow now points to the Nth node from the end
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println("Nth element from the end: " + findNthFromEnd(list, N));
    }
}

