package com.academy;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ReadWithScanner {

    public static void main(String[] args) {

        readUserInput();
    }

    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat is your name? ");
        String name = scanner.nextLine();

        System.out.println("\nHi, " + name + ". Its nice to see you!");

        System.out.println("\nWhat year were you born? ");

        boolean isValidDOB = false;
        int age = 0;
        int currentYear = LocalDateTime.now().getYear();
        do {
            System.out.println("Please enter a value between " + (currentYear - 125) +
                    " and " + currentYear);
            int yearOfBirth = validateYearOfBirth(currentYear, scanner.nextLine());

            if (yearOfBirth >= 0) {
                age = getAge(currentYear, yearOfBirth);
                isValidDOB = true;
            }
        } while (!isValidDOB);

        System.out.println("\nSo, you are " + age + " years old.");
    }

    public static int validateYearOfBirth(int currentYear, String yearOfBirthStr) {
        int birthYear = 0;
        try {
            birthYear = Integer.parseInt(yearOfBirthStr);
        } catch (NumberFormatException ne) {
            System.out.println("Invalid characters found. Please enter a valid year.");
            return -1;
        }
        int minimumYear = currentYear - 125;
        if ((birthYear > currentYear) || (birthYear < minimumYear)) {
            return -1;
        }
        return birthYear;
    }

    public static int getAge(int currentYear, int userYearOfBirth) {
        return (currentYear - userYearOfBirth);
    }
}