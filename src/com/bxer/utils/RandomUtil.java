package com.bxer.utils;

import java.util.Arrays;
import java.util.Random;

public class RandomUtil {
    public static final Integer getIntRandom(Integer bound){
        Random random = new Random();
        return random.nextInt(bound);
    }
}
