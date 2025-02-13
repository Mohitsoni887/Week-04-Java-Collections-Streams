/*
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
*/

package com.listinterface.reverselist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Generic method to reverse any List (ArrayList or LinkedList)
    public static <T> void reverseList(List<T> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Original LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}

