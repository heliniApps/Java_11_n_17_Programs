package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDaysInMonthArchive {

    @Test
    void getDaysInMonthV3() {
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(0, 2000));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(-1, 2023));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(-5, 2022));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(-12, 2022));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(-13, 2024));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(13, 2024));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(15, 2017));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(1, 0));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(3, -1600));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(12, 10000));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV3(10, 16000));

        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV3(1, 2024));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV3(1, 2017));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV3(2, 2024));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV3(2, 2000));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV3(2, 1600));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV3(2, 1601));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV3(2, 2017));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV3(2, 2023));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV3(12, 2022));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV3(12, 1600));
        Assertions.assertEquals(30, DaysInMonthArchive.getDaysInMonthV3(11, 2021));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV3(10, 2020));
        Assertions.assertEquals(30, DaysInMonthArchive.getDaysInMonthV3(4, 2024));
    }

    @Test
    void getDaysInMonthV2() {
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(0, 2000));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(-1, 2023));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(-5, 2022));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(-12, 2022));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(-13, 2024));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(13, 2024));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(15, 2017));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(1, 0));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(3, -1600));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(12, 10000));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV2(10, 16000));

        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV2(1, 2024));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV2(1, 2017));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV2(2, 2024));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV2(2, 2000));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV2(2, 1600));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV2(2, 1601));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV2(2, 2017));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV2(2, 2023));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV2(12, 2022));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV2(12, 1600));
        Assertions.assertEquals(30, DaysInMonthArchive.getDaysInMonthV2(11, 2021));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV2(10, 2020));
        Assertions.assertEquals(30, DaysInMonthArchive.getDaysInMonthV2(4, 2024));
    }

    @Test
    void getDaysInMonthV1() {
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(0, 2000));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(-1, 2023));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(-5, 2022));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(-12, 2022));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(-13, 2024));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(13, 2024));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(15, 2017));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(1, 0));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(3, -1600));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(12, 10000));
        Assertions.assertEquals(-1, DaysInMonthArchive.getDaysInMonthV1(10, 16000));

        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV1(1, 2024));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV1(1, 2017));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV1(2, 2024));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV1(2, 2000));
        Assertions.assertEquals(29, DaysInMonthArchive.getDaysInMonthV1(2, 1600));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV1(2, 1601));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV1(2, 2017));
        Assertions.assertEquals(28, DaysInMonthArchive.getDaysInMonthV1(2, 2023));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV1(12, 2022));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV1(12, 1600));
        Assertions.assertEquals(30, DaysInMonthArchive.getDaysInMonthV1(11, 2021));
        Assertions.assertEquals(31, DaysInMonthArchive.getDaysInMonthV1(10, 2020));
        Assertions.assertEquals(30, DaysInMonthArchive.getDaysInMonthV1(4, 2024));
    }
}