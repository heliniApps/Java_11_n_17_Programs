package com.academy.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestSecondsAndMinutesChallenge {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDurationStringWithMinutes() {
        Assertions.assertEquals(
                "Invalid number of 'seconds'.", SecondsAndMinutesChallenge.getDurationString(60, 60));
        Assertions.assertEquals(
                "Invalid number of 'seconds'.", SecondsAndMinutesChallenge.getDurationString(60, -1));
        Assertions.assertEquals(
                "Invalid number of 'minutes'.", SecondsAndMinutesChallenge.getDurationString(-1, 10));
        Assertions.assertEquals(
                "00h 00m 00s", SecondsAndMinutesChallenge.getDurationString(0, 0));
        Assertions.assertEquals(
                "00h 00m 30s", SecondsAndMinutesChallenge.getDurationString(0, 30));
        Assertions.assertEquals(
                "02h 03m 00s", SecondsAndMinutesChallenge.getDurationString(123, 0));
        Assertions.assertEquals(
                "01h 00m 20s", SecondsAndMinutesChallenge.getDurationString(60, 20));
        Assertions.assertEquals(
                "02h 05m 59s", SecondsAndMinutesChallenge.getDurationString(125, 59));
    }

    @Test
    void getDurationStringWithSeconds() {
        Assertions.assertEquals(
                "Invalid number of 'seconds'.", SecondsAndMinutesChallenge.getDurationString(-1));
        Assertions.assertEquals(
                "00h 00m 00s", SecondsAndMinutesChallenge.getDurationString(0));
        Assertions.assertEquals(
                "00h 01m 00s", SecondsAndMinutesChallenge.getDurationString(60));
        Assertions.assertEquals(
                "01h 00m 00s", SecondsAndMinutesChallenge.getDurationString(3600));
        Assertions.assertEquals(
                "01h 01m 20s", SecondsAndMinutesChallenge.getDurationString(3680));
        Assertions.assertEquals(
                "01h 05m 45s", SecondsAndMinutesChallenge.getDurationString(3945));
    }

    @Test
    void formatDurationString() {
        Assertions.assertEquals(
                "01h 03m 04s",
                SecondsAndMinutesChallenge.formatDurationString(1, 3, 4),
                (() -> "Invalid duration format.")
        );
        Assertions.assertEquals(
                "12h 40m 53s",
                SecondsAndMinutesChallenge.formatDurationString(12, 40, 53),
                (() -> "Invalid duration format.")
        );
    }
}