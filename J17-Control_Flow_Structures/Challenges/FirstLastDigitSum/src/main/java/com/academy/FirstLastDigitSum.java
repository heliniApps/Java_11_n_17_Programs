package com.academy;

public class FirstLastDigitSum {

    /**
     * Calculates the sum of the first and last digits of a given number.
     * <p>
     * Using a "while" loop. Omitting the 'lastDigit' variable (in Version 1).
     * If number is <10, it is the First digit.
     *
     * @param number numeric value to calculate the first and last digits.
     * @return sum of the first and last digits of the given number.
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = number % 10;
        while (number > 9) {
            number /= 10;
        }
        sum += number;

        return sum;
    }
}