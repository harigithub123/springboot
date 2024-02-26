package com.example.demo.test;

public class FindTheOutput {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
                i++;
            } else {
                System.out.println("Odd");
            }
        }
    }
}
