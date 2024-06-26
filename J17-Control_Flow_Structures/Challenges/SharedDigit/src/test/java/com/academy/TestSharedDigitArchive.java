package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSharedDigitArchive {

    @Test
    void hasSharedDigitV6() {
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(10, 20));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(13, 34));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(54, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(99, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(10, 61));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(39, 99));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(40, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(10, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV6(99, 99));

        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(0, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(1, 2));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(0, 10));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(99, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(10, 4));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(9, 78));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(56, 5));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(11, 23));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(41, 22));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(-8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV6(44, -44));
    }

    @Test
    void hasSharedDigitV5() {
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(10, 20));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(13, 34));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(54, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(99, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(10, 61));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(39, 99));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(40, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(10, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV5(99, 99));

        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(0, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(1, 2));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(0, 10));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(99, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(10, 4));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(9, 78));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(56, 5));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(11, 23));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(41, 22));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(-8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV5(44, -44));
    }

    @Test
    void hasSharedDigitV2() {
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(10, 20));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(13, 34));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(54, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(99, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(10, 61));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(39, 99));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(40, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(10, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV2(99, 99));

        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(0, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(1, 2));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(0, 10));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(99, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(10, 4));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(9, 78));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(56, 5));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(11, 23));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(41, 22));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(-8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV2(44, -44));
    }

    @Test
    void hasSharedDigitV1() {
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(10, 20));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(13, 34));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(54, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(99, 95));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(10, 61));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(39, 99));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(40, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(10, 10));
        Assertions.assertTrue(SharedDigitArchive.hasSharedDigitV1(99, 99));

        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(0, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(1, 2));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(0, 10));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(99, 0));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(10, 4));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(9, 78));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(56, 5));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(11, 23));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(41, 22));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(-8, 88));
        Assertions.assertFalse(SharedDigitArchive.hasSharedDigitV1(44, -44));
    }
}