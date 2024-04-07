package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSumOddNumbers {

    @Test
    void isOdd() {
        Assertions.assertTrue(SumOddNumbers.isOdd(3));
        Assertions.assertTrue(SumOddNumbers.isOdd(15));
        Assertions.assertTrue(SumOddNumbers.isOdd(101));
        Assertions.assertTrue(SumOddNumbers.isOdd(3003));

        Assertions.assertFalse(SumOddNumbers.isOdd(0));
        Assertions.assertFalse(SumOddNumbers.isOdd(-1));
        Assertions.assertFalse(SumOddNumbers.isOdd(-17));
        Assertions.assertFalse(SumOddNumbers.isOdd(-14));
        Assertions.assertFalse(SumOddNumbers.isOdd(4));
        Assertions.assertFalse(SumOddNumbers.isOdd(2));
        Assertions.assertFalse(SumOddNumbers.isOdd(20));
        Assertions.assertFalse(SumOddNumbers.isOdd(300));
    }

    @Test
    void sumOdd() {
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(0, 0));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(8, 0));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(0, 40));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(-9, 9));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(10, -90));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(10, 5));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(101, 70));

        Assertions.assertEquals(15, SumOddNumbers.sumOdd(2, 7));
        Assertions.assertEquals(2500, SumOddNumbers.sumOdd(1, 100));
        Assertions.assertEquals(247500, SumOddNumbers.sumOdd(100, 1000));
        Assertions.assertEquals(13, SumOddNumbers.sumOdd(13, 13));
        Assertions.assertEquals(23, SumOddNumbers.sumOdd(23, 24));
        Assertions.assertEquals(48, SumOddNumbers.sumOdd(23, 25));
        Assertions.assertEquals(105, SumOddNumbers.sumOdd(32, 38));
    }
}