package com.example.demo.leetcode.dec2023;

/**
 * 7th Dec problem
 */
public class MaxOddFromString {
    public static void main(String[] args) {
        MaxOddFromString m = new MaxOddFromString();
        System.out.println("52, maxOdd="+m.largestOddNumber("52"));
        System.out.println("123456, maxOdd="+m.largestOddNumber("123456"));
        System.out.println("12345678, maxOdd="+m.largestOddNumber("12345678"));
        System.out.println("24608, maxOdd="+m.largestOddNumber(""));
    }
    public String largestOddNumber(String num) {
        int lastIndex = num.length()-1;
        while(lastIndex >= 0) {
            int digit = num.charAt(lastIndex)-'0';
            if( (digit&1) == 1) {
                return num.substring(0,lastIndex+1);
            }
            lastIndex--;
        }
        return "";
    }
}
