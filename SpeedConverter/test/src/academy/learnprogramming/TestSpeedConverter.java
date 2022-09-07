package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSpeedConverter {

    @BeforeEach
    void setUp() {
        System.out.println("starting tests.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finishing Tests...\n");
    }

    @Test
    void toMilesPerHour() {
        long milesPerHour = SpeedConverter.toMilesPerHour(25.42);
        assertEquals(16L, milesPerHour);

        milesPerHour = SpeedConverter.toMilesPerHour(75.114);
        assertEquals(47L, milesPerHour);
    }

    @Test
    void printConversion() {
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(-5.6);
    }
}