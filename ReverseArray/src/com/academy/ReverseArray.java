package com.academy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private Scanner scanner;

    public ReverseArray() {
        scanner = new Scanner(System.in);
    }

    /**
     * Option 1: Reversing elements by copying the elements to a temporary array.
     */
    public void reverse_version1(int[] numberArray) {

        System.out.println("Array = " + Arrays.toString(numberArray));

        int[] originalArray = Arrays.copyOf(numberArray, numberArray.length);
        int reverseIndex = originalArray.length - 1;

        if (reverseIndex >= 0) {
            for (int i=0; i < originalArray.length; i++) {
                numberArray[reverseIndex] = originalArray[i];
                reverseIndex--;
            }
        }

        System.out.println("Reversed array = " + Arrays.toString(numberArray));
    }

    /**
     * Option 2: Modify the original array by swapping elements.
     */
    public void reverse_version2(int[] numberArray) {

        System.out.println("Array = " + Arrays.toString(numberArray));

        for (int i=0; i < (numberArray.length / 2); i++) {
            int reverseIndex = numberArray.length - (i + 1);

            int temp = numberArray[i];
            numberArray[i] = numberArray[reverseIndex];
            numberArray[reverseIndex] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(numberArray));
    }

    public int readCount() {

        int count = 0;
        System.out.println("Enter the count of array elements: ");

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

        for (int i=0; i < numberArray.length; i++) {
            if(scanner.hasNextInt()) {
                numberArray[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid Value.");
            }
            scanner.nextLine();
        }

        return numberArray;
    }

    public void closeInputSteam() {
        scanner.close();
    }

}
