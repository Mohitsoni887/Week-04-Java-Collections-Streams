/*
Testing List Operations
Problem:
Create a ListManager class that has the following methods:
addElement(List<Integer> list, int element): Adds an element to a list.
removeElement(List<Integer> list, int element): Removes an element from a list.
getSize(List<Integer> list): Returns the size of the list.
Write JUnit tests to verify that:
✅ Elements are correctly added.
✅ Elements are correctly removed.
✅ The size of the list is updated correctly.
 */
package com.listoperations;
import java.util.List;

// Create ListManager class to add, remove and get size of list
public class ListManager {
    // Method to add element
    public void addElement(List<Integer> list, int element) {
        // If list is null
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.add(element);
    }

    // Method to remove element
    public void removeElement(List<Integer> list, int element) {
        // If list is null
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.remove(Integer.valueOf(element)); // Ensures element is removed by value, not index
    }

    // Method to get size
    public int getSize(List<Integer> list) {
        // If list is null
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.size();
    }
}

