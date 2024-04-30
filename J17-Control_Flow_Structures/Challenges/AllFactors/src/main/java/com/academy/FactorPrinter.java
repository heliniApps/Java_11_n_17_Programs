package com.academy;

public class FactorPrinter {

    /**
     * Prints out all the factors of a given number.
     *
     * @param number Number to check for all factors.
     */
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int factor = 1; factor <= (number / 2); factor++) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
        }
        System.out.println(number);
    }
}
