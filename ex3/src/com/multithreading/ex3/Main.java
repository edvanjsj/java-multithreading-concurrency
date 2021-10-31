package com.multithreading.ex3;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    private static final String SOURCE_FILE = "./ex3/resources/flowers.jpg";
    private static final String DESTINATION_FILE = "./ex3/resources/flowers-out.jpg";

    public static void main(String[] args) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File(SOURCE_FILE));
        BufferedImage resultImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);

        long start = System.currentTimeMillis();

        ImageUtil.recolorImage(originalImage, resultImage, 1);

        long stop = System.currentTimeMillis();

        System.out.println(String.format("Single thread took %d milliseconds to finish the operation", stop-start));

        start = System.currentTimeMillis();

        int numberOfThreads = 4;
        ImageUtil.recolorImage(originalImage, resultImage, numberOfThreads);

        stop = System.currentTimeMillis();

        System.out.println(String.format("%d threads took %d milliseconds to finish the operation", numberOfThreads, stop-start));

        File output = new File(DESTINATION_FILE);
        ImageIO.write(resultImage, "jpg", output);
    }
}
