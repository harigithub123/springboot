package com.example.demo.concurrent;

class SharedMyClass {
    private static final Object sharedLock = new Object();

    public void m1() {
        synchronized (sharedLock) {
            // Method implementation
            System.out.println("Method m1() called by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronisationUsingSharedLock {
    public static void main(String[] args) {
        SharedMyClass obj1 = new SharedMyClass();
        SharedMyClass obj2 = new SharedMyClass();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                obj1.m1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                obj2.m1();
            }
        });

        thread1.start();
        thread2.start();
    }
}
