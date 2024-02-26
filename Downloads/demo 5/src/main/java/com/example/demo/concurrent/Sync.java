package com.example.demo.concurrent;

public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Sync s1 = new Sync();
        Sync s2 = new Sync();

        Thread t1 = new Thread(()-> {
            try {
                s1.classLevelLockMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                s2.classLevelLockMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }

    public synchronized void instanceLevelLockMethod() throws InterruptedException {
        System.out.println("Inside method. Waiting");
        Thread.sleep(5000);

    }

    public static synchronized void classLevelLockMethod() throws InterruptedException {
        System.out.println("Inside method. Waiting");
        Thread.sleep(5000);

    }


    public void objectLevelLock() throws InterruptedException {
        synchronized (this) {
            System.out.println("Inside object level locking. waiting...");
            Thread.sleep(5000);
        }
    }
}
