package com.academy;

public class IterativeSharedDigit {

    /*
     * Version 10:
     * Comparing String values using "contains()" method,
     * while iterating through the digits of the first number, using a "while" loop.
     */
    public static boolean hasSharedDigitV10(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        String[] numStrArr = String.valueOf(num1).split("");
        String secondNum = String.valueOf(num2);

        for (String digitStr : numStrArr) {
            if (secondNum.contains(digitStr)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Version 9:
     * Converts the numbers into char arrays.
     * Then, compares the 'char' values, while iterating through a nested "for" loop.
     */
    public static boolean hasSharedDigitV9(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        char[] charArr1 = String.valueOf(num1).toCharArray();
        char[] charArr2 = String.valueOf(num2).toCharArray();

        for (char c1 : charArr1) {
            for (char c2 : charArr2) {
                if (c1 == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Version 8:
     * Using basic calculation, with nested "for" loops.
     */
    public static boolean hasSharedDigitV8(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        for (int i = num1; i > 0; i /= 10) {
            for (int j = num2; j > 0; j /= 10) {
                if ((i % 10) == (j % 10)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Version 7:
     * Using basic calculation, with nested "while" loops.
     */
    public static boolean hasSharedDigitV7(int num1, int num2) {
        if (!isValidNumber(num1) || !isValidNumber(num2)) {
            return false;
        }
        while (num1 > 0) {
            int tempNum2 = num2;
            while (tempNum2 > 0) {
                if ((num1 % 10) == (tempNum2 % 10)) {
                    return true;
                }
                tempNum2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    }

    private static boolean isValidNumber(int number) {
        return SharedDigit.isValidNumber(number);
    }
}
