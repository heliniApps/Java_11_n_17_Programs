package com.academy;

import java.util.HashSet;
import java.util.List;

public class LastDigitCheckerArchive {

    /*
     * Version 4:
     * Last digits of each number argument are added to a "HashSet" collection object,
     * which does not accept duplicate elements.
     *
     * Hence, if two or more arguments share the same last digit,
     * the final element count must be less than three.
     */
    public static boolean hasSameLastDigitV4(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        HashSet<Integer> lastDigitSet = new HashSet<>(List.of((num1 % 10), (num2 % 10), (num3 % 10)));
        return (lastDigitSet.size() < 3);
    }

    public static boolean hasSameLastDigitV4_1(int num1, int num2, int num3) {
        HashSet<Integer> lastDigitSet = new HashSet<>(List.of((num1 % 10), (num2 % 10), (num3 % 10)));

        return isValid(num1) && isValid(num2) && isValid(num3) && (lastDigitSet.size() < 3);
    }

    /*
     * Version 3:
     * Using logical operators to compare only the last digits of each number argument.
     */
    public static boolean hasSameLastDigitV3(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;
            int lastDigit3 = num3 % 10;

            return (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);
        }
        return false;
    }

    /*
     * Version 2:
     * Using a basic calculation and a nested 'for' loop.
     * In terms of code performance, this is not the ideal solution.
     */
    public static boolean hasSameLastDigitV2(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        for (int i = num1; i > (num1 / 10); i /= 10) {
            int lastDigit1 = i % 10;

            for (int j = num2; j > (num2 / 10); j /= 10) {
                int lastDigit2 = j % 10;
                if (lastDigit2 == lastDigit1) {
                    return true;
                }

                for (int k = num3; k > (num3 / 10); k /= 10) {
                    int lastDigit3 = k % 10;
                    if ((lastDigit3 == lastDigit2) || (lastDigit3 == lastDigit1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * Version 1:
     * Using a basic calculation and nested 'while' loops.
     */
    public static boolean hasSameLastDigitV1(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int counter = 0;
        int tempNum1 = num1;
        while (tempNum1 > (num1 / 10)) {
            int lastDigit1 = tempNum1 % 10;
            int tempNum2 = num2;

            while (tempNum2 > (num2 / 10)) {
                int tempNum3 = num3;
                int lastDigit2 = tempNum2 % 10;
                if (lastDigit2 == lastDigit1) {
                    counter++;
                }

                while (tempNum3 > (num3 / 10)) {
                    int lastDigit3 = tempNum3 % 10;
                    if ((lastDigit3 == lastDigit2) || (lastDigit3 == lastDigit1)) {
                        counter++;
                    }
                    tempNum3 /= 10;
                }
                tempNum2 /= 10;
            }
            tempNum1 /= 10;
        }

        return (counter >= 1);
    }

    private static boolean isValid(int number) {
        return LastDigitChecker.isValid(number);
    }
}
