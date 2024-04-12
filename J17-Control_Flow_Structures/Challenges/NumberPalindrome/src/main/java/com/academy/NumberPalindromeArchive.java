package com.academy;

public class NumberPalindromeArchive {

    /*
     * Version 4:
     * Using 'StringBuilder' and, comparing original and reversed number String
     * with "compareTo()" method.
     */
    public static boolean isPalindromeV4(int number) {
        String numberStr = "" + Math.abs(number);
        StringBuilder numberSb = new StringBuilder(numberStr);
        StringBuilder reverseSb = new StringBuilder(numberStr).reverse();

        return numberSb.compareTo(reverseSb) == 0;
    }

    /*
     * Version 3:
     * Using the StringBuilder class. Inbuilt "<StringBuilder Obj>.reverse()" method.
     */
    public static boolean isPalindromeV3(int number) {
        int positiveNumber = Math.abs(number);
        StringBuilder numberStr = new StringBuilder(String.valueOf(positiveNumber));
        int reverseNumber = Integer.parseInt(numberStr.reverse().toString());

        return (positiveNumber == reverseNumber);
    }

    /*
     * Version 2:
     * Iterate the digits of the given 'number' and, creates a new variable with the reversed digits.
     * Then, compares the original number and the reversed value.
     * 'Number' is a Palindrome, if the original number equals to the value when it is reversed.
     * */
    public static boolean isPalindromeV2(int number) {
        // Math.abs(Integer.MIN_VALUE) will return a negative number.
        // Number will not be reversed due to "number > 9" condition.
        // Reversing the Integer.MAX_VALUE causes an overflow.

        number = Math.abs(number);
        final int originalNumber = number;
        int reversedNum = 0;

        while (number > 9) {
            int lastDigit = number % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            number = number / 10;
        }
        reversedNum = (reversedNum * 10) + number;

        return (originalNumber == reversedNum);
    }

    /*
     * Version 1:
     * Converts the 'number' to a String, and then,
     * compares the numbers from the start of string, with the ones at the end,
     * moving towards the center of the number.
     */
    public static boolean isPalindromeV1(int number) {

        String numberStr = String.valueOf(number);
        if (number < 0) {
            numberStr = numberStr.substring(1);
        }
        int length = numberStr.length();

        for (int i = 0; i <= (length / 2); i++) {
            char digitFromStart = numberStr.charAt(i);
            char digitFromEnd = numberStr.charAt((length - 1) - i);
            if (digitFromStart != digitFromEnd) {
                return false;
            }
        }
        return true;
    }
}
