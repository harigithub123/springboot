package com.example.demo.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindLongestSubsequence1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String inputNumberSequence = br.readLine();
            String[] tokens = inputNumberSequence.split(" ");
            int arr[] = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }
            System.out.println(findLongestSubsequence(arr));
            int longest = 0;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findLongestSubsequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int num : arr) {
            set.add(num);
        }

        for(int num : arr) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                int currentLength = 1;
                while(set.contains(currentNum+1)){
                    currentLength++;
                    currentNum++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
