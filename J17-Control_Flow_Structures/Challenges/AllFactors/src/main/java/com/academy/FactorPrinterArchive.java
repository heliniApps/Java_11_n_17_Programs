package com.academy;

public class FactorPrinterArchive {

    /*
     * Version 3:
     * Prints the space separated factors in a single line.
     */
    public static void printFactorsV3(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        StringBuilder factorSb = new StringBuilder();
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                factorSb.append(i).append(" ");
            }
        }
        factorSb.append(number);
        System.out.println(factorSb.toString().trim());
    }

    /*
     * Version 2
     */
    public static void printFactorsV2(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
        }
    }

    /*
     * Version 1:
     * Iterating through all numbers within the range [1 - number].
     */
    public static void printFactorsV1(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        int factor = 1;
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
            factor++;
        }
    }
}
