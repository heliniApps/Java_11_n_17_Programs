package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestMinutesToYearsAndDaysCalculator {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void printYearsAndDays() {
        MinutesToYearsAndDaysCalculator.printYearsAndDays(-561600L);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MinutesToYearsAndDaysCalculator.printYearsAndDays(-365L);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MinutesToYearsAndDaysCalculator.printYearsAndDays(0);
        Assertions.assertEquals("0 min = 0 y and 0 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MinutesToYearsAndDaysCalculator.printYearsAndDays(365L);
        Assertions.assertEquals("365 min = 0 y and 0 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MinutesToYearsAndDaysCalculator.printYearsAndDays(525600L);
        Assertions.assertEquals("525600 min = 1 y and 0 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MinutesToYearsAndDaysCalculator.printYearsAndDays(1051200L);
        Assertions.assertEquals("1051200 min = 2 y and 0 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600L);
        Assertions.assertEquals("561600 min = 1 y and 25 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // Testing with the Integer.MAX_VALUE ->
        // All available days = 1491308
        MinutesToYearsAndDaysCalculator.printYearsAndDays(Integer.MAX_VALUE);
        Assertions.assertEquals("2147483647 min = 4085 y and 283 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // Testing with the Long.MAX_VALUE ->
        // All available days = 6_405_119_470_038_038
        MinutesToYearsAndDaysCalculator.printYearsAndDays(Long.MAX_VALUE);
        Assertions.assertEquals("9223372036854775807 min = 17548272520652 y and 58 d", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}