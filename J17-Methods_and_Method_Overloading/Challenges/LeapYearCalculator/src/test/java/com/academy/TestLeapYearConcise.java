package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLeapYearConcise {

    @Test
    void isLeapYear() {
        // Invalid range
        Assertions.assertFalse(LeapYearConcise.isLeapYear(0));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(-1));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(-1600));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(10000));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(16000));

        // Valid range
        Assertions.assertFalse(LeapYearConcise.isLeapYear(1));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(9999));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(1700));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(1800));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(1900));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2100));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2200));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2300));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2500));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2600));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2023));
        Assertions.assertFalse(LeapYearConcise.isLeapYear(2017));

        Assertions.assertTrue(LeapYearConcise.isLeapYear(1600));
        Assertions.assertTrue(LeapYearConcise.isLeapYear(2000));
        Assertions.assertTrue(LeapYearConcise.isLeapYear(2400));
        Assertions.assertTrue(LeapYearConcise.isLeapYear(2024));
    }

    @Test
    void isLeapYearV2() {
        // Invalid range
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(0));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(-1));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(16000));

        // Valid range
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(1));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(9999));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(2023));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV2(2017));

        Assertions.assertTrue(LeapYearConcise.isLeapYearV2(1600));
        Assertions.assertTrue(LeapYearConcise.isLeapYearV2(2000));
        Assertions.assertTrue(LeapYearConcise.isLeapYearV2(2400));
        Assertions.assertTrue(LeapYearConcise.isLeapYearV2(2024));
    }

    @Test
    void isLeapYearV1() {
        // Invalid range
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(0));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(-1));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(16000));

        // Valid range
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(1));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(9999));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(2023));
        Assertions.assertFalse(LeapYearConcise.isLeapYearV1(2017));

        Assertions.assertTrue(LeapYearConcise.isLeapYearV1(1600));
        Assertions.assertTrue(LeapYearConcise.isLeapYearV1(2000));
        Assertions.assertTrue(LeapYearConcise.isLeapYearV1(2400));
        Assertions.assertTrue(LeapYearConcise.isLeapYearV1(2024));
    }
}