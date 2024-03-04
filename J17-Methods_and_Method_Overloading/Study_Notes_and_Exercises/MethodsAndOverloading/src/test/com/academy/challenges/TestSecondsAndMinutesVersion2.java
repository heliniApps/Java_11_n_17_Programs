package com.academy.challenges;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSecondsAndMinutesVersion2 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDurationStringWithSeconds() {
        String errMsg = "Invalid number of 'seconds'. Value should be a positive number.";
        Assertions.assertEquals(
                errMsg, SecondsAndMinutesVersion2.getDurationString(-1));

        Assertions.assertEquals(
                "00h 00m 00s", SecondsAndMinutesVersion2.getDurationString(0));
        Assertions.assertEquals(
                "00h 01m 00s", SecondsAndMinutesVersion2.getDurationString(60));
        Assertions.assertEquals(
                "01h 00m 00s", SecondsAndMinutesVersion2.getDurationString(3600));
        Assertions.assertEquals(
                "01h 01m 20s", SecondsAndMinutesVersion2.getDurationString(3680));
        Assertions.assertEquals(
                "01h 05m 45s", SecondsAndMinutesVersion2.getDurationString(3945));
    }

    @Test
    void getDurationStringWithMinutes() {
        String errMsg = "Invalid number of 'minutes'. Value should be a positive number.";
        Assertions.assertEquals(errMsg, SecondsAndMinutesVersion2.getDurationString(-1, 10));

        errMsg = "Invalid number of 'seconds'. Value should be between 0 and 59 (inclusive).";
        Assertions.assertEquals(errMsg, SecondsAndMinutesVersion2.getDurationString(60, 60));

        errMsg = "Invalid number of 'seconds'. Value should be between 0 and 59 (inclusive).";
        Assertions.assertEquals(errMsg, SecondsAndMinutesVersion2.getDurationString(60, -1));

        Assertions.assertEquals(
                "00h 00m 00s", SecondsAndMinutesVersion2.getDurationString(0, 0));
        Assertions.assertEquals(
                "00h 00m 30s", SecondsAndMinutesVersion2.getDurationString(0, 30));
        Assertions.assertEquals(
                "02h 03m 00s", SecondsAndMinutesVersion2.getDurationString(123, 0));
        Assertions.assertEquals(
                "01h 00m 20s", SecondsAndMinutesVersion2.getDurationString(60, 20));
        Assertions.assertEquals(
                "02h 05m 59s", SecondsAndMinutesVersion2.getDurationString(125, 59));
    }
}