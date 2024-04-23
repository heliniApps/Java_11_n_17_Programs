package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestFirstLastDigitSumArchive {

    @Test
    void sumFirstAndLastDigitV6() {
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(-1));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(-5));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(-10));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(-101));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(0));
        Assertions.assertEquals(2, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(1));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(6));
        Assertions.assertEquals(1, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(10));
        Assertions.assertEquals(5, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(14));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(22));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(75));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(252));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(257));
        Assertions.assertEquals(7, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(1256));
        Assertions.assertEquals(6, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(3333));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV6(Integer.MAX_VALUE));
    }

    @Test
    void sumFirstAndLastDigitV5() {
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(-1));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(-5));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(-10));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(-101));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(0));
        Assertions.assertEquals(2, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(1));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(6));
        Assertions.assertEquals(1, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(10));
        Assertions.assertEquals(5, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(14));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(22));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(75));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(252));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(257));
        Assertions.assertEquals(7, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(1256));
        Assertions.assertEquals(6, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(3333));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV5(Integer.MAX_VALUE));
    }

    @Test
    void sumFirstAndLastDigitV4() {
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(-1));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(-5));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(-10));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(-101));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(0));
        Assertions.assertEquals(2, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(1));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(6));
        Assertions.assertEquals(1, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(10));
        Assertions.assertEquals(5, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(14));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(22));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(75));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(252));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(257));
        Assertions.assertEquals(7, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(1256));
        Assertions.assertEquals(6, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(3333));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV4(Integer.MAX_VALUE));
    }

    @Test
    void sumFirstAndLastDigitV3() {
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(-1));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(-5));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(-10));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(-101));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(0));
        Assertions.assertEquals(2, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(1));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(6));
        Assertions.assertEquals(1, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(10));
        Assertions.assertEquals(5, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(14));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(22));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(75));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(252));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(257));
        Assertions.assertEquals(7, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(1256));
        Assertions.assertEquals(6, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(3333));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV3(Integer.MAX_VALUE));
    }

    @Test
    void sumFirstAndLastDigitV2() {
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(-1));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(-5));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(-10));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(-101));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(0));
        Assertions.assertEquals(2, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(1));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(6));
        Assertions.assertEquals(1, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(10));
        Assertions.assertEquals(5, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(14));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(22));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(75));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(252));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(257));
        Assertions.assertEquals(7, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(1256));
        Assertions.assertEquals(6, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(3333));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV2(Integer.MAX_VALUE));
    }

    @Test
    void sumFirstAndLastDigitV1() {
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(-1));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(-5));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(-10));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(-101));
        Assertions.assertEquals(-1, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(Integer.MIN_VALUE));

        Assertions.assertEquals(0, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(0));
        Assertions.assertEquals(2, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(1));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(6));
        Assertions.assertEquals(1, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(10));
        Assertions.assertEquals(5, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(14));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(22));
        Assertions.assertEquals(12, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(75));
        Assertions.assertEquals(4, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(252));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(257));
        Assertions.assertEquals(7, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(1256));
        Assertions.assertEquals(6, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(3333));
        Assertions.assertEquals(9, FirstLastDigitSumArchive.sumFirstAndLastDigitV1(Integer.MAX_VALUE));
    }
}