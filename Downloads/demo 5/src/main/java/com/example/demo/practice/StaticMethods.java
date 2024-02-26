package com.example.demo.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticMethods {
    Logger logger = LoggerFactory.getLogger(StaticMethods.class);
    public static void main(String[] args) {
//        display("Hello world");
//        StaticMethods staticMethods = new StaticMethods();
//        staticMethods.displayObject("Hello World");
        Student s1 = new Student(1, "Mayuri");
        Student s2 = new Student(2, "Satish");
        Student s3 = new Student(2, "Hari");

    }
//    public static void display(String message) {
//        System.out.println("");
//        System.out.println("inside static method-"+message);
//    }
//
//    public void displayObject(String message) {
//        System.out.println(this);
//        System.out.println("Inside Object Method-"+message);
//    }
}


