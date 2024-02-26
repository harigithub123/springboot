package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;

public class DiningPhilosopherProblem {

    public static void main(String[] args) throws InterruptedException {
        List<Philosopher> philosophers = new ArrayList<>(5);
        Object[] forks = new Object[5];
        for(int i=0;i<forks.length;i++) {
            forks[i] = new Object();
        }

        for(int i=0;i<forks.length;i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i+1)%forks.length];
            if(i == philosophers.size()-1) {
                philosophers.add(i, new Philosopher(rightFork, leftFork));
            } else {
                philosophers.add(i, new Philosopher(leftFork, rightFork));
            }
            Thread t = new Thread(philosophers.get(i), "Philosopher "+(i+1));
            t.start();
        }
    }

}

class Philosopher implements Runnable {
    private Object leftFork;
    private Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void doAction(String actionName) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + actionName);
        Thread.sleep(((int)(Math.random()*100)));
    }

    @Override
    public void run() {

        try {
            while (true) {
                doAction("Thinking...");
                synchronized (leftFork) {
                    doAction(System.nanoTime() + ": Picked Up left fork");
                    synchronized (rightFork) {
                        doAction(System.nanoTime() + ": Picked Up right fork - eating");
                        doAction(System.nanoTime() + ": Put down right fork");
                    }
                    doAction(System.nanoTime() + ": Put down left fork. Back to thinking");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
