package com.academy.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPrimeNumberChallenge {

    @Test
    void isPrimeNumber() {
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(2));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(3));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(5));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(7));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(11));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(13));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(23));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(251));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(257));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(263));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(659));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumber(661));

        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(0));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(1));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(4));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(9));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(12));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(72));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(100));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(158));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(410));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumber(996));

        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-1));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-2));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-3));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-4));
    }

    @Test
    void isPrimeNumberV2() {
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(2));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(3));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(5));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(7));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(11));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(13));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(23));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(251));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(257));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(263));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(659));
        Assertions.assertTrue(PrimeNumberChallenge.isPrimeNumberV2(661));

        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(0));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(1));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(4));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(9));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(12));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(72));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(100));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(158));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(410));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(996));

        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-1));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-2));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-3));
        Assertions.assertFalse(PrimeNumberChallenge.isPrimeNumberV2(-4));
    }
}
