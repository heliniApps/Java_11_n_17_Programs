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
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }
        return Stream.of(String.valueOf(num1).split(""))
                .anyMatch(String.valueOf(num2)::contains);
    }
}
