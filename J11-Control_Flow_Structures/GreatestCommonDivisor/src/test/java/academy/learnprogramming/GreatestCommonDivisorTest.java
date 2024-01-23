package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisor() {
        assertEquals(6, GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        assertEquals(5, GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        assertEquals(10, GreatestCommonDivisor.getGreatestCommonDivisor(100, 10));
        assertEquals(-1, GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        assertEquals(-1, GreatestCommonDivisor.getGreatestCommonDivisor(100, 5));
    }

    @Test
    void isValidArg() {
        assertTrue(GreatestCommonDivisor.isValidArg(10));
        assertTrue(GreatestCommonDivisor.isValidArg(127));
        assertFalse(GreatestCommonDivisor.isValidArg(0));
        assertFalse(GreatestCommonDivisor.isValidArg(9));
    }
}