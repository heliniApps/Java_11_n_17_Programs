package com.academy.challenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumInputDouble {

    public static void main(String[] args) {

        double sum = getSum();
        System.out.println("Double Sum= " + sum);
    }

    private static double getSum() {
        double sum = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            double number = readNumber(scanner);
            if (isValidNumber(number)) {
                sum += number;
                counter++;
            }
        }
        return sum;
    }

    private static double readNumber(Scanner scanner) {
        double number = 0;
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException ie) {
            System.out.println("Invalid real number.");
            scanner.nextLine();
            return -1;
        }
        return number;
    }

    private static boolean isValidNumber(double number) {
        return (number >= 0);
    }
}
