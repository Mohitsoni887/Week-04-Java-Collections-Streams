/*
Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
*/

package com.listinterface.removeduplicates;
import java.util.*;
public class RemoveDuplicates{
    public static<T> void RemoveDuplicates(List<T> List){
        Set<T> set = new LinkedHashSet<>(List);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,2,2,2,3,4,2,6,4,5,3);
        List<Integer> uniqueNumbers = new ArrayList<>(new LinkedHashSet<>(numbers));
        System.out.println(uniqueNumbers);
    }
}

