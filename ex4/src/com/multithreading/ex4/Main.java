package com.multithreading.ex4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    private static final String INPUT_FILE = "./ex4/resources/war_and_peace.txt";
    private static final int NUM_OF_THREADS = 4;

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Path.of(INPUT_FILE)));
        ThroughputHttpServer.startServer(text, NUM_OF_THREADS);
    }
}
