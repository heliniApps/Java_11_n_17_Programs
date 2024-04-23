package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSharedDigit {

    @Test
    void hasSharedDigit() {
        Assertions.assertTrue(SharedDigit.hasSharedDigit(10, 20));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(13, 34));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(54, 95));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(99, 95));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(10, 61));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(39, 99));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(40, 10));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(10, 10));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(99, 99));

        Assertions.assertFalse(SharedDigit.hasSharedDigit(0, 0));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(1, 2));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(0, 10));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(99, 0));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(10, 4));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(9, 78));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(56, 5));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(8, 88));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(-8, 88));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(44, -44));
    }
}