package com.bxer.utils;

import com.bxer.core.RandomNumber;

import java.util.Arrays;
import java.util.Random;

public class RandomUtil {
    public static Random random = new Random();
    public static final Integer getIntRandom(Integer bound){
        return RandomUtil.random.nextInt(bound);
    }
    public static final String getStringRandom(){
return null;

    }
    public  static final String getLetterCharacter(){
        return Character.toString(RandomUtil.random.nextInt(26)+97);
    }
    public static void main(String[] args) {

        for (int i = 0; i < 199; i++) {
            String letterCharacter = RandomUtil.getLetterCharacter();
            System.out.print(letterCharacter+"\t");
        }
    }

    public static String getLetterCharacter8() {
        String  result="";
        for (int i = 0; i < 8; i++) {
            result+= RandomUtil.getLetterCharacter();
        }
        return result;
    }
}
