package com.example.demo.controlstructures.conditional;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String args[]) {
        Scanner s  = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        findMaximum(a, b, c, d);
    }

    //10, 9, 8, 11
    //10, 9, 12, 50
    //10, 9, 12, 11
    public static void findMaximum(int a, int b, int c, int d) {//10, 9, 8, 7 //
        if (a > b) {
            if (a > c) {//a, c, d
                if (a > d) {//false a, d
                    System.out.println(a);//
                } else {
                    System.out.println(d);
                }
            } else { // c, d
                if (c > d) {//false a, d
                    System.out.println(c);//
                } else {
                    System.out.println(d);
                }
            }
        } else { // b, c, d
            if (b > c) {//a, c, d
                if (b > d) {//false a, d
                    System.out.println(b);//
                } else {
                    System.out.println(d);
                }
            } else { // c, d
                if (c > d) {//false a, d
                    System.out.println(c);//
                } else {
                    System.out.println(d);
                }
            }
        }

    }
}


