package com.academy;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/*
 * Most solutions are only valid for two-digit numbers within the range 10 - 99.
 */
public class SharedDigitArchive {

    /*
     * Version 6:
     * Using Integer Lists that contains digits of each number argument.
     */
    public static boolean hasSharedDigitV6(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        List<Integer> list1 = Arrays.asList((num1 / 10), (num1 % 10));
        List<Integer> list2 = Arrays.asList((num2 / 10), (num2 % 10));

        return list1.stream().anyMatch(list2::contains);
    }

    /*
     * Version 5:
     * Check if there's any match, using an IntStream of characters of the first number,
     * against the characters of the second number.
     * Directly compares the int representation of the char.
     *
     * Solution valid for numbers of any length.
     */
    public static boolean hasSharedDigitV5(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        IntPredicate hasMatch = (digit1) ->
                String.valueOf(num2).chars().anyMatch((digit2) -> digit1 == digit2);

        return String.valueOf(num1).chars().anyMatch(hasMatch);
    }

    /*
     * Version 2:
     * Use String "contains()" method with the String representation of numbers.
     */
    public static boolean hasSharedDigitV2(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        String firstDigit = "" + (num1 / 10);
        String lastDigit = "" + (num1 % 10);
        String secondNum = "" + num2;

        return secondNum.contains(firstDigit) || secondNum.contains(lastDigit);
    }

    /*
     * Version 1:
     * Calculate first and last digits of both numbers and, compare using logical operators.
     */
    public static boolean hasSharedDigitV1(int numA, int numB) {
        if (!isValidNumber(numA) || !isValidNumber(numB)) {
            return false;
        }
        int numAFirst = numA / 10;
        int numALast = numA % 10;
        int numBFirst = numB / 10;
        int numBLast = numB % 10;

        return (numAFirst == numBFirst) || (numAFirst == numBLast) || (numALast == numBFirst) || (numALast == numBLast);
    }

    private static boolean isValidNumber(int number) {
        return SharedDigit.isValidNumber(number);
    }
}
