package com.example.demo.leetcode.dec2023;

import java.util.HashMap;
import java.util.Map;

/**
 * 2nd Nov
 */
public class GoodStringCharacterCount {
    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charCounts = countCharacters(chars);
        int count = 0;
        for(String word : words) {
            Map<Character, Integer> characterCounts = new HashMap<>(charCounts);
            //char[] tokens = word.toCharArray();
            boolean found = true;
            int length = word.length();
            for(int i=0; i< word.length(); i++) {
                if(characterCounts.containsKey(word.charAt(i))) {
                    if(characterCounts.get(word.charAt(i)) == 1) {
                        characterCounts.remove(word.charAt(i));
                    } else {
                        characterCounts.put(word.charAt(i), characterCounts.get(word.charAt(i))-1);
                    }
                } else {
                    found = false;
                    break;
                }
            }
            if(found) {
                count += word.length();
            }
        }
        return count;
    }

    private static Map<Character, Integer> countCharacters(String chars) {
        Map<Character, Integer> characterCounts = new HashMap<>();
        char[] charTokens = chars.toCharArray();
        for(char c : charTokens) {
            if(characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c)+1);
            } else {
                characterCounts.put(c, 1);
            }
        }
        return characterCounts;
    }
}
