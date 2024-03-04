package com.academy.challenges;

public class MethodOverloadingChallenge {

    private static final double CENTIMETER_CONVERSION_RATE = 2.54d;

    public static void main(String args[]) {

    }

    public static double convertToCentimeters(int inches) {
        if (inches > 0) {
            return (inches * CENTIMETER_CONVERSION_RATE);
        }
        return 0.0;
    }

    public static double convertToCentimeters(int feet, int inches) {
        if ((feet < 0) || (inches < 0)) {
            return 0.0;
        }
        int feetToInches = (feet * 12);
        int totalInches = feetToInches + inches;

        return convertToCentimeters(totalInches);
    }
}
