/*
Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
*/

package com.mapinterface.invertmap;
import java.util.*;

public class InvertMap {

    public static void main(String[] args) {
        // Original map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverting the map
        Map<Integer, List<String>> invertedMap = invertMap(originalMap);

        // Display the inverted map
        System.out.println(invertedMap);
    }

    // Method to invert the map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        // Iterate over each entry in the original map
        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // If value already exists as a key in the inverted map, add the current key to the list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}
