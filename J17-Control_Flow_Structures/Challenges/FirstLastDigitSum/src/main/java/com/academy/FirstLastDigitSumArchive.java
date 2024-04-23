package com.academy;

public class FirstLastDigitSumArchive {

    /*
     * Version 6:
     * Using String and charAt() of ASCII characters.
     * Offset by 48, where character '0' equals to 48.
     * (Referred from an online solution)
     */
    public static int sumFirstAndLastDigitV6(int number) {
        String numStr = "" + number;
        int first = (int) numStr.charAt(0) - 48;
        int last = (int) numStr.charAt(numStr.length() - 1) - 48;

        return (number < 0) ? -1 : (first + last);
    }

    /*
     * Version 5:
     * Using a String Array and Integer.parseInt().
     * Splitting the String representation of the 'number'.
     */
    public static int sumFirstAndLastDigitV5(int number) {
        if (number < 0) {
            return -1;
        }
        String[] numArr = Integer.toString(number).split("");
        return Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[numArr.length - 1]);
    }

    /*
     * Version 4:
     * Using 'String' manipulation, with substring() and Integer.parseInt().
     */
    public static int sumFirstAndLastDigitV4(int number) {
        if (number < 0) {
            return -1;
        }
        String numStr = String.valueOf(number);
        int first = Integer.parseInt(numStr.substring(0, 1));
        int last = Integer.parseInt(numStr.substring(numStr.length() - 1));
        return (first + last);
    }

    /*
     * Version 3:
     * Using a "for" loop.
     */
    public static int sumFirstAndLastDigitV3(int number) {
        int sum = number % 10;
        for (; number > 0; number /= 10) {
            if (number < 10) {
                sum += number % 10;
            }
        }
        return (number < 0) ? -1 : sum;
    }

    /*
     * Version 2:
     * Refining the logic in "do-while" loop, in the "Version 1" solution.
     */
    public static int sumFirstAndLastDigitV2(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        do {
            firstDigit = number % 10;
            number /= 10;
        } while (number > 0);

        return (firstDigit + lastDigit);
    }

    /*
     * Version 1:
     * Using a "do-while" loop, to calculate the sum of first and last digits.
     */
    public static int sumFirstAndLastDigitV1(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = number % 10;
        do {
            int lastDigit = number % 10;
            number /= 10;
            if (number == 0) {
                sum += lastDigit;
            }
        } while (number > 0);

        return sum;
    }
}
