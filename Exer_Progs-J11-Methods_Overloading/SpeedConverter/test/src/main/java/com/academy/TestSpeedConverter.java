package main.java.com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpeedConverter {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testToMilesPerHour() {
        assertEquals(-1L, SpeedConverter.toMilesPerHour(-45.12));
        assertEquals(-1L, SpeedConverter.toMilesPerHour(-5.6));
        assertEquals(0, SpeedConverter.toMilesPerHour(0.0));
        assertEquals(0, SpeedConverter.toMilesPerHour(0));

        assertEquals(1L, SpeedConverter.toMilesPerHour(1.5));
        assertEquals(6L, SpeedConverter.toMilesPerHour(10.25));
        assertEquals(16L, SpeedConverter.toMilesPerHour(25.42));
        assertEquals(47L, SpeedConverter.toMilesPerHour(75.114));
    }

    @Test
    void testPrintConversion() {
        SpeedConverter.printConversion(-5.6);
        assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(-1);
        assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(0);
        assertEquals("0.0 km/h = 0 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(1.5);
        assertEquals("1.5 km/h = 1 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(10.25);
        assertEquals("10.25 km/h = 6 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SpeedConverter.printConversion(75.114);
        assertEquals("75.114 km/h = 47 mi/h", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}
