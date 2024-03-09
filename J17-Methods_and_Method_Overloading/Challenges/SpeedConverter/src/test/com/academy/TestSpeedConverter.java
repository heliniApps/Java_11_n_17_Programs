package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestSpeedConverter {

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
    void toMilesPerHour() {
        Assertions.assertEquals(-1L, SpeedConverter.toMilesPerHour(-7d));
        Assertions.assertEquals(-1L, SpeedConverter.toMilesPerHour(-5.6d));
        Assertions.assertEquals(-1L, SpeedConverter.toMilesPerHour(-1d));
        Assertions.assertNotEquals(-10L, SpeedConverter.toMilesPerHour(-1d));
        Assertions.assertNotEquals(-2L, SpeedConverter.toMilesPerHour(-2d));
        Assertions.assertNotEquals(0L, SpeedConverter.toMilesPerHour(-3.20d));

        Assertions.assertEquals(0L, SpeedConverter.toMilesPerHour(0d));
        Assertions.assertEquals(1L, SpeedConverter.toMilesPerHour(1.5d));
        Assertions.assertEquals(6L, SpeedConverter.toMilesPerHour(10.25d));
        Assertions.assertEquals(16L, SpeedConverter.toMilesPerHour(25.42d));
        Assertions.assertEquals(47L, SpeedConverter.toMilesPerHour(75.114d));
    }

    @Test
    void printConversion() {
        SpeedConverter.printConversion(-10d);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(-1d);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(0d);
        Assertions.assertEquals("0.0 km/h = 0 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(1.5d);
        Assertions.assertEquals("1.5 km/h = 1 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(10.25d);
        Assertions.assertEquals("10.25 km/h = 6 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(25.42d);
        Assertions.assertEquals("25.42 km/h = 16 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(75.114d);
        Assertions.assertEquals("75.114 km/h = 47 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}
