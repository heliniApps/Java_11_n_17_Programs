package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestEvenDigitSum {

    @Test
    void getEvenDigitSum() {
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(-1));
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(-4));
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(-22));
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(-474));
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(-1234));
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(Integer.MIN_VALUE));

        Assertions.assertEquals(0,EvenDigitSum.getEvenDigitSum(0));
        Assertions.assertEquals(0,EvenDigitSum.getEvenDigitSum(1));
        Assertions.assertEquals(2,EvenDigitSum.getEvenDigitSum(2));
        Assertions.assertEquals(6,EvenDigitSum.getEvenDigitSum(6));
        Assertions.assertEquals(0,EvenDigitSum.getEvenDigitSum(10));
        Assertions.assertEquals(4,EvenDigitSum.getEvenDigitSum(14));
        Assertions.assertEquals(2,EvenDigitSum.getEvenDigitSum(20));
        Assertions.assertEquals(4,EvenDigitSum.getEvenDigitSum(22));
        Assertions.assertEquals(8,EvenDigitSum.getEvenDigitSum(38));
        Assertions.assertEquals(0,EvenDigitSum.getEvenDigitSum(100));
        Assertions.assertEquals(6,EvenDigitSum.getEvenDigitSum(222));
        Assertions.assertEquals(24,EvenDigitSum.getEvenDigitSum(888));
        Assertions.assertEquals(0,EvenDigitSum.getEvenDigitSum(999));
        Assertions.assertEquals(4,EvenDigitSum.getEvenDigitSum(252));
        Assertions.assertEquals(20,EvenDigitSum.getEvenDigitSum(123456789));
        Assertions.assertEquals(28,EvenDigitSum.getEvenDigitSum(Integer.MAX_VALUE));
    }
}