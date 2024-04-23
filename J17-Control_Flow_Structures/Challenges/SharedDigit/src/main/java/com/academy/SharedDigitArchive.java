package com.academy;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Most solutions are only valid for two-digit numbers within the range 10 - 99.
 */
public class SharedDigitArchive {

    /*
     * Version 6:
     * Using Integer Lists that contains digits of each number argument.
     */
    public static boolean hasSharedDigitV6(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
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
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }
        IntPredicate hasMatch = (digit1) ->
                String.valueOf(num2).chars().anyMatch((digit2) -> digit1 == digit2);

        return String.valueOf(num1).chars().anyMatch(hasMatch);
    }

    /*
     * Version 4:
     * Convert each number to a char array and use "flatmap()" to get a Stream of Characters.
     * Check for distinct Characters in the stream.
     */
    public static boolean hasSharedDigitV4(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }
        long distinctChars = Stream.of(String.valueOf(num1).toCharArray(), String.valueOf(num2).toCharArray())
                .flatMap(arr -> Stream.of(arr[0], arr[1]))
                .distinct()
                .count();
        return (distinctChars > 0) && (distinctChars < 4);
    }

    /*
     * Version 3:
     * Convert the numbers into IntStreams containing Integer representation of each character.
     * Next, concatenate the two IntStreams and, map to the original integer digit.
     * Then, check the count of distinct digits.
     */
    public static boolean hasSharedDigitV3(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }
        long distinctDigits = IntStream.concat(String.valueOf(num1).chars(), String.valueOf(num2).chars())
                .map(Character::getNumericValue)
                .distinct()
                .count();

        return (distinctDigits > 0) && (distinctDigits < 4);
    }

    /*
     * Version 2:
     * Use String "contains()" method with the String representation of numbers.
     */
    public static boolean hasSharedDigitV2(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
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
        if ((numA < 10) || (numA > 99) || (numB < 10) || (numB > 99)) {
            return false;
        }
        int numAFirst = numA / 10;
        int numALast = numA % 10;
        int numBFirst = numB / 10;
        int numBLast = numB % 10;

        return (numAFirst == numBFirst) || (numAFirst == numBLast) || (numALast == numBFirst) || (numALast == numBLast);
    }
}
