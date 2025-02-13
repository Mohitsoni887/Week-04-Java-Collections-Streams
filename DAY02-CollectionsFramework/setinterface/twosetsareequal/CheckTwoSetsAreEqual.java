/*
Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
*/

package com.setinterface.twosetsareequal;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsAreEqual {

    public static <T> boolean areSetEqual(Set<T> set1, Set<T> set2){
        if(set1 == null || set2 == null) {
            return false;
        }
        return set1.equals(set2);
    }
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);


        System.out.println("Are the sets equal:- " + areSetEqual(set1, set2));
    }
}
