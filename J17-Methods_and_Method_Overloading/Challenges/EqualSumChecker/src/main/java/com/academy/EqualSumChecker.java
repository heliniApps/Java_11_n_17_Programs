package com.academy;

public class EqualSumChecker {

    /**
     * Checks if the sum of two numbers are equal to a third number.
     *
     * @param param1 numeric value, used to calculate the sum.
     * @param param2 numeric value, used to calculate the sum.
     * @param sum    total of param1 and param2 values.
     * @return returns true, if the total of param1 and param2 equals to the given sum.
     */
    public static boolean hasEqualSum(int param1, int param2, int sum) {
        return (param1 + param2) == sum;
    }
}
