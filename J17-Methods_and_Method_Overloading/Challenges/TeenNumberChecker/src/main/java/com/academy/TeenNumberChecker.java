package com.academy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TeenNumberChecker {

    /**
     * @param number numeric value to validate.
     * @return returns true, if the given number is between 13 and 19 (inclusive).
     */
    public static boolean isTeen(int number) {
        return (number >= 13) && (number <= 19);
    }

    /**
     * Checks if a number in a given set of values, is a "teen" number,
     * meaning if it's between 13 and 19.
     *
     * @param num1 numeric value to validate.
     * @param num2 numeric value to validate.
     * @param num3 numeric value to validate.
     * @return returns true, if at least one of the given numeric values is a 'teen' number.
     */
    public static boolean hasTeen(int num1, int num2, int num3) {
        return IntStream.of(num1, num2, num3).anyMatch(TeenNumberChecker::isTeen);
    }

    /* hasTeen() -> Version 3 */
    public static boolean hasTeenV3(int num1, int num2, int num3) {
        return List.of(num1, num2, num3)
                .stream()
                .anyMatch(TeenNumberChecker::isTeen);
    }

    /* hasTeen() -> Version 2 */
    public static boolean hasTeenV2(int num1, int num2, int num3) {
        return Arrays.asList(num1, num2, num3)
                .stream()
                .anyMatch((number) -> isTeen(number));
    }

    /* hasTeen() -> Version 1 */
    public static boolean hasTeenV1(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }
}
