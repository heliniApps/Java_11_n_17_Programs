package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLeapYear {

    @Test
    void isLeapYear() {
        // Invalid range
        Assertions.assertFalse(LeapYear.isLeapYear(0));
        Assertions.assertFalse(LeapYear.isLeapYear(-1));
        Assertions.assertFalse(LeapYear.isLeapYear(-1600));
        Assertions.assertFalse(LeapYear.isLeapYear(10000));
        Assertions.assertFalse(LeapYear.isLeapYear(16000));

        // Valid range
        Assertions.assertFalse(LeapYear.isLeapYear(1));
        Assertions.assertFalse(LeapYear.isLeapYear(9999));
        Assertions.assertFalse(LeapYear.isLeapYear(1700));
        Assertions.assertFalse(LeapYear.isLeapYear(1800));
        Assertions.assertFalse(LeapYear.isLeapYear(1900));
        Assertions.assertFalse(LeapYear.isLeapYear(2100));
        Assertions.assertFalse(LeapYear.isLeapYear(2200));
        Assertions.assertFalse(LeapYear.isLeapYear(2300));
        Assertions.assertFalse(LeapYear.isLeapYear(2500));
        Assertions.assertFalse(LeapYear.isLeapYear(2600));
        Assertions.assertFalse(LeapYear.isLeapYear(2023));
        Assertions.assertFalse(LeapYear.isLeapYear(2017));

        Assertions.assertTrue(LeapYear.isLeapYear(1600));
        Assertions.assertTrue(LeapYear.isLeapYear(2000));
        Assertions.assertTrue(LeapYear.isLeapYear(2400));
        Assertions.assertTrue(LeapYear.isLeapYear(2024));
    }
}