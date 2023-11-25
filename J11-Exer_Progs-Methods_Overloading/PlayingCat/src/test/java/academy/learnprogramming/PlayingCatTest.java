package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @Test
    void isCatPlaying() {

        assertTrue(PlayingCat.isCatPlaying(true, 30));
        assertTrue(PlayingCat.isCatPlaying(false, 35));
        assertTrue(PlayingCat.isCatPlaying(false, 25));
        assertTrue(PlayingCat.isCatPlaying(true, 45));

        assertFalse(PlayingCat.isCatPlaying(false, 36));
        assertFalse(PlayingCat.isCatPlaying(true, 50));
        assertFalse(PlayingCat.isCatPlaying(true, 20));
        assertFalse(PlayingCat.isCatPlaying(false, 20));
    }
}