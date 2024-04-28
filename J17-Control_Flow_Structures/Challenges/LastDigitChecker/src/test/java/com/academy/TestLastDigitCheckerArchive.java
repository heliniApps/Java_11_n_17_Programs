package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLastDigitCheckerArchive {

    @Test
    void hasSameLastDigitV4() {
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(41, 22, 71));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(23, 32, 42));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(11, 51, 23));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(44, 44, 44));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(75, 75, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(75, 57, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(10, 1000, 998));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV4(11, 99, 999));

        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(-10, -45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(-10, 45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(10, -45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(10, 45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(0, 0, 0));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(11, 23, 45));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(34, 333, 555));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(10, 87, 998));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(9, 99, 999));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(90, 9, 600));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(16, 56, 9));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(1001, 51, 201));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(444, 1001, 44));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV4(303, 33, 1001));
    }

    @Test
    void hasSameLastDigitV3() {
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(41, 22, 71));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(23, 32, 42));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(11, 51, 23));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(44, 44, 44));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(75, 75, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(75, 57, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(10, 1000, 998));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV3(11, 99, 999));

        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(-10, -45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(-10, 45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(10, -45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(10, 45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(0, 0, 0));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(11, 23, 45));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(34, 333, 555));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(10, 87, 998));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(9, 99, 999));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(90, 9, 600));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(16, 56, 9));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(1001, 51, 201));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(444, 1001, 44));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV3(303, 33, 1001));
    }

    @Test
    void hasSameLastDigitV2() {
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(41, 22, 71));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(23, 32, 42));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(11, 51, 23));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(44, 44, 44));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(75, 75, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(75, 57, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(10, 1000, 998));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV2(11, 99, 999));

        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(-10, -45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(-10, 45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(10, -45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(10, 45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(0, 0, 0));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(11, 23, 45));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(34, 333, 555));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(10, 87, 998));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(9, 99, 999));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(90, 9, 600));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(16, 56, 9));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(1001, 51, 201));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(444, 1001, 44));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV2(303, 33, 1001));
    }

    @Test
    void hasSameLastDigitV1() {
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(41, 22, 71));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(23, 32, 42));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(11, 51, 23));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(44, 44, 44));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(75, 75, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(75, 57, 75));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(10, 1000, 998));
        Assertions.assertTrue(LastDigitCheckerArchive.hasSameLastDigitV1(11, 99, 999));

        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(-10, -45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(-10, 45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(10, -45, 55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(10, 45, -55));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(0, 0, 0));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(11, 23, 45));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(34, 333, 555));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(10, 87, 998));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(9, 99, 999));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(90, 9, 600));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(16, 56, 9));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(1001, 51, 201));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(444, 1001, 44));
        Assertions.assertFalse(LastDigitCheckerArchive.hasSameLastDigitV1(303, 33, 1001));
    }
}