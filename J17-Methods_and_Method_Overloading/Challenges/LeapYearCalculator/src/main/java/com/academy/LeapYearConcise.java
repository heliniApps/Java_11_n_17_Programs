package com.academy;

/**
 * This class contains more concise versions of the "isLeapYear()" function's logic,
 * which was written in the LeapYear class.
 * <p>
 * Starts implementation using the final version of the function from LeapYear class.
 */
public class LeapYearConcise {

    /* Final version ->
     * Removed ternary operator. Instead, using logical OR operator to combine the two conditions.
     * Removed 'If' statement. Combining the validation to a single condition.
     */
    public static boolean isLeapYear(int year) {
        return (year >= 1) && (year <= 9999) && (year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0);
    }

    /* Version 2 ->
     * Converting the ternary operator to return the positive scenario. */
    public static boolean isLeapYearV2(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return (year % 4) == 0 && (year % 100) != 0 ? true : (year % 400) == 0;
        }
        return false;
    }

    /* Version 1 [final version of this function from LeapYear class.] */
    public static boolean isLeapYearV1(int year) {
        if ((year >= 1) && (year <= 9999)) {
            return ((year % 4) == 0) && ((year % 100) == 0 ? ((year % 400) == 0) : true);
        }
        return false;
    }
}
