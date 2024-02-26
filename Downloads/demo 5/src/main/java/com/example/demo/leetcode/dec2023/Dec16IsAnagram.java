package com.example.demo.leetcode.dec2023;

/**
 *  * Daily Challenge date - 16th Dec 2023
 *  * Problem Solved Date  - 22nd Dec 2023
 */
public class Dec16IsAnagram {
    public static void main(String[] args) {
        String s = "anagramqweqweqwex", t = "nagaramewqewqweqy";
        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(int i=0;i<26;i++) {
            count[i]=0;
        }
        char[] chars = s.toCharArray();
        for(char ch : chars) {
            count[ch-97]++;
        }
        chars = t.toCharArray();
        for(char ch : chars) {
            count[ch-97]--;
        }
        for(int i=0;i<26;i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
