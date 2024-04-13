package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestSumOddNumbersArchive {

    @Test
    void sumOddV3() {
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(0, 0));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(8, 0));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(0, 40));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(-9, 9));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(10, -90));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(10, 5));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV3(101, 70));

        Assertions.assertEquals(15, SumOddNumbersArchive.sumOddV3(2, 7));
        Assertions.assertEquals(2500, SumOddNumbersArchive.sumOddV3(1, 100));
        Assertions.assertEquals(247500, SumOddNumbersArchive.sumOddV3(100, 1000));
        Assertions.assertEquals(13, SumOddNumbersArchive.sumOddV3(13, 13));
        Assertions.assertEquals(23, SumOddNumbersArchive.sumOddV3(23, 24));
        Assertions.assertEquals(48, SumOddNumbersArchive.sumOddV3(23, 25));
        Assertions.assertEquals(105, SumOddNumbersArchive.sumOddV3(32, 38));
    }

    @Test
    void sumOddV2() {
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(0, 0));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(8, 0));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(0, 40));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(-9, 9));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(10, -90));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(10, 5));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV2(101, 70));

        Assertions.assertEquals(15, SumOddNumbersArchive.sumOddV2(2, 7));
        Assertions.assertEquals(2500, SumOddNumbersArchive.sumOddV2(1, 100));
        Assertions.assertEquals(247500, SumOddNumbersArchive.sumOddV2(100, 1000));
        Assertions.assertEquals(13, SumOddNumbersArchive.sumOddV2(13, 13));
        Assertions.assertEquals(23, SumOddNumbersArchive.sumOddV2(23, 24));
        Assertions.assertEquals(48, SumOddNumbersArchive.sumOddV2(23, 25));
        Assertions.assertEquals(105, SumOddNumbersArchive.sumOddV2(32, 38));
    }

    @Test
    void sumOddV1() {
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(0, 0));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(8, 0));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(0, 40));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(-9, 9));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(10, -90));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(10, 5));
        Assertions.assertEquals(-1, SumOddNumbersArchive.sumOddV1(101, 70));

        Assertions.assertEquals(15, SumOddNumbersArchive.sumOddV1(2, 7));
        Assertions.assertEquals(2500, SumOddNumbersArchive.sumOddV1(1, 100));
        Assertions.assertEquals(247500, SumOddNumbersArchive.sumOddV1(100, 1000));
        Assertions.assertEquals(13, SumOddNumbersArchive.sumOddV1(13, 13));
        Assertions.assertEquals(23, SumOddNumbersArchive.sumOddV1(23, 24));
        Assertions.assertEquals(48, SumOddNumbersArchive.sumOddV1(23, 25));
        Assertions.assertEquals(105, SumOddNumbersArchive.sumOddV1(32, 38));
    }
}