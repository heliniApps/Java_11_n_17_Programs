package com.academy;

public class LeapYear {

    /**
     * Checks if a specified calendar year is a leap year.
     *
     * @param year calendar year (number).
     * @return returns true, if the given year is a 'leap year'.
     */
    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return ((year % 4) == 0) && ((year % 100) == 0 ? ((year % 400) == 0) : true);
        }
        return false;
    }

    /* Version 4.
     * Solution suggested by the IDE [IntelliJ]. */
    public static boolean isLeapYearIDESuggestion(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return ((year % 4) == 0) && ((year % 100) != 0 || ((year % 400) == 0));
        }
        return false;
    }

    /* Version 3 */
    public static boolean isLeapYearV3(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return ((year % 4) == 0) && ((year % 100) == 0) ? ((year % 400) == 0) : ((year % 4) == 0);
        }
        return false;
    }

    /* Version 2 */
    public static boolean isLeapYearV2(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4) == 0) {
                return ((year % 100) == 0) ? ((year % 400) == 0) : true;
            }
        }
        return false;
    }

    /* Initial implementation (Version 1). */
    public static boolean isLeapYearV1(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                return ((year % 400) == 0);
            }
            return true;
        }
        return false;
    }
}
