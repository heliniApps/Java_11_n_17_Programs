package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestNumberPalindromeArchive {

    @Test
    void isPalindromeV3() {
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-121));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-1221));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-12321));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-1001));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-22));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-77));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-2));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(-9));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(0));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(1));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(5));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(55));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(99));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(121));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(1221));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(12321));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(1001));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(707));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(808));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(4884));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(345676543));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV3(34566543));

        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(-2345));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(-1002));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(-122));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(-567965));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(-12));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(-43));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(2345));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(1220));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(100));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(122));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(56));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(70));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(5677865));

        /* Causes NumberFormatException, because Math.abs(Integer.MIN_VALUE) returns a negative value.
           When it is reversed, minus sign is at the end of the number. (e.g.: 8463847412-) */
        // Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(Integer.MIN_VALUE));

        /* Causes NumberFormatException, because reversed number is larger than Integer.MAX_VALUE and,
           can't be parsed to an Integer. */
        // Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV3(Integer.MAX_VALUE));
    }

    @Test
    void isPalindromeV2() {
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-121));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-1221));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-12321));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-1001));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-22));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-77));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-2));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(-9));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(0));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(1));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(5));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(55));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(99));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(121));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(1221));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(12321));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(1001));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(707));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(808));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(4884));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(345676543));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV2(34566543));

        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(-2345));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(-1002));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(-122));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(-567965));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(-12));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(-43));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(2345));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(1220));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(100));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(122));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(56));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(70));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(5677865));
        // Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(Integer.MIN_VALUE));
        // Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV2(Integer.MAX_VALUE));
    }

    @Test
    void isPalindromeV1() {
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-121));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-1221));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-12321));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-1001));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-22));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-77));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-2));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(-9));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(0));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(1));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(5));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(55));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(99));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(121));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(1221));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(12321));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(1001));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(707));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(808));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(4884));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(345676543));
        Assertions.assertTrue(NumberPalindromeArchive.isPalindromeV1(34566543));

        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(-2345));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(-1002));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(-122));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(-567965));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(-12));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(-43));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(2345));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(1220));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(100));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(122));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(56));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(70));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(5677865));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(Integer.MIN_VALUE));
        Assertions.assertFalse(NumberPalindromeArchive.isPalindromeV1(Integer.MAX_VALUE));
    }
}