package com.bxer.utils;

import java.util.Random;

public class RandomColor {
    public static Random random = new Random();

    private static final String randomColorHex(){
        Integer i = random.nextInt(255);
        return Integer.toHexString(i);
    }
    public static final String randomColor(){
        String hexColor = "#";
        for (int i = 0; i < 3; i++) {
            hexColor+=RandomColor.randomColorHex();
        }
        return hexColor;
    }
    public static void main(String[] args) {
        System.out.println(RandomColor.randomColor());
    }
}
