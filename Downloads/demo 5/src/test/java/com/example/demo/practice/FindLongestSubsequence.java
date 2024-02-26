package com.example.demo.practice;

import org.junit.platform.commons.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FindLongestSubsequence {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ss = "HI, how are you".replaceAll(" ","").toLowerCase();
        System.out.println("HI, how are you. abd jdca".replaceAll("a","*").toLowerCase());
        System.out.println(ss);
        try {
            int n = Integer.parseInt(br.readLine());
            String inputNumberSequence = br.readLine();
            String[] tokens = inputNumberSequence.split("");
            int numbers[] = new int[n];
            for(int i=0;i<n;i++) {
                numbers[i] = Integer.parseInt(tokens[i]);
            }
            Arrays.stream(numbers).forEach(System.out::println);

            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n-1;i++) {
                list.add(numbers[i+1]-numbers[i]);
            }
            int longest = 0;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
