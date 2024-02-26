package com.example.demo.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        List<List<Integer>> listOfChunks = new ArrayList<>();
        int i=0;
        List<Integer> l=null;
        while(i<arr.length) {
            l = new ArrayList<>();
            for(int j = 0;j<k && i<arr.length ;j++) {
                l.add(arr[i++]);
            }
            listOfChunks.add(l);
        }
        System.out.println(listOfChunks);
    }
}
