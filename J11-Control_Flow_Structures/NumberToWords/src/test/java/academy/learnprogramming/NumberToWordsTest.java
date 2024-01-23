package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordsTest {

    @Test
    void printNumberToWords() {
        NumberToWords.printNumberToWords(345);
        NumberToWords.printNumberToWords(-78);
        NumberToWords.printNumberToWords(1000);
        NumberToWords.printNumberToWords(0);
    }

    @Test
    void reverse() {
        assertEquals(432, NumberToWords.reverse(234));
        assertEquals(-567, NumberToWords.reverse(-765));
        assertEquals(9, NumberToWords.reverse(900));
        assertEquals(0, NumberToWords.reverse(0));
    }

    @Test
    void getDigitCount() {
        assertEquals(3, NumberToWords.getDigitCount(900));
        assertEquals(2, NumberToWords.getDigitCount(45));
        assertEquals(-1, NumberToWords.getDigitCount(-23));
    }
}