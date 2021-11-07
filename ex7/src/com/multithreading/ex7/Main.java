package com.multithreading.ex7;

public class Main {
    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();

        Thread t1 = new Thread(() -> {
            while (true) {
                sharedClass.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                sharedClass.checkDataRace();
            }
        });

        t1.start();
        t2.start();
    }
}
