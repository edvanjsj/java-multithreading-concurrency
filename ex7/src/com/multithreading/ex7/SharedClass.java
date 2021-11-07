package com.multithreading.ex7;

public class SharedClass {
    private volatile int x = 0;
    private volatile int y = 0;

    public void increment() {
        x++;
        y++;
    }

    public void checkDataRace() {
        if (y > x) {
            System.out.println("y > x - Data race detected!");
        } else {
            System.out.println("ok");
        }
    }
}
