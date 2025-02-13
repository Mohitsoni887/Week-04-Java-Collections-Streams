/*
Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
*/

package com.setinterface.findallsubset;
import java.util.HashSet;
import java.util.Set;

public class FindAllSubsets {
    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set2.containsAll(set1); // Check if set1 is a subset of set2
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Is set1 a subset of set2:- " + isSubset(set1, set2));
    }
}
