package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        printSumAndAverageOfInput();
    }

    /**
     * Accepting user input and, calculating sum and average.
     */
    public static void printSumAndAverageOfInput() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Enter Number: ");

            boolean isIntValue = scanner.hasNextInt();
            if (isIntValue) {
                int number = scanner.nextInt();
                scanner.nextLine();
                counter++;

                sum += number;
            } else {
                System.out.println("Invalid Value");
                scanner.nextLine();
                break;
            }
        }

        double average = (double) sum / (double) counter;
        System.out.println("SUM = "+ sum + " AVG = " + Math.round(average));

        scanner.close();
    }
}
