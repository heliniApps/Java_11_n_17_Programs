package com.academy;

public class RecursiveNumberPalindrome {

    private static int reverseNumber = 0;

    public static int reverse(int number) {
        if (number == 0) {
            int reversed = reverseNumber;
            reverseNumber = 0;
            return reversed;
        }
        int lastDigit = number % 10;
        reverseNumber = (reverseNumber * 10) + lastDigit;

        return reverse(number / 10);
    }

    public static boolean isPalindrome(int number) {
        int reversedNum = reverse(number);
        return (number == reversedNum);
    }
}
