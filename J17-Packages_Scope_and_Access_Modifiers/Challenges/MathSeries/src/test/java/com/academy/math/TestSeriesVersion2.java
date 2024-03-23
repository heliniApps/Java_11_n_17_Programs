package com.academy.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSeriesVersion2 {

    @Test
    void nSumV2() {
        Assertions.assertEquals(-1, SeriesVersion2.nSumV2(-1));
        Assertions.assertEquals(-1, SeriesVersion2.nSumV2(-2));
        Assertions.assertEquals(-1, SeriesVersion2.nSumV2(-10));
        Assertions.assertEquals(-1, SeriesVersion2.nSumV2(-86));

        Assertions.assertEquals(0, SeriesVersion2.nSumV2(0));
        Assertions.assertEquals(1, SeriesVersion2.nSumV2(1));
        Assertions.assertEquals(3, SeriesVersion2.nSumV2(2));
        Assertions.assertEquals(6, SeriesVersion2.nSumV2(3));
        Assertions.assertEquals(10, SeriesVersion2.nSumV2(4));
        Assertions.assertEquals(15, SeriesVersion2.nSumV2(5));
        Assertions.assertEquals(21, SeriesVersion2.nSumV2(6));
        Assertions.assertEquals(28, SeriesVersion2.nSumV2(7));
        Assertions.assertEquals(36, SeriesVersion2.nSumV2(8));
        Assertions.assertEquals(45, SeriesVersion2.nSumV2(9));
        Assertions.assertEquals(55, SeriesVersion2.nSumV2(10));
        Assertions.assertEquals(2850, SeriesVersion2.nSumV2(75));
        Assertions.assertEquals(2305843008139952128L, SeriesVersion2.nSumV2(Integer.MAX_VALUE));
    }


    @Test
    void fibonacciV3() {
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV3(-1));
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV3(-2));
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV3(-10));

        Assertions.assertEquals(0, SeriesVersion2.fibonacciV3(0));
        Assertions.assertEquals(1, SeriesVersion2.fibonacciV3(1));
        Assertions.assertEquals(1, SeriesVersion2.fibonacciV3(2));
        Assertions.assertEquals(2, SeriesVersion2.fibonacciV3(3));
        Assertions.assertEquals(3, SeriesVersion2.fibonacciV3(4));
        Assertions.assertEquals(5, SeriesVersion2.fibonacciV3(5));
        Assertions.assertEquals(8, SeriesVersion2.fibonacciV3(6));
        Assertions.assertEquals(13, SeriesVersion2.fibonacciV3(7));
        Assertions.assertEquals(21, SeriesVersion2.fibonacciV3(8));
        Assertions.assertEquals(34, SeriesVersion2.fibonacciV3(9));
        Assertions.assertEquals(55, SeriesVersion2.fibonacciV3(10));
        Assertions.assertEquals(610, SeriesVersion2.fibonacciV3(15));
    }

    @Test
    void fibonacciV2() {
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV2(-1));
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV2(-2));
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV2(-10));

        Assertions.assertEquals(0, SeriesVersion2.fibonacciV2(0));
        Assertions.assertEquals(1, SeriesVersion2.fibonacciV2(1));
        Assertions.assertEquals(1, SeriesVersion2.fibonacciV2(2));
        Assertions.assertEquals(2, SeriesVersion2.fibonacciV2(3));
        Assertions.assertEquals(3, SeriesVersion2.fibonacciV2(4));
        Assertions.assertEquals(5, SeriesVersion2.fibonacciV2(5));
        Assertions.assertEquals(8, SeriesVersion2.fibonacciV2(6));
        Assertions.assertEquals(13, SeriesVersion2.fibonacciV2(7));
        Assertions.assertEquals(21, SeriesVersion2.fibonacciV2(8));
        Assertions.assertEquals(34, SeriesVersion2.fibonacciV2(9));
        Assertions.assertEquals(55, SeriesVersion2.fibonacciV2(10));
        Assertions.assertEquals(610, SeriesVersion2.fibonacciV2(15));
    }

    @Test
    void fibonacciV1() {
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV1(-1));
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV1(-2));
        Assertions.assertEquals(-1, SeriesVersion2.fibonacciV1(-10));

        Assertions.assertEquals(0, SeriesVersion2.fibonacciV1(0));
        Assertions.assertEquals(1, SeriesVersion2.fibonacciV1(1));
        Assertions.assertEquals(1, SeriesVersion2.fibonacciV1(2));
        Assertions.assertEquals(2, SeriesVersion2.fibonacciV1(3));
        Assertions.assertEquals(3, SeriesVersion2.fibonacciV1(4));
        Assertions.assertEquals(5, SeriesVersion2.fibonacciV1(5));
        Assertions.assertEquals(8, SeriesVersion2.fibonacciV1(6));
        Assertions.assertEquals(13, SeriesVersion2.fibonacciV1(7));
        Assertions.assertEquals(21, SeriesVersion2.fibonacciV1(8));
        Assertions.assertEquals(34, SeriesVersion2.fibonacciV1(9));
        Assertions.assertEquals(55, SeriesVersion2.fibonacciV1(10));
        Assertions.assertEquals(610, SeriesVersion2.fibonacciV1(15));
    }
}
