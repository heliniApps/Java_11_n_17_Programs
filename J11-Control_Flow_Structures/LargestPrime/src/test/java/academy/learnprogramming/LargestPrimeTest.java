package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeTest {

    @Test
    void getLargestPrime() {
        assertEquals(7, LargestPrime.getLargestPrime(21));
        assertEquals(31, LargestPrime.getLargestPrime(217));
        assertEquals(-1, LargestPrime.getLargestPrime(0));
        assertEquals(5, LargestPrime.getLargestPrime(45));
        assertEquals(-1, LargestPrime.getLargestPrime(-1));
    }

    @Test
    void isPrimeNumber() {
        assertTrue(LargestPrime.isPrimeNumber(7));
        assertTrue(LargestPrime.isPrimeNumber(29));
        assertTrue(LargestPrime.isPrimeNumber(43));

        assertFalse(LargestPrime.isPrimeNumber(4));
        assertFalse(LargestPrime.isPrimeNumber(10));
        assertFalse(LargestPrime.isPrimeNumber(100));
    }
}