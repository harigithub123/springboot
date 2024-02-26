package com.example.demo.practice;

import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
//        System.out.println("enter size of array");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        char[] arr = new char[size];
//        System.out.println("enter element of array");
//        for (int i = 0; i < size; i++) {
//            arr[i] = scanner.next().charAt(0);
//        }
      //  checkArrayIsPalidromeOrNot(arr, size);

        System.out.println("145 is strong number " + isStrongNumber(145));
        System.out.println("146 is strong number " + isStrongNumber(146));
        test();
    }

    /*
    0 1 2 3 4
    M A D B M
    i=0, 1
    size = 5, 4, 3
    2
     */

    public boolean isPalindromeUsingWhile(char[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer < rightPointer) {
            if (arr[leftPointer] != arr[rightPointer]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeUsingFor(char[] arr) {

        for (int leftPointer = 0, rightPointer = arr.length - 1; leftPointer < rightPointer; leftPointer++, rightPointer--) {
            if (arr[leftPointer] != arr[rightPointer]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkArrayIsPalidromeOrNot(char[] arr, int size) {
        int i;
        for (i = 0; i < arr.length / 2; i++) {//5/2=2
            size--;
            if (arr[i] != arr[size]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum = sum + fact(temp % 10);
            temp = temp/10;
        }
        return sum == number;
    }

    private static int fact(int i) {
        int product = 1;
        while (i > 0) {
            product = product * i;
            i--;
        }
        return product;
    }

    public static boolean isStrongNumber1(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int tempProd = 1;
            for(int i=1;i<=temp % 10;i++) {
                tempProd = tempProd*i;
            }
            sum = sum + tempProd;
            temp = temp/10;
        }
        return sum == number;
    }

    public static void test() {
        double number=0;
        while((number = readNumber()) <= 10) {
            System.out.println("No is than 10  :: "+number);
        }
        System.out.println("Found number greater than 10 :: "+number);
    }

    public static double readNumber() {
        return Math.random()*100;
    }


}
