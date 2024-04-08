package com.academy;

public class RecursiveNumberPalindrome {

    private static int reverseNumber = 0;

    public static boolean isPalindrome(int number) {
        clearReverseNumber();
        reverse(number);
        return (number == reverseNumber);
    }

    private static int reverse(int number) {
        if (number == 0) {
            return reverseNumber;
        }
        int lastDigit = number % 10;
        reverseNumber = (reverseNumber * 10) + lastDigit;
        return reverse(number / 10);
    }

    private static void clearReverseNumber() {
        reverseNumber = 0;
    }
}
