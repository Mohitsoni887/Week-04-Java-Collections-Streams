/*
Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
*/

package com.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);


        Map<String, Integer> mergedMap = new HashMap<>(map1);


        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        // Output the merged map
        System.out.println(mergedMap);
    }
}

