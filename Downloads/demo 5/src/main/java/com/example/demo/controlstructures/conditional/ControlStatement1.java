package com.example.demo.controlstructures.conditional;

import java.util.Scanner;

/**
 * Write a java program
 * to read
 * 2 integers
 * and perform addition,
 * multiplication,
 * subtraction and
 * division using different methods
 * and print result of each operation.
 */

/**
    benefits of writing methods
        - we can re-use the code.
        - code segregation (we can write individual code for particular functionality).
        - Code readability.

    We can't have method inside method
 */

public class ControlStatement1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        /*ljkdlqjds;jdsdjs
        asdl
        adn;sd
        laknsd
        na
        dna
        fs;knqf


         */
        addition(a,10);
        multiplication(a,b);//method cal
        subtraction(a,b);
        division(a,b);

        /**
         * Prototype/signature
         */


    }//end of main method


    public static void addition(int asd , int sd) {
        int c = asd+sd;
        System.out.println("addition=");
        System.out.println(c);
    }

    public static void multiplication(int a, int b) {
        int c = a-b;
        System.out.println("multiplication=");
        System.out.println(c);
    }

    public  static void subtraction(int a, int b) {
        int c = a-b;
        System.out.println("subtraction=");
        System.out.println(c);
    }

    public static  void division(int a, int b) {
        int c = a/b;
        System.out.println("division=");
        System.out.println(c);
    }
    public static  void mod(int a, int b) {
        int c = a%b;
        System.out.println("mod=");
        System.out.println(c);
    }

}
