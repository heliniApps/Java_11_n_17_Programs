package com.academy;

/**
 * A palindrome number is, a number which when reversed is equal to the original number.
 * For example: 121, 12321, 1001 etc.
 */
public class NumberPalindrome {

    /**
     * Checks if a number is a palindrome.
     * <p>
     * Logic to reverse a number:
     * Get the least significant digit (last digit).
     * Increase the place value of the 'reversed number' by one and, add the 'last digit'.
     * Remove the last digit from the 'number'.
     * Repeat above steps.
     *
     * @param number numeric value to be checked.
     * @return true, if the given number is a Palindrome.
     */
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        return (originalNumber == reversedNumber);
    }
}
