package com.academy.math;

public class Series {

    /**
     * Calculates the sum of all numbers from 0 to 'n'.
     *
     * @param n number up to which the sum should be calculated.
     * @return sum of all numbers from 0 to 'n'.
     */
    public static long nSum(int n) {
        if (n < 0) {
            return -1;
        }
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Calculates the product of all numbers from 1 to 'n'.
     * (!0) = 1
     * (!1) = 1
     * (!n) = 1 * 2 * ... * n
     *
     * @param n number up to which the product should be calculated.
     * @return product of all numbers from 1 to 'n'.
     */
    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;   //  (!0) = 1
        }
        long factorial = 1;
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
    public static long fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fibonacci(n - 1) + fibonacci(n - 2);
        };
    }
}
