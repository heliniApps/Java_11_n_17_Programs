package com.academy.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDigitSumChallenge {

    @Test
    void sumDigit() {
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigit(-108));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigit(-34));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigit(-1));

        Assertions.assertEquals(0, DigitSumChallenge.sumDigit(0));
        Assertions.assertEquals(5, DigitSumChallenge.sumDigit(5));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigit(9));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigit(10));
        Assertions.assertEquals(13, DigitSumChallenge.sumDigit(85));
        Assertions.assertEquals(6, DigitSumChallenge.sumDigit(123));
        Assertions.assertEquals(22, DigitSumChallenge.sumDigit(769));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigit(1000));
        Assertions.assertEquals(2, DigitSumChallenge.sumDigit(1010));
        Assertions.assertEquals(8, DigitSumChallenge.sumDigitV3(12320));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV3(12321));
    }


    @Test
    void sumDigitV3() {
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV3(-108));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV3(-34));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV3(-1));

        Assertions.assertEquals(0, DigitSumChallenge.sumDigitV3(0));
        Assertions.assertEquals(5, DigitSumChallenge.sumDigitV3(5));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV3(9));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigitV3(10));
        Assertions.assertEquals(13, DigitSumChallenge.sumDigitV3(85));
        Assertions.assertEquals(6, DigitSumChallenge.sumDigitV3(123));
        Assertions.assertEquals(22, DigitSumChallenge.sumDigitV3(769));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigitV3(1000));
        Assertions.assertEquals(2, DigitSumChallenge.sumDigitV3(1010));
        Assertions.assertEquals(8, DigitSumChallenge.sumDigitV3(12320));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV3(12321));
    }

    @Test
    void sumDigitV2() {
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV2(-108));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV2(-34));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV2(-1));

        Assertions.assertEquals(0, DigitSumChallenge.sumDigitV2(0));
        Assertions.assertEquals(5, DigitSumChallenge.sumDigitV2(5));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV2(9));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigitV2(10));
        Assertions.assertEquals(13, DigitSumChallenge.sumDigitV2(85));
        Assertions.assertEquals(6, DigitSumChallenge.sumDigitV2(123));
        Assertions.assertEquals(22, DigitSumChallenge.sumDigitV2(769));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigitV2(1000));
        Assertions.assertEquals(2, DigitSumChallenge.sumDigitV2(1010));
        Assertions.assertEquals(8, DigitSumChallenge.sumDigitV3(12320));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV3(12321));
    }

    @Test
    void sumDigitV1() {
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV1(-108));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV1(-34));
        Assertions.assertEquals(-1, DigitSumChallenge.sumDigitV1(-1));

        Assertions.assertEquals(0, DigitSumChallenge.sumDigitV1(0));
        Assertions.assertEquals(5, DigitSumChallenge.sumDigitV1(5));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV1(9));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigitV1(10));
        Assertions.assertEquals(13, DigitSumChallenge.sumDigitV1(85));
        Assertions.assertEquals(6, DigitSumChallenge.sumDigitV1(123));
        Assertions.assertEquals(22, DigitSumChallenge.sumDigitV1(769));
        Assertions.assertEquals(1, DigitSumChallenge.sumDigitV1(1000));
        Assertions.assertEquals(2, DigitSumChallenge.sumDigitV1(1010));
        Assertions.assertEquals(8, DigitSumChallenge.sumDigitV3(12320));
        Assertions.assertEquals(9, DigitSumChallenge.sumDigitV3(12321));
    }
}