package com.academy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPlayingCat {

    @Test
    void isCatPlaying() {
        // Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 25));
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 45));
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 35));
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 26));
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 44));
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 40));
        Assertions.assertTrue(PlayingCat.isCatPlaying(true, 30));

        // Not Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlaying(false, 25));
        Assertions.assertTrue(PlayingCat.isCatPlaying(false, 26));
        Assertions.assertTrue(PlayingCat.isCatPlaying(false, 30));
        Assertions.assertTrue(PlayingCat.isCatPlaying(false, 34));
        Assertions.assertTrue(PlayingCat.isCatPlaying(false, 35));

        // Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, 20));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, 24));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, 46));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, 50));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, 0));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, -1));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, -26));
        Assertions.assertFalse(PlayingCat.isCatPlaying(true, -45));

        // Not Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 20));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 24));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 36));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 44));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 45));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, 0));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, -1));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, -25));
        Assertions.assertFalse(PlayingCat.isCatPlaying(false, -35));
    }

    @Test
    void isCatPlayingV3() {
        // Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 25));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 45));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 35));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 26));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 44));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 40));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(true, 30));

        // Not Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(false, 25));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(false, 26));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(false, 30));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(false, 34));
        Assertions.assertTrue(PlayingCat.isCatPlayingV3(false, 35));

        // Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, 20));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, 24));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, 46));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, 50));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, 0));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, -1));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, -26));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(true, -45));

        // Not Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, 20));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, 24));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, 36));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, 44));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, 45));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, 0));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, -1));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, -25));
        Assertions.assertFalse(PlayingCat.isCatPlayingV3(false, -35));
    }

    @Test
    void isCatPlayingV2() {
        // Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 25));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 45));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 35));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 26));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 44));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 40));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(true, 30));

        // Not Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(false, 25));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(false, 26));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(false, 30));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(false, 34));
        Assertions.assertTrue(PlayingCat.isCatPlayingV2(false, 35));

        // Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, 20));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, 24));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, 46));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, 50));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, 0));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, -1));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, -26));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(true, -45));

        // Not Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, 20));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, 24));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, 36));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, 44));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, 45));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, 0));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, -1));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, -25));
        Assertions.assertFalse(PlayingCat.isCatPlayingV2(false, -35));
    }

    @Test
    void isCatPlayingV1() {
        // Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 25));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 45));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 35));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 26));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 44));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 40));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(true, 30));

        // Not Summer & Valid Range
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(false, 25));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(false, 26));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(false, 30));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(false, 34));
        Assertions.assertTrue(PlayingCat.isCatPlayingV1(false, 35));

        // Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, 20));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, 24));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, 46));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, 50));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, 0));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, -1));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, -26));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(true, -45));

        // Not Summer & Invalid Range
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, 20));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, 24));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, 36));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, 44));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, 45));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, 0));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, -1));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, -25));
        Assertions.assertFalse(PlayingCat.isCatPlayingV1(false, -35));
    }
}