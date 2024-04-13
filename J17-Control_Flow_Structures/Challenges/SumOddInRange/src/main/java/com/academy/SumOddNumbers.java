package com.academy;

public class SumOddNumbers {

    /**
     * Checks if the given number is an Odd Number.
     *
     * @param number number to be checked.
     * @return true, if the number is larger than 0 and is an odd number.
     */
    public static boolean isOdd(int number) {
        return (number > 0) && (number % 2 != 0);
    }

    /**
     * Sums up the odd numbers in a given range.
     *
     * @param start number at the start of the range.
     * @param end   number at the end of the range.
     * @return sum of all odd numbers in the given range between start (inclusive) and end (inclusive).
     */
    public static int sumOdd(int start, int end) {
        if ((start <= 0) || (end < start)) {
            return -1;
        }
        int oddNumStart = isOdd(start) ? start : ++start;
        int sum = 0;
        for (int n = oddNumStart; n <= end; n += 2) {
            sum += n;
        }
        return sum;
    }
}
