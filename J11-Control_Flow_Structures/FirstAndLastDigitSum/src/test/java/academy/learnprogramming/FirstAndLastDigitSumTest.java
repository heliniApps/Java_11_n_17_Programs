package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit() {
        assertEquals(-1, FirstAndLastDigitSum.sumFirstAndLastDigit(-90));
        assertEquals(4, FirstAndLastDigitSum.sumFirstAndLastDigit(123));
        assertEquals(2, FirstAndLastDigitSum.sumFirstAndLastDigit(1001));
        assertEquals(0, FirstAndLastDigitSum.sumFirstAndLastDigit(0));
        assertEquals(10, FirstAndLastDigitSum.sumFirstAndLastDigit(5));
    }

    @Test
    void getLastDigit() {
        assertEquals(1, FirstAndLastDigitSum.getLastDigit(101));
        assertEquals(7, FirstAndLastDigitSum.getLastDigit(257));
        assertEquals(-1, FirstAndLastDigitSum.getLastDigit(-89));
        assertEquals(5, FirstAndLastDigitSum.getLastDigit(5));
        assertEquals(0, FirstAndLastDigitSum.getLastDigit(0));
    }

    @Test
    void getFirstDigit() {
        assertEquals(1, FirstAndLastDigitSum.getFirstDigit(101));
        assertEquals(2, FirstAndLastDigitSum.getFirstDigit(257));
        assertEquals(-1, FirstAndLastDigitSum.getFirstDigit(-89));
        assertEquals(5, FirstAndLastDigitSum.getFirstDigit(5));
        assertEquals(0, FirstAndLastDigitSum.getFirstDigit(0));
    }
}