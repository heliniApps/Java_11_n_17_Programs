package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestEqualSumChecker {

    @Test
    void hasEqualSum() {
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(0, 0, 0));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1, -1, 0));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(-4, 5, 1));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(30, 12, 42));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(-4, -5, -9));

        Assertions.assertFalse(EqualSumChecker.hasEqualSum(0, 0, 1));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(1, -1, 1));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(1, 1, -2));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(-4, 5, 9));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(-4, -5, 9));
    }
}