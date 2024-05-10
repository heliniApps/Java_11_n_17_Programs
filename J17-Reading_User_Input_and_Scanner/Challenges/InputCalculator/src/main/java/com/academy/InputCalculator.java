package com.academy;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        InputCalculator.inputThenPrintSumAndAverage();
    }

    /**
     * Calculates the sum and average of numbers entered by the user.
     * Uses "Scanner.nextInt()" with exception handling.
     */
    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number, or type any character to quit: ");
            try {
                sum += scanner.nextInt();
            } catch (NoSuchElementException ne) {
                scanner.nextLine();
                break;
            }
            count++;
        }
        scanner.close();

        if (count > 0) {
            average = Math.round((double) sum / count);
        }
        System.out.printf("%nSUM = %d AVG = %d %n", sum, average);
    }
}
