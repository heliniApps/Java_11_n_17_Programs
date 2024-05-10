package com.academy;

import java.util.Scanner;

public class InputCalculatorArchive {

    public static void main(String[] args) {

//        inputThenPrintSumAndAverageV2();

        inputThenPrintSumAndAverageV3();
    }

    /*
     * Version 3:
     * Refactoring solution Version_2. Using "hasNextInt()" as the loop condition.
     */
    private static void inputThenPrintSumAndAverageV3() {
        int sum = 0;
        long average = 0;
        double count = 0;
        Scanner scanner = new Scanner(System.in);
        String message = "Enter a number, or type any character to quit: ";

        System.out.println(message);
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            System.out.println(message);
        }
        scanner.close();

        average = Math.round(sum / count);
        System.out.printf("%nSUM = %d AVG = %d %n", sum, average);
    }

    /*
     * Version 2:
     * Uses "Scanner.hasNextInt()" to verify if the input is a valid Integer.
     */
    private static void inputThenPrintSumAndAverageV2() {
        int sum = 0;
        long average = 0;
        double count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number, or type any character to quit: ");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                scanner.nextLine();
                break;
            }
        }
        scanner.close();

        average = Math.round(sum / count);
        System.out.printf("%nSUM = %d AVG = %d %n", sum, average);
    }
}
