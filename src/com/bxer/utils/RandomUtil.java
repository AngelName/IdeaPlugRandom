package com.bxer.utils;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomUtil {
    public static final Integer getRandom(){
        Random random = new Random();

        System.out.println(random.nextInt(10));
        return 0;
    }

     public static void main(String[] args) {
        RandomUtil.getRandom();
    }
}
