package com.academy;

import java.util.stream.Stream;

public class SharedDigit {

    /**
     * Checks if there's a digit that appears in both numbers.
     *
     * @param num1 First number to check.
     * @param num2 Second number to check.
     * @return True, if there's a common digit that appears in both numbers.
     */
    public static boolean hasSharedDigit(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        return Stream.of(String.valueOf(num1).split(""))
                .anyMatch(String.valueOf(num2)::contains);
    }

    /**
     * Validates if the input number argument is within the valid range.
     *
     * @param number Numeric value to validate.
     * @return True, if the value is within the range 10 (inclusive) - 99 (inclusive).
     */
    public static boolean isValidNumber(int number) {
        return (number >= 10) && (number <= 99);
    }
}
