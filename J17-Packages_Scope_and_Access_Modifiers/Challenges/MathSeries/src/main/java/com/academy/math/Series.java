package com.academy.math;

public class Series {

    /**
     * Calculates the sum of all numbers from 0 to 'n'.
     *
     * @param n number up to which the sum should be calculated.
     * @return sum of all numbers from 0 to 'n'.
     */
    public static int nSum(int n) {
        if (n < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Calculates the product of all numbers from 1 to 'n'.
     *
     * @param n number up to which the product should be calculated.
     * @return product of all numbers from 1 to 'n'.
     */
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Formula:  f(n) = f(n-1) + f(n-2)
     * Uses recursion to achieve f(n-1) and f(n-2) values.
     *
     * @param n number to get the Fibonacci value.
     * @return the nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fibonacci(n - 1) + fibonacci(n - 2);
        };
    }

    /* Version 2:  fibonacci(n)
     * Returning from the 'if' statement. Uses recursion.
     */
    public static int fibonacciV2(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacciV2(n - 1) + fibonacciV2(n - 2);
    }

    /* Version 1: fibonacci(n)
     * Using 'if-else' to assign the value. Uses recursion.
     */
    public static int fibonacciV1(int n) {
        int fibonacciValue = 0;
        if (n < 0) {
            fibonacciValue = -1;
        } else if (n == 0) {
            fibonacciValue = 0;
        } else if (n == 1) {
            fibonacciValue = 1;
        } else {
            fibonacciValue = fibonacciV1(n - 1) + fibonacciV1(n - 2);
        }
        return fibonacciValue;
    }
}
