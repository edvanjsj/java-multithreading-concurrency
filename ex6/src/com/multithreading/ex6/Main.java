package com.multithreading.ex6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Metrics metrics = new Metrics();

        List<Thread> threads = List.of(new BusinessLogic(metrics),
                                       new BusinessLogic(metrics),
                                       new BusinessLogic(metrics),
                                       new BusinessLogic(metrics),
                                       new BusinessLogic(metrics),
                                       new BusinessLogic(metrics),
                                       new MetricsPrinter(metrics));

        threads.forEach(Thread::start);
    }
}
