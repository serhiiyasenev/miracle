package main.utils;

import java.util.Random;

public class MathUtil {

    public static int generateRandomNumber(int max) {
        return new Random().nextInt(max);
    }
}
