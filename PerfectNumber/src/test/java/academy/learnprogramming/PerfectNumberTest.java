package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void isPerfectNumber() {
        assertTrue(PerfectNumber.isPerfectNumber(6));
        assertTrue(PerfectNumber.isPerfectNumber(28));

        assertFalse(PerfectNumber.isPerfectNumber(5));
        assertFalse(PerfectNumber.isPerfectNumber(-3));
        assertFalse(PerfectNumber.isPerfectNumber(0));
    }
}