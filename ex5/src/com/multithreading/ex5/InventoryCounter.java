package com.multithreading.ex5;

public class InventoryCounter {
    private int items = 0;

    public synchronized void increment() {
        items++;
    }

    public synchronized void decrement() {
        items--;
    }

    public int getItems() {
        return items;
    }
}
