package com.academy;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public int[] getIntegers(int arraySize) {

        int[] numberArray = new int[arraySize];

        System.out.println("Enter " + arraySize + " whole numbers: ");

        for (int i=0; i < arraySize; i++) {
            boolean isIntValue = scanner.hasNextInt();

            if (isIntValue) {
                int number = scanner.nextInt();
                numberArray[i] = number;
            } else {
                System.out.println("Invalid value. Please enter a valid whole number.");
            }
            scanner.nextLine();
        }

        return numberArray;
    }

    public void printArray(int[] numberArray) {

        for (int i=0; i < numberArray.length; i++) {
            System.out.println("Element " + i + " contents "+ numberArray[i]);
        }
    }

    public int[] sortDescending(int[] numberArray) {

        int[] sortedArray = Arrays.copyOf(numberArray, numberArray.length);
        Arrays.sort(sortedArray);

        int[] descArray = new int[sortedArray.length];

        for (int i=0; i < sortedArray.length; i++) {
            int sortedArrIndex = sortedArray.length - (i + 1);
            descArray[i] = sortedArray[sortedArrIndex];
        }

        return descArray;
    }

    /**
     * copy and manually sort in descending order.
     */
    public int[] manualSortDescending(int[] numberArray) {

        int[] sortedArray = new int[numberArray.length];

        // copy elements to sorted array.
        for (int i=0; i < numberArray.length; i++) {
            sortedArray[i] = numberArray[i];
        }

        // sort
        boolean isSwapped = true;

        while (isSwapped) {
            isSwapped = false;

            for (int i=0; i < (sortedArray.length - 1); i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    isSwapped = true;

                    // Option 1: swap without a temp variable.
                    sortedArray[i] = sortedArray[i+1] + sortedArray[i];
                    sortedArray[i+1] = sortedArray[i] - sortedArray[i+1];
                    sortedArray[i] = sortedArray[i] - sortedArray[i+1];

                    //Option 2: using temp variable.
//                    int temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
                }
            }
        }

        return sortedArray;
    }
}
