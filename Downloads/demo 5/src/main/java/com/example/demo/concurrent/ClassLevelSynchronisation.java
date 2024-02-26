package com.example.demo.concurrent;

class MyClass {
    public static synchronized void m1() {
        // Method implementation
        System.out.println("Method m1() called by: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ClassLevelSynchronisation {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                MyClass.m1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                MyClass.m1();
            }
        });

        thread1.start();
        thread2.start();
    }
}