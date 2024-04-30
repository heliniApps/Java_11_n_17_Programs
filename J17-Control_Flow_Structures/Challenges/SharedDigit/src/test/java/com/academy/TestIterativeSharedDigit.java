package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestIterativeSharedDigit {

    @Test
    void hasSharedDigitV7() {
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(10, 20));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(13, 34));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(54, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(99, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(10, 61));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(39, 99));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(40, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(10, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV7(99, 99));

        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(0, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(1, 2));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(0, 10));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(99, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(10, 4));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(9, 78));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(56, 5));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(11, 23));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(41, 22));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(-8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV7(44, -44));
    }

    @Test
    void hasSharedDigitV8() {
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(10, 20));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(13, 34));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(54, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(99, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(10, 61));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(39, 99));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(40, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(10, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV8(99, 99));

        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(0, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(1, 2));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(0, 10));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(99, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(10, 4));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(9, 78));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(56, 5));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(11, 23));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(41, 22));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(-8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV8(44, -44));
    }

    @Test
    void hasSharedDigitV9() {
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(10, 20));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(13, 34));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(54, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(99, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(10, 61));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(39, 99));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(40, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(10, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV9(99, 99));

        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(0, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(1, 2));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(0, 10));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(99, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(10, 4));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(9, 78));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(56, 5));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(11, 23));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(41, 22));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(-8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV9(44, -44));
    }

    @Test
    void hasSharedDigitV10() {
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(10, 20));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(13, 34));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(54, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(99, 95));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(10, 61));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(39, 99));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(40, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(10, 10));
        Assertions.assertTrue(IterativeSharedDigit.hasSharedDigitV10(99, 99));

        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(0, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(1, 2));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(0, 10));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(99, 0));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(10, 4));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(9, 78));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(56, 5));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(11, 23));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(41, 22));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(-8, 88));
        Assertions.assertFalse(IterativeSharedDigit.hasSharedDigitV10(44, -44));
    }
}