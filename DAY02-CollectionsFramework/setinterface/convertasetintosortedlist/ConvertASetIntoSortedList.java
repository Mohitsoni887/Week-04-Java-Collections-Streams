/*
Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/

package com.setinterface.convertasetintosortedlist;
import java.util.*;


public class ConvertASetIntoSortedList {
    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set); // Convert Set to List
        Collections.sort(sortedList); // Sort in ascending order
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Sorted List: " + convertSetToSortedList(hashSet));
    }
}
