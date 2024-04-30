package com.academy;

import java.util.stream.IntStream;

public class LastDigitChecker {

    /**
     * Checks if the specified number is within a valid range.
     *
     * @param number Number to validate.
     * @return True, if the given number is within the range 10 (inclusive) - 1000 (inclusive).
     */
    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }

    /**
     * Checks if at least two of the numbers have the same rightmost digit.
     *
     * @param num1 Number to compare last digit.
     * @param num2 Number to compare last digit.
     * @param num3 Number to compare last digit.
     * @return True, if at least two of the numbers have the same last digit or rightmost digit.
     */
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        long distinctDigits = IntStream.of(num1, num2, num3)
                .map((num) -> num % 10)
                .distinct()
                .count();
        return (distinctDigits < 3);
    }
}
