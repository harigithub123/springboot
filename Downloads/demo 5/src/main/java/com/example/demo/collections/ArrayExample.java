package com.example.demo.collections;

/**
 * It allocates memory continuously.
 * Index starts from 0 and ends at size-1
 * If we create a variable of type String then default value will be null.
 * Array does not provider feature to insert value in-between unlike Array List
 */
public class ArrayExample {
    public static void main(String[] args) {
        String arr[] = new String[10];
        arr[0] = "First";
        arr[1] = "second";
        arr[2] = "third";
        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = arr[0];
        arr[0] = "Rushi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
