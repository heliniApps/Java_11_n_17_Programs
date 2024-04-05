package com.academy;

import java.util.Calendar;

public class DaysInMonthArchive {

    public static int getDaysInMonthV3(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static int getDaysInMonthV2(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        if (month == 2) {
            return NumberOfDaysInMonth.isLeapYear(year) ? 29 : 28;
        }
        return (31 - (((month - 1) % 7) % 2));
    }

    public static int getDaysInMonthV1(int month, int year) {
        if ((year < 1) || (year > 9999)) {
            return -1;
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> NumberOfDaysInMonth.isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
}
