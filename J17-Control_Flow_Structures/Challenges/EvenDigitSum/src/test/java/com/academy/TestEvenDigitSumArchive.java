package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestEvenDigitSumArchive {

    @Test
    void getEvenDigitSumV4() {
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV4(-1));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV4(-4));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV4(-22));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV4(-474));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV4(-1234));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV4(Integer.MIN_VALUE));

        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV4(0));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV4(1));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV4(2));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV4(6));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV4(10));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV4(14));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV4(20));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV4(22));
        Assertions.assertEquals(8, EvenDigitSumArchive.getEvenDigitSumV4(38));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV4(100));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV4(222));
        Assertions.assertEquals(24, EvenDigitSumArchive.getEvenDigitSumV4(888));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV4(999));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV4(252));
        Assertions.assertEquals(20, EvenDigitSumArchive.getEvenDigitSumV4(123456789));
        Assertions.assertEquals(28, EvenDigitSumArchive.getEvenDigitSumV4(Integer.MAX_VALUE));
    }

    @Test
    void getEvenDigitSumV3() {
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV3(-1));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV3(-4));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV3(-22));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV3(-474));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV3(-1234));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV3(Integer.MIN_VALUE));

        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV3(0));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV3(1));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV3(2));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV3(6));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV3(10));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV3(14));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV3(20));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV3(22));
        Assertions.assertEquals(8, EvenDigitSumArchive.getEvenDigitSumV3(38));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV3(100));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV3(222));
        Assertions.assertEquals(24, EvenDigitSumArchive.getEvenDigitSumV3(888));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV3(999));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV3(252));
        Assertions.assertEquals(20, EvenDigitSumArchive.getEvenDigitSumV3(123456789));
        Assertions.assertEquals(28, EvenDigitSumArchive.getEvenDigitSumV3(Integer.MAX_VALUE));
    }

    @Test
    void getEvenDigitSumV2() {
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV2(-1));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV2(-4));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV2(-22));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV2(-474));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV2(-1234));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV2(Integer.MIN_VALUE));

        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV2(0));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV2(1));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV2(2));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV2(6));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV2(10));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV2(14));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV2(20));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV2(22));
        Assertions.assertEquals(8, EvenDigitSumArchive.getEvenDigitSumV2(38));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV2(100));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV2(222));
        Assertions.assertEquals(24, EvenDigitSumArchive.getEvenDigitSumV2(888));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV2(999));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV2(252));
        Assertions.assertEquals(20, EvenDigitSumArchive.getEvenDigitSumV2(123456789));
        Assertions.assertEquals(28, EvenDigitSumArchive.getEvenDigitSumV2(Integer.MAX_VALUE));
    }

    @Test
    void getEvenDigitSumV1() {
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV1(-1));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV1(-4));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV1(-22));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV1(-474));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV1(-1234));
        Assertions.assertEquals(-1, EvenDigitSumArchive.getEvenDigitSumV1(Integer.MIN_VALUE));

        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV1(0));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV1(1));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV1(2));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV1(6));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV1(10));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV1(14));
        Assertions.assertEquals(2, EvenDigitSumArchive.getEvenDigitSumV1(20));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV1(22));
        Assertions.assertEquals(8, EvenDigitSumArchive.getEvenDigitSumV1(38));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV1(100));
        Assertions.assertEquals(6, EvenDigitSumArchive.getEvenDigitSumV1(222));
        Assertions.assertEquals(24, EvenDigitSumArchive.getEvenDigitSumV1(888));
        Assertions.assertEquals(0, EvenDigitSumArchive.getEvenDigitSumV1(999));
        Assertions.assertEquals(4, EvenDigitSumArchive.getEvenDigitSumV1(252));
        Assertions.assertEquals(20, EvenDigitSumArchive.getEvenDigitSumV1(123456789));
        Assertions.assertEquals(28, EvenDigitSumArchive.getEvenDigitSumV1(Integer.MAX_VALUE));
    }
}