package com.academy;

public class PositiveNegativeZero {

    private static final String POSITIVE_TEXT = "positive";
    private static final String NEGATIVE_TEXT = "negative";
    private static final String ZERO_TEXT = "zero";

    /**
     * Improved If - Else-If.
     */
    public static void checkNumber(int number) {
        String message = ZERO_TEXT;
        if (number > 0) {
            message = POSITIVE_TEXT;
        } else if (number < 0) {
            message = NEGATIVE_TEXT;
        }
        System.out.println(message);
    }

    /**
     * Using nested Ternary Operator.
     */
    public static void checkNumberV2(int number) {
        String message = (number > 0) ? POSITIVE_TEXT : ((number < 0) ? NEGATIVE_TEXT : ZERO_TEXT);
        System.out.println(message);
    }

    /**
     * Using If - Else-If - Else.
     */
    public static void checkNumberV1(int number) {
        if (number > 0) {
            System.out.println(POSITIVE_TEXT);
        } else if (number < 0) {
            System.out.println(NEGATIVE_TEXT);
        } else {
            System.out.println(ZERO_TEXT);
        }
    }
}
