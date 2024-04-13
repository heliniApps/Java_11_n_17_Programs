package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestNumberOfDaysInMonth {

    @Test
    void isLeapYear() {
        Assertions.assertTrue(NumberOfDaysInMonth.isLeapYear(2024));
        Assertions.assertTrue(NumberOfDaysInMonth.isLeapYear(2020));
        Assertions.assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
        Assertions.assertTrue(NumberOfDaysInMonth.isLeapYear(1600));

        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(0));
        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(-1600));
        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(-2024));
        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(1));
        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(9999));
        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(2017));
        Assertions.assertFalse(NumberOfDaysInMonth.isLeapYear(2023));
    }

    @Test
    void getDaysInMonth() {
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(0, 2000));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-1, 2023));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-5, 2022));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-12, 2022));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-13, 2024));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(13, 2024));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(15, 2017));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(1, 0));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(3, -1600));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(12, 10000));
        Assertions.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(10, 16000));

        Assertions.assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2024));
        Assertions.assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2017));
        Assertions.assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2024));
        Assertions.assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2000));
        Assertions.assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 1600));
        Assertions.assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 1601));
        Assertions.assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2017));
        Assertions.assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2023));
        Assertions.assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(12, 2022));
        Assertions.assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(12, 1600));
        Assertions.assertEquals(30, NumberOfDaysInMonth.getDaysInMonth(11, 2021));
        Assertions.assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(10, 2020));
        Assertions.assertEquals(30, NumberOfDaysInMonth.getDaysInMonth(4, 2024));
    }
}