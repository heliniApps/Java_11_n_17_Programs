package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLastDigitChecker {

    @Test
    void isValid() {
        Assertions.assertTrue(LastDigitChecker.isValid(10));
        Assertions.assertTrue(LastDigitChecker.isValid(11));
        Assertions.assertTrue(LastDigitChecker.isValid(19));
        Assertions.assertTrue(LastDigitChecker.isValid(50));
        Assertions.assertTrue(LastDigitChecker.isValid(75));
        Assertions.assertTrue(LastDigitChecker.isValid(234));
        Assertions.assertTrue(LastDigitChecker.isValid(345));
        Assertions.assertTrue(LastDigitChecker.isValid(999));
        Assertions.assertTrue(LastDigitChecker.isValid(1000));

        Assertions.assertFalse(LastDigitChecker.isValid(-1));
        Assertions.assertFalse(LastDigitChecker.isValid(-10));
        Assertions.assertFalse(LastDigitChecker.isValid(0));
        Assertions.assertFalse(LastDigitChecker.isValid(1));
        Assertions.assertFalse(LastDigitChecker.isValid(9));
        Assertions.assertFalse(LastDigitChecker.isValid(1001));
        Assertions.assertFalse(LastDigitChecker.isValid(-1000));
        Assertions.assertFalse(LastDigitChecker.isValid(1200));
    }

    @Test
    void hasSameLastDigit() {
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(11, 51, 23));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(44, 44, 44));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(75, 75, 75));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(75, 57, 75));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(10, 1000, 998));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(11, 99, 999));

        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(-10, -45, -55));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(-10, 45, 55));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(10, -45, 55));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(10, 45, -55));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(0, 0, 0));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(11, 23, 45));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(34, 333, 555));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(10, 87, 998));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(90, 9, 600));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(16, 56, 9));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(1001, 51, 201));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(444, 1001, 44));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(303, 33, 1001));
    }
}