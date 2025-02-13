/*
Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
*/
package com.mapinterface.wordfrequencycounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String fileName = "M:\\CapgeminiTraining\\Week-4\\src\\DAY02-CollectionFramework\\src\\main\\java\\com\\mapinterface\\wordfrequencycounter\\WordFrequencyCounter.java";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");
                for (String word : words) {
                    if (word.isEmpty()) {
                        continue;
                    }
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(wordCount);
    }
}
