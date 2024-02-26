package com.example.demo.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> task1 = executorService.submit(() -> {
            int i = 0;
            while (i++ < 5) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Future<?> task2 = executorService.submit(() -> {
            int i = 0;
            while (i++ < 10) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        while(!task1.isDone() && !task2.isDone()) {
            System.out.println("Both the tasks are still running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(task1.isDone() ? "Task 1" : "Task 2");
        System.out.println("Is completed first.");
    }
}
