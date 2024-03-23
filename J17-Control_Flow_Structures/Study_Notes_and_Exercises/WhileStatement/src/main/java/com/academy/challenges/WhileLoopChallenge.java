package com.academy.challenges;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        printEvenNumbers();
//        printEvenNumbersV2();
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

    /* Version 1  ->  my solution. */
    public static void printEvenNumbers() {
        int number = 5;
        int evenCounter = 0;
        int oddCounter = 0;

        while ((number <= 20) && (evenCounter < 5)) {
            if (isEvenNumber(number)) {
                evenCounter++;
                System.out.println("even number = " + number);
            } else {
                oddCounter++;
            }
            number++;
        }
        System.out.println("Even Number Count = " + evenCounter);
        System.out.println("Odd Number Count = " + oddCounter);
    }

    /* Version 2 */
    public static void printEvenNumbersV2() {
        int number = 4;
        int rangeEnd = 20;
        int evenCounter = 0;
        int oddCounter = 0;

        while (number <= rangeEnd) {
            number++;
            if (!isEvenNumber(number)) {
                oddCounter++;
                continue;
            }
            System.out.println("Even num = " + number);
            evenCounter++;
            if (evenCounter == 5) {
                break;
            }
        }
        System.out.println("Even number count = " + evenCounter);
        System.out.println("Odd number count = " + oddCounter);
    }
}
