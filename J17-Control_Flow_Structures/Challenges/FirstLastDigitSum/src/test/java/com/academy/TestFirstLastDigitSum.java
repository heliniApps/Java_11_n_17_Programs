package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestFirstLastDigitSum {

    @Test
    void sumFirstAndLastDigit() {
        Assertions.assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-1));
        Assertions.assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-5));
        Assertions.assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-10));
        Assertions.assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-101));
        Assertions.assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSum.sumFirstAndLastDigit(0));
        Assertions.assertEquals(2, FirstLastDigitSum.sumFirstAndLastDigit(1));
        Assertions.assertEquals(12, FirstLastDigitSum.sumFirstAndLastDigit(6));
        Assertions.assertEquals(1, FirstLastDigitSum.sumFirstAndLastDigit(10));
        Assertions.assertEquals(5, FirstLastDigitSum.sumFirstAndLastDigit(14));
        Assertions.assertEquals(4, FirstLastDigitSum.sumFirstAndLastDigit(22));
        Assertions.assertEquals(12, FirstLastDigitSum.sumFirstAndLastDigit(75));
        Assertions.assertEquals(4, FirstLastDigitSum.sumFirstAndLastDigit(252));
        Assertions.assertEquals(9, FirstLastDigitSum.sumFirstAndLastDigit(257));
        Assertions.assertEquals(7, FirstLastDigitSum.sumFirstAndLastDigit(1256));
        Assertions.assertEquals(6, FirstLastDigitSum.sumFirstAndLastDigit(3333));
        Assertions.assertEquals(9, FirstLastDigitSum.sumFirstAndLastDigit(Integer.MAX_VALUE));
    }
}