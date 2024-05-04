package com.academy;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingScannerMethods {

    public static void main(String[] args) {

        readInputAsInt();
    }

    public static void readInputAsInt() {
        Scanner scanner = new Scanner(System.in);
        boolean isValidDOB = false;
        int currentYear = LocalDateTime.now().getYear();
        int age = 0;

        System.out.println("\nWhat year were you born? ");
        do {
            System.out.printf("Please enter a year between %d and %d.%n",
                    (currentYear - 125), currentYear);

            int yearOfBirth = 0;
            try {
                yearOfBirth = scanner.nextInt();
            } catch (InputMismatchException ie) {
                System.out.println("Invalid year. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }
            isValidDOB = isValidYear(currentYear, yearOfBirth);
            age = !isValidDOB ? 0 : getAge(currentYear, yearOfBirth);

        } while (!isValidDOB);

        System.out.println("\nSo, you are " + age + " years old.");
    }

    public static boolean isValidYear(int currentYear, int yearOfBirth) {
        int minimumYear = currentYear - 125;
        return (yearOfBirth >= minimumYear) && (yearOfBirth <= currentYear);
    }

    public static int getAge(int currentYear, int yearOfBirth) {
        return (currentYear - yearOfBirth);
    }
}
