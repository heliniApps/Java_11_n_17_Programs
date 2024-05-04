package com.academy.challenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumInputInteger {

    public static void main(String[] args) {

        int sum = getSum();
        System.out.println("Sum = " + sum);
    }

    private static int getSum() {
        int sum = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter 5 positive numbers to calculate the sum.\n");

        do {
            System.out.printf("Enter number #%d: %n", counter);
            int number = readNumber(scanner);
            if (isValidNumber(number)) {
                sum += number;
                counter++;
            }
        } while (counter <= 5);

        return sum;
    }

    private static int readNumber(Scanner scanner) {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException ie) {
            System.out.println("Invalid characters found. Please enter a valid number.");
            scanner.nextLine();
            return -1;
        }
        return number;
    }

    private static boolean isValidNumber(int number) {
        return (number >= 0);
    }
}
