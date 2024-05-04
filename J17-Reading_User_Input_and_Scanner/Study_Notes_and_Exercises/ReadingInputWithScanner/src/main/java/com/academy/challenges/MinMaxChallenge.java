package com.academy.challenges;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        // printMinAndMaxValues();

        printMinAndMaxWithNegative();
    }

    private static void printMinAndMaxWithNegative() {
        double min = 0;
        double max = 0;
        double counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter numbers to check the minimum and maximum.");
        System.out.println("Type any character to quit. (e.g.: a, b, c,... etc)\n");

        while (true) {
            System.out.println("Enter a number: ");
            double number = 0;
            try {
                number = scanner.nextDouble();
            } catch (NoSuchElementException ne) {
                System.out.println("Invalid number. Exiting program.");
                scanner.nextLine();
                break;
            }
            min = (counter == 0) || (number < min) ? number : min;
            max = (counter == 0) || (number > max) ? number : max;
            counter++;
        }

        if (counter > 0) {
            System.out.printf("%nMin = %1$f %nMax = %2$f %n", min, max);
        } else {
            System.out.println("\nNo valid number entered.");
        }
    }

    private static void printMinAndMaxValues() {
        double min = 0;
        double max = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter numbers to check the minimum and maximum.");
        System.out.println("Type any character to quit. (e.g.: a, b, c,... etc)\n");

        while (true) {
            System.out.println("Enter a positive number: ");
            double number = readNumber(scanner);
            if (!isValidNumber(number)) {
                break;
            }
            if ((counter == 0) || (number < min)) {
                min = number;
            }
            if ((counter == 0) || (number > max)) {
                max = number;
            }
            counter++;
        }

        if (counter > 0) {
            System.out.println("\nMin = " + min);
            System.out.println("Max = " + max);
        } else {
            System.out.println("\nNo valid data entered.");
        }
    }

    private static double readNumber(Scanner scanner) {
        double number = 0;
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid number. Exiting program.");
            scanner.nextLine();
            return -1;
        }
        return number;
    }

    private static boolean isValidNumber(double number) {
        return (number >= 0);
    }
}
