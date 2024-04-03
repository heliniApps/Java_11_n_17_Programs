package com.academy.math;

public class SeriesVersion2 {

    /* nSum(n):  Version 2
     * Omitting the 'for' loop.
     */
    public static long nSumV2(int n) {
        if (n < 0) return -1;
        return (n * (n + 1L)) / 2L;
    }

    /* nSum(n):  Version 3
     * Uses recursion to get the sum from 0 - n.
     */
    public static long nSumV3(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n + nSumV3(n - 1);
    }

    /* factorial(n):  Version 2
     * Uses recursion to get the product of numbers.
     */
    public static long factorialV2(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        return n * factorialV2(n - 1);
    }

    /* fibonacci(n):  Version 3
     * Using a 'for' loop to calculate f(n-1) and f(n-2).
     * Omits recursion.
     */
    public static long fibonacciV3(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long nMinus1 = 0;
        long nMinus2 = 0;
        long fibonacciVal = 0;
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                nMinus1 = 1;
                nMinus2 = 0;
            }
            fibonacciVal = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = fibonacciVal;
        }
        return fibonacciVal;
    }


    /* fibonacci(n):  Version 2
     * Returning from the 'if' statement. Uses recursion.
     */
    public static long fibonacciV2(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacciV2(n - 1) + fibonacciV2(n - 2);
    }


    /* fibonacci(n):  Version 1
     * Using 'if-else' to assign the value. Uses recursion.
     */
    public static long fibonacciV1(int n) {
        long fibonacciValue = 0;
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
