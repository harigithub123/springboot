package com.example.demo.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountPrimeNumbersUnequalWork {

    public static void main(String[] args) throws InterruptedException {
        CountPrimeNumbersUnequalWork thread = new CountPrimeNumbersUnequalWork();
        thread.countPrimerNumbers(100000000);
    }

    public void countPrimerNumbers(int lastNumber) throws InterruptedException {
        int blockSize = lastNumber / 10;
        int startRange = 3;
        int endRange = blockSize;
        List<Thread> threadList = new ArrayList<>();
        List<CountPrimeNumbers> countPrimeNumbersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            countPrimeNumbersList.add(i, new CountPrimeNumbers(startRange, endRange));
            Thread t = new Thread(countPrimeNumbersList.get(i), String.valueOf(i));
            threadList.add(t);
            t.start();
            startRange = endRange + 1;
            endRange = endRange + blockSize;
        }
        int totalPrimerNumbers = 1;
        for (Thread t : threadList) {
            t.join();
        }
        for (CountPrimeNumbers countPrimeNumbers : countPrimeNumbersList) {
            totalPrimerNumbers += countPrimeNumbers.getCount();
        }
        System.out.println(totalPrimerNumbers);
    }
}

class CountPrimeNumbers implements Runnable {
    private AtomicInteger primeNumberCount = new AtomicInteger();
    private int startRange;
    private int endRange;

    public CountPrimeNumbers(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    @Override
    public void run() {
        for (int j = startRange; j <= endRange; j++) {
            if (isPrimeNumber(j)) {
                primeNumberCount.incrementAndGet();
            }
        }
        System.out.println("Completed execution for thread " + this.toString());
    }

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getCount() {
        return primeNumberCount.get();
    }
}
