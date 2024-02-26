package com.example.demo.exception;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[4];
        for (int i = 0; i <= 3; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[5]);
        display(null, -1);
    }

    private static void display(int[] arr, int index) {
        System.out.println(arr[index]);
    }
}
