package academy.learnprogramming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSpeedConverterOld {

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
        long milesPerHour = SpeedConverterOld.toMilesPerHour(25.42);
        assertEquals(16L, milesPerHour);

        milesPerHour = SpeedConverterOld.toMilesPerHour(75.114);
        assertEquals(47L, milesPerHour);

        milesPerHour = SpeedConverterOld.toMilesPerHour(0);
        assertEquals(0, milesPerHour);

        milesPerHour = SpeedConverterOld.toMilesPerHour(-1.5);
        assertEquals(-1L, milesPerHour);
    }

    @Test
    void printConversion() {
        SpeedConverterOld.printConversion(1.5);
        SpeedConverterOld.printConversion(-5.6);
    }
}