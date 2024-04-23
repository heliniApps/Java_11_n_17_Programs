package com.academy;

import java.util.stream.Stream;

public class EvenDigitSumArchive {

    /*
     * Version 4:
     * Using a Stream of Strings and, mapping it back to an IntStream.
     */
    public static int getEvenDigitSumV4(int number) {
        if (number < 0) {
            return -1;
        }
        return Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .filter((num) -> num % 2 == 0)
                .sum();
    }

    /*
     * Version 3:
     * Converts the String value of 'number' argument, into an IntStream of Characters.
     * Then, map it to the digit's numeric value.
     */
    public static int getEvenDigitSumV3(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .filter((num) -> (num % 2) == 0)
                .sum();
    }

    /*
     * Version 2:
     * Expanding ternary operator into an 'if' statement.
     */
    public static int getEvenDigitSumV2(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return (number < 0) ? -1 : sum;
    }

    /*
     * Version 1:
     */
    public static int getEvenDigitSumV1(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += (lastDigit % 2 != 0) ? 0 : lastDigit;
            number /= 10;
        }
        return (number < 0) ? -1 : sum;
    }
}
