package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestNumberPalindrome {

    @Test
    void isPalindrome() {
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-121));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-1221));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-12321));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-1001));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-22));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-77));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-2));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(-9));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(0));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(1));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(5));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(55));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(99));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(121));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(1221));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(12321));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(1001));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(707));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(808));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(4884));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(345676543));
        Assertions.assertTrue(NumberPalindrome.isPalindrome(34566543));

        Assertions.assertFalse(NumberPalindrome.isPalindrome(-2345));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(-1002));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(-122));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(-567965));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(-12));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(-43));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(2345));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(1220));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(100));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(122));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(56));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(70));
        Assertions.assertFalse(NumberPalindrome.isPalindrome(5677865));

        /* Reversing the Integer.MAX_VALUE causes an overflow.
         * Therefore, it alters the reversed value even before the comparison. */
        Assertions.assertFalse(NumberPalindrome.isPalindrome(Integer.MAX_VALUE));

        /* Reversing the Integer.MIN_VALUE causes an underflow. */
        Assertions.assertFalse(NumberPalindrome.isPalindrome(Integer.MIN_VALUE));
    }
}