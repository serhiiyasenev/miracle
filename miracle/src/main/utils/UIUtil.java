package main.utils;

import java.util.Scanner;

public class UIUtil {
    public static int readNumber(String message) {
        int result = 0;
        boolean isValid = false;

        do {
            try {
                result = Integer.valueOf(readInput(message));

                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (!isValid);

        return result;
    }

    public static String readInput(String message) {
        System.out.print(message);

        return new Scanner(System.in).nextLine();
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
