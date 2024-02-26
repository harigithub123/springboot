package com.example.demo.leetcode.dec2023;

/**
 * 20th Dec 2023
 */
public class FindSpecialIntInArray {
    public int findSpecialInteger(int[] arr) {
        int minOccurrences = (arr.length/4) + 1;
        int length = arr.length;
        int count = 0;
        int elementToMatch = -1;
        for(int i =0;i<length;i++) {
            if(elementToMatch != arr[i]) {
                elementToMatch = arr[i];
                count=1;
            } else {
                count++;
            }
            if(count == minOccurrences) {
                return arr[i];
            }
        }
        return -1;
    }
}
