package com.academy.challenges;

public class PrimeNumberChallenge {

    public static void main(String[] args) {

        printPrimeNumbers(500, 1000);
        System.out.println();
        printPrimeNumbers(40, 100);

        System.out.println("\n printPrimeNumbersV2() :: ");
        printPrimeNumbersV2(200, 500);
    }

    // Version 1:
    public static boolean isPrimeNumber(int number) {
        /* Whole numbers less than 2 are not Prime Numbers. (negative values, 0, 1) */
        if (number <= 1) {
            return false;
        }
        for (int divisor = (number / 2); divisor > 1; divisor--) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    // Version 2:
    public static boolean isPrimeNumberV2(int number) {
        /*
         * Checks if the given number is <= to 2, because [0, 1, negative numbers] are NOT prime numbers.
         * Returning (number == 2), because "2" is the smallest Prime Number.
         * So, if the argument number is 2, we should return 'true'.
         */
        if (number <= 2) {
            return (number == 2);
        }

        for (int divisor = 2; divisor <= (number / 2); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /* Version 1 ->
     * checking the "counter" inside the FOR loop. */
    public static void printPrimeNumbers(int rangeStart, int rangeEnd) {
        int primeCounter = 0;

        for (int num = rangeStart; num <= rangeEnd; num++) {
            if (isPrimeNumber(num)) {
                primeCounter++;
                System.out.println(num);
            }
            if (primeCounter >= 15) {
                break;
            }
        }
    }

    /* Version 2 ->
     * Check the "counter" condition in the FOR loop's "expression". */
    public static void printPrimeNumbersV2(int rangeStart, int rangeEnd) {
        int primeCounter = 0;

        for (int num = rangeStart; (num <= rangeEnd) && (primeCounter < 15); num++) {
            if (isPrimeNumber(num)) {
                primeCounter++;
                System.out.println(num);
            }
        }
    }
}
