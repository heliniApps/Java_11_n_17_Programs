package com.academy.challenges;

public class SumDivisibleByThreeAndFive {

    public static void main(String[] args) {

        printDivisibleByThreeAndFive();
    }

    /*
     * Get the sum of all the numbers that are divisible by 3 & 5,
     * within the range 1 - 1000.
     * Break out of the loop after it finds 5 matches.
     */
    public static void printDivisibleByThreeAndFive() {
        int sum = 0;
        int counter = 0;

        for (int i = 1; (i <= 1000) && (counter < 5); i++) {
            if (isDivisibleByThreeAndFive(i)) {
                sum += i;
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("\nTotal = " + sum + "\n");
    }

    public static boolean isDivisibleByThreeAndFive(int number) {
        return (number % 3 == 0) && (number % 5 == 0);
    }
}
