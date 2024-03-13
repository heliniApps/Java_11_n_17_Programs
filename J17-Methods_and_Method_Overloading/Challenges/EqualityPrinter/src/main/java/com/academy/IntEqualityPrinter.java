package com.academy;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class IntEqualityPrinter {

    /**
     * Checks whether three given numbers are equal, different from each other,
     * or exhibit a combination of both.
     *
     * @param num1 number to be compared with other parameters.
     * @param num2 number to be compared with other parameters.
     * @param num3 number to be compared with other parameters.
     */
    public static void printEqual(int num1, int num2, int num3) {
        if ((num1 < 0) || (num2 < 0) || (num3 < 0)) {
            System.out.println("Invalid Value");
            return;
        }

        long distinctNumberCount = Stream.of(num1, num2, num3).distinct().count();

        String message = "Neither all are equal or different";
        if (distinctNumberCount == 1) {
            message = "All numbers are equal";
        } else if (distinctNumberCount == 3) {
            message = "All numbers are different";
        }
        System.out.println(message);
    }

    /* Version 2
     * Using "HashSet" to get a distinct number set. */
    public static void printEqualV2(int num1, int num2, int num3) {
        final String ALL_EQUAL = "All numbers are equal";
        final String ALL_DIFF = "All numbers are different";
        final String EQUAL_N_DIFF = "Neither all are equal or different";
        final String INVALID = "Invalid Value";

        HashSet<Integer> distinctNumberSet = new HashSet<>(List.of(num1, num2, num3));

        if ((num1 < 0) || (num2 < 0) || (num3 < 0)) {
            System.out.println(INVALID);
        } else if (distinctNumberSet.size() == 1) {
            System.out.println(ALL_EQUAL);
        } else if (distinctNumberSet.size() == 3) {
            System.out.println(ALL_DIFF);
        } else {
            System.out.println(EQUAL_N_DIFF);
        }
    }

    /* Version 1 */
    public static void printEqualV1(int num1, int num2, int num3) {

        String message = "Neither all are equal or different";
        if ((num1 < 0) || (num2 < 0) || (num3 < 0)) {
            message = "Invalid Value";
        } else if ((num1 == num2) && (num1 == num3)) {
            message = "All numbers are equal";
        } else if ((num1 != num2) && (num2 != num3) && (num1 != num3)) {
            message = "All numbers are different";
        }
        System.out.println(message);
    }
}
