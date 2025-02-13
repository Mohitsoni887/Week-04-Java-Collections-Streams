/*
Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
*/
package com.listinterface.rotateelementsinalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateElement {

    public static <T> void rotateList(ArrayList<T> list, int k) {
        Collections.rotate(list, -k); // Left rotation by k positions
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        int k = 2; // Number of positions to rotate left

        System.out.println("Original ArrayList: " + arrayList);
        rotateList(arrayList, k);
        System.out.println("Rotated ArrayList: " + arrayList); // Expected Output: [30, 40, 50, 10, 20]
    }
}
