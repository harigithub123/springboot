package com.example.demo.classes;

import java.util.Scanner;

public class FindTheOutput {
    public static void main(String args[]) {

        int a=20;
        System.out.println("Hi");
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        System.out.println(s);
        test1();
        test2();
        System.out.println("Middle");
        test3();
        /**
         * We can have if without else
         * But we can't have else without if.
         */
    }

    public static void test1() {
        System.out.println("Inside test1 method");
    }

    public static void test2() {
        System.out.println("Inside test2 method");
    }

    public static void test3() {
        System.out.println("Inside test3 method");
    }
}
