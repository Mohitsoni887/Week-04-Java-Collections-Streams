/*
Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
 */

package com.listinterface.findfrequencyofelement;

import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> result = countFrequency(inputList);

        System.out.println(result);
    }
}

