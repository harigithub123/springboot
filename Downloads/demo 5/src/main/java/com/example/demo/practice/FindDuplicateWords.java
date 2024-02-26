package com.example.demo.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWords {

    public static void main(String[] args) {
        FindDuplicateWords findDuplicateWords = new FindDuplicateWords();
        findDuplicateWords.findDuplicateWordsInString("hari nale vitthal nale pooja nale hari vitthal");
    }

    /**
     * Assuming words are separated by single space.
     * Also we are not taking care of case-sensitive strings.
     *
     * @param s
     */
    private void findDuplicateWordsInString(String s) {
        String[] words = s.split(" ");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        Map<String, Long> wordsCount1 = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        wordsCount1.entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(System.out::println);
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}


