package com.academy.challenges;

public class PositiveNegativeZero {

    public static void main(String args[]) {

        checkNumber(1);
        checkNumber(0);
        checkNumber(-1);
        checkNumber(10);
        checkNumber(-12);
    }

    public static void checkNumber(int number) {
        String message = "zero";
        if (number > 0) {
            message = "positive";
        } else if (number < 0) {
            message = "negative";
        }
        System.out.println(message);
    }

    public static void checkNumberV2(int number) {

        String message = (number > 0) ? "positive" : ((number < 0) ? "negative" : "zero");
        System.out.println(message);
    }

    public static void checkNumberV1(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
