package academy.learnprogramming;

public class PalindromeNumber {

    /**
     * A palindrome number is a number which when reversed is equal to the original number. For example: 121.
     *
     * @param number - Number to be checked if it is a Palindrome.
     * @return - Returns true, if the given number is a palindrome. Otherwise, returns false.
     */
    static boolean isPalindrome(int number) {

        int reversedNumber = getReversedNumber(number);

        return (number == reversedNumber);
    }

    /**
     * Reverse the digits of a given integer number.
     * @param number - Value which, the digits need to be reversed.
     * @return - Returns an integer number, resulting from reversing the digits of the argument 'number'.
     */
    static int getReversedNumber(int number) {

        int reversedNumber = 0;
        int lastDigit = 0;
        boolean isNegativeNumber = false;

        if (number < 0) {
            isNegativeNumber = true;
            number *= -1;
        }

        while (number > 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        if (isNegativeNumber) {
            reversedNumber *= -1;
        }

        return reversedNumber;
    }
}
