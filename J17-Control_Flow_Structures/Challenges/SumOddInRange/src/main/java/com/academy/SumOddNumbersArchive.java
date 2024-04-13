package com.academy;

public class SumOddNumbersArchive {

    /*
     * Version 3:
     * Using a calculation including Math.pow().
     */
    public static int sumOddV3(int start, int end) {
        if ((start <= 0) || (end < start)) {
            return -1;
        }
        int oddNumStart = SumOddNumbers.isOdd(start) ? start : ++start;
        int evenNumEnd = SumOddNumbers.isOdd(end) ? ++end : end;
        return (int) (Math.pow(evenNumEnd / 2, 2) - Math.pow(oddNumStart / 2, 2));
    }

    /*
     * Version 2:
     * Using "for" loop with +1 step.
     */
    public static int sumOddV2(int start, int end) {
        if ((start <= 0) || (end < start)) {
            return -1;
        }
        int sum = 0;
        for (int num = start; num <= end; num++) {
            if (SumOddNumbers.isOdd(num)) {
                sum += num;
            }
        }
        return sum;
    }

    /*
     * Version 1:
     * Different implementation of sumOdd(), using "while" loop.
     */
    public static int sumOddV1(int start, int end) {
        if ((start <= 0) || (end < start)) {
            return -1;
        }
        int sum = 0;
        while (start <= end) {
            if (SumOddNumbers.isOdd(start)) {
                sum += start;
            }
            start++;
        }
        return sum;
    }
}
