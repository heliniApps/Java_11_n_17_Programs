package com.academy;

import java.util.Scanner;

public class MinimumElement {

    private Scanner scanner;

    public MinimumElement() {
        scanner = new Scanner(System.in);
    }

    public int readCount() {

        int count = 0;

        System.out.println("Enter the count of elements: ");

        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
        } else {
            System.out.println("Invalid value.");
        }
        scanner.nextLine();

        return count;
    }

    public int[] readElements(int count) {

        int[] numberArray = new int[count];

        System.out.println("Enter " + count + " numbers: ");

        for(int i=0; i < numberArray.length; i++) {

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numberArray[i] = number;
            } else {
                System.out.println("Invalid value.");
            }
            scanner.nextLine();
        }

        return numberArray;
    }

    public int findMinimum(int[] numberArray) {
        int minNumber = numberArray[0];

        for (int i=0; i < numberArray.length; i++) {
            if (numberArray[i] < minNumber) {
                minNumber = numberArray[i];
            }
        }

        return minNumber;
    }

    public void closeInputStream() {
        scanner.close();
    }
}
