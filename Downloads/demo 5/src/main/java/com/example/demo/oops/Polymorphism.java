package com.example.demo.oops;

/**
method overloading
 */
public class Polymorphism {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int sum = sum(a,b);
        sum(3.5,6.7);
        //System.out.println(sum);
        display(sum);
        display("Hari");

    }
    public static int sum(int a, int b) {
        System.out.println("Inside Int , Int");
        return a+b;
    }

    public static double sum(double a, double b) {
        System.out.println("Inside double, double");;
        return a+b;
    }

    public static void display(int n) {
        System.out.println(n);
    }
    public static void display(String n) {
        System.out.println(n);
    }
    public static void display(long n) {
        System.out.println(n);
    }
    public static void display(double n) {
        System.out.println(n);
    }


    public static int getValue(int i) {
        return 1;
    }

    public static double getValue() {
        return 1.5;
    }

}
