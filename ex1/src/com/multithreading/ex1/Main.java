package com.multithreading.ex1;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vault vault = new Vault(random.nextInt(Vault.MAX_PASSWORD));

        List<Thread> threads = List.of(new AscendingHackerThread(vault), new DescendingHackerThread(vault), new PoliceThread());
        threads.forEach(Thread::start);
    }
}
