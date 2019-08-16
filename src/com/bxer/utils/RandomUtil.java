package com.bxer.utils;

import com.bxer.core.RandomNumber;

import java.util.Arrays;
import java.util.Random;

public class RandomUtil {
    public static Random random = new Random();

    public static final Integer getIntRandom(Integer bound) {
        return RandomUtil.random.nextInt(bound);
    }

    public static final String getPasswordRandom() {
        String password = "";
        for (int i = 0; i < 16; i++) {
            password +=Character.toString(RandomUtil.random.nextInt(33) + 93);
        }
        return password;
    }

    private static final String getLetterCharacter() {
        return Character.toString(RandomUtil.random.nextInt(26) + 97);
    }

    private static final String getUpperCharacter() {
        return Character.toString(RandomUtil.random.nextInt(26) + 65);
    }

    public static String getLetterCharacter8() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += RandomUtil.getLetterCharacter();
        }
        return result;
    }
    public static String getUpperCase8() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += RandomUtil.getUpperCharacter();
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.print(getPasswordRandom());
        }
    }
}
