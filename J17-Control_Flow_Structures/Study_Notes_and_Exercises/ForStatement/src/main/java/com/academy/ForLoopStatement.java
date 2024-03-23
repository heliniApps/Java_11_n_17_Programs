package com.academy;

public class ForLoopStatement {

    public static void main(String[] args) {

        basicForLoopExample1();
        miniChallenge();
        // neverEndingLoop();
    }

    private static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    /*  Basic "FOR" loop with (init; expression; increment).  */
    public static void basicForLoopExample1() {
        // convert the below code to a 'for loop'.
        System.out.println("2% interest on $10,000 = " + calculateInterest(10000d, 2d));
        System.out.println("3% interest on $10,000 = " + calculateInterest(10000d, 3d));
        System.out.println("4% interest on $10,000 = " + calculateInterest(10000d, 4d));
        System.out.println("5% interest on $10,000 = " + calculateInterest(10000d, 5d));

        for (double interestRate = 2d; interestRate <= 5d; interestRate++) {
            System.out.println(interestRate + "% interest on $10,000 = " + calculateInterest(10000d, interestRate));
        }
    }

    /*
     * MINI CHALLENGE REQ::
     * Part 1: Call the calculateInterest() method with the dollar amount of 100.
     * Use the interest rates between 7.5 and 10,
     * but increment by a quarter of a percent each time, meaning 0.25 percent.
     * Print the results to the console.
     *
     * Part 2: Stop execution if the interest rate is more than $8.5.
     */
    public static void miniChallenge() {
        System.out.println("\n\n ** Mini Challenge ** ");

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            if (rate > 8.5) {
                break;
            }
            double interestAmount = calculateInterest(100.0, rate);
            System.out.println(rate + "% of interest on $100 = $" + interestAmount);
        }
    }

    /* Never ending loop. Can cause "Out of memory" Runtime Error. */
    public static void neverEndingLoop() {

        // Below "FOR" loop will stop after it reaches Integer.MAX_VALUE.
        // In this case, the 'number' variable overflows and, becomes a negative value.
        // This Overflow will set the condition (number > 0) to "false",
        // terminating the "FOR" loop.
        for (int number = 100; number > 0; number += 10) {
            System.out.println(number);
        }
    }
}
