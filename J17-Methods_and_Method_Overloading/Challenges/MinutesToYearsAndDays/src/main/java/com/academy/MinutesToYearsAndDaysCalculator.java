package com.academy;

public class MinutesToYearsAndDaysCalculator {

    /**
     * Determines the equivalent years and days, based on a given input in minutes.
     *
     * @param minutes number of minutes.
     */
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long availableDays = minutes / (24 * 60);
        long years = availableDays / 365;
        long remainingDays = availableDays % 365;
        System.out.printf("%1$d min = %2$d y and %3$d d %n", minutes, years, remainingDays);
    }

    /* Version 2 */
    public static void printYearsAndDaysV2(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / (24 * 60 * 365);
        long remainingDays = (minutes / (24 * 60)) % 365;
        System.out.printf("%d min = %d y and %d d %n", minutes, years, remainingDays);
    }

    /* Version 1 */
    public static void printYearsAndDaysV1(long minutes) {
        long availableDays = minutes / (24 * 60);
        String message = (minutes < 0) ? "Invalid Value" :
                String.format("%1$d min = %2$d y and %3$d d", minutes, (availableDays / 365), (availableDays % 365));
        System.out.println(message);
    }
}
