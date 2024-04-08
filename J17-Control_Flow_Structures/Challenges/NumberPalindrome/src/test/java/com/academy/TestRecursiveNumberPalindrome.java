package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestRecursiveNumberPalindrome {

    @Test
    void isPalindrome() {
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-121));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-1221));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-12321));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-1001));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-22));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-77));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-2));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(-9));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(0));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(1));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(5));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(55));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(99));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(121));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(1221));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(12321));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(1001));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(707));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(808));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(4884));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(345676543));
        Assertions.assertTrue(RecursiveNumberPalindrome.isPalindrome(34566543));

        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(-2345));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(-1002));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(-122));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(-567965));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(-12));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(-43));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(2345));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(1220));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(100));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(122));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(56));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(70));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(5677865));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(Integer.MAX_VALUE));
        Assertions.assertFalse(RecursiveNumberPalindrome.isPalindrome(Integer.MIN_VALUE));
    }

    @Test
    void reverse() {
        /*RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(-221, RecursiveNumberPalindrome.reverse(-122));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(-654, RecursiveNumberPalindrome.reverse(-456));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(-1, RecursiveNumberPalindrome.reverse(-100));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(-7007, RecursiveNumberPalindrome.reverse(-7007));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(-3, RecursiveNumberPalindrome.reverse(-3));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(0, RecursiveNumberPalindrome.reverse(0));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(2, RecursiveNumberPalindrome.reverse(2));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(34, RecursiveNumberPalindrome.reverse(43));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(1, RecursiveNumberPalindrome.reverse(100));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(321, RecursiveNumberPalindrome.reverse(123));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(87654, RecursiveNumberPalindrome.reverse(45678));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(1221, RecursiveNumberPalindrome.reverse(1221));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(234432, RecursiveNumberPalindrome.reverse(234432));
        RecursiveNumberPalindrome.clearReverseNumber();

        Assertions.assertEquals(2345432, RecursiveNumberPalindrome.reverse(2345432));
        RecursiveNumberPalindrome.clearReverseNumber();*/
    }
}