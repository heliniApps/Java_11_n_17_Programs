package com.academy;

import java.time.YearMonth;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        YearMonth yearMonthObj = YearMonth.of(year, month);
        return yearMonthObj.lengthOfMonth();
    }
}
