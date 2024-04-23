package com.academy;

public class EvenDigitSum {

    /**
     * Calculates the sum of the even digits within a given number.
     *
     * @param number number to check for even digits.
     * @return the sum of all the even digits within the number argument.
     */
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        return (number < 0) ? -1 : sum;
    }
}