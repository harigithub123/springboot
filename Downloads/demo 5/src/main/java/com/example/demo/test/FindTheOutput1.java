package com.example.demo.test;

public class FindTheOutput1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i < 3) {
                System.out.println("no is less than 3");
            } else if (i < 2) {
                System.out.println("no is less than 2");
            } else {
               System.out.println("Other Value");
            }
        }
    }
}
