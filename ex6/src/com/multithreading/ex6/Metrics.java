package com.multithreading.ex6;

public class Metrics {
    private long count = 0;
    private volatile double average = 0;

    public synchronized void addSample(long sample) {
        double currentSum = count * average;
        count++;
        average = (currentSum + sample) / count;
    }

    public double getAverage() {
        return average;
    }
}
