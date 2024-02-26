package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer pc = new ProducerConsumer();

        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t1.join();
    }
}


class ProducerConsumer {
    private List<String> data = new ArrayList<>();
    private int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (data.size() == capacity) {
                    wait();
                }
                System.out.println("Produced data - " + value);
                data.add(String.valueOf(value++));
                notify();
                Thread.sleep(1000);
            }
        }

    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (data.isEmpty()) {
                    wait();
                }
                System.out.println("Consumed data - " + data.remove(0));
                notify();
                Thread.sleep(1000);
            }
        }
    }

}

