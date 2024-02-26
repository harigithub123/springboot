package com.example.demo.controlstructures.interative;

import java.util.Scanner;

/**
 * Write a program to read 3 integers using array and print given numbers
 *
 * Write a program
 *
 *  to read
 *
 * 3 integers using array
 *
 * and print
 *
 * only even numbers.
 */
public class ForLoop1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];// to remember
        //<data type> <arrayName>[] = new <same data type>[<Size>];
        int arr[] = new int[2];

        for(int i=0;i<3;i++) {
            a[i] = s.nextInt();
        }

        for(int i=0;i<3;i++) {
            if(a[i]%2==0) {
                System.out.println(a[i]);
            }
        }
    }
}
