package com.example.demo.leetcode.dec2023;

/**
 * 1st Nov
 */
public class CompareStringArray {
    public static void main(String[] args) {
       String[] word1 = new String[]{"ab", "c"};
       String[] word2 = new String[]{"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length == 0 && word2.length == 0) {
            return true;
        }

        if((word1.length == 0 && word2.length != 0) || (word1.length != 0 && word2.length == 0) ) {
            return false;
        }

        StringBuffer firstWord = new StringBuffer();
        for(String s : word1) {
            firstWord.append(s);
        }
        StringBuffer secondWord = new StringBuffer();
        for(String s : word2) {
            secondWord.append(s);
        }
        return firstWord.toString().equals(secondWord.toString());
    }
}
