package com.academy.challenges;

public class DigitSumChallenge {

    /**
     * Calculate the sum of all the digits in a given number.
     *
     * @param number number to calculate the sum of digits.
     * @return sum of individual digits.
     */
    public static int sumDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number /= 10;
        }
        sum += number;

        return sum;
    }

    /* Version 3  ->
     * Revised the 'Version 1' code using "do-while" loop, to make it more concise. */
    public static int sumDigitV3(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        do {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        } while (number > 0);

        return sum;
    }

    /* Version 2  ->
     * using "while" loop */
    public static int sumDigitV2(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        boolean isDivisibleByTen = true;
        while (isDivisibleByTen) {
            int nextNumber = number / 10;
            if (nextNumber == 0) {
                isDivisibleByTen = false;
                sum += number;
            } else {
                int lastDigit = number % 10;
                sum += lastDigit;
                number = nextNumber;
            }
        }
        return sum;
    }

    /* Version 1  ->
     * Calculating the sum of the digits, using "do-while" loop. */
    public static int sumDigitV1(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        boolean isDivisibleByTen = true;
        do {
            int nextNumber = number / 10;
            if (nextNumber > 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number = nextNumber;
            } else {
                isDivisibleByTen = false;
                sum += number;
            }
        } while (isDivisibleByTen);

        return sum;
    }
}
