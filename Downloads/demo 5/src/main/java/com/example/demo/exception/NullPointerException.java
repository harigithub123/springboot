package com.example.demo.exception;

import java.util.Scanner;

public class NullPointerException {
    public static void main(String[] args) {
        String s = null;
        String s1 = "";
        String s2 = "Hari";
        displayLengthOfString(s2);
        displayLengthOfString(s1);
       // displayLengthOfString(s);

    }

    private static int readInt(Scanner scanner) {
        int n = scanner.nextInt();
        return n;
    }

    private static void displayLengthOfString(String s) {
        System.out.println(s.length());
    }
}

//Integer, Character, Float, Double, Long, Boolean, String  - Wrapper Classes
//int , char, float, double, long , boolean - Primitives Data Type


class Student {
    int rollNo;
    String s;
}