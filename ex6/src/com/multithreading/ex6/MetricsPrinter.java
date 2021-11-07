package com.multithreading.ex6;

public class MetricsPrinter extends Thread {

    private Metrics metrics;

    public MetricsPrinter(Metrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            System.out.println("Current average is " + metrics.getAverage());
        }
    }
}
