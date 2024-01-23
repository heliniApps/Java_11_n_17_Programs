package academy.learnProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlourPackerTest {

    @Test
    void canPack() {
        assertTrue(FlourPacker.canPack(1, 0, 5));
        assertTrue(FlourPacker.canPack(0, 5, 4));
        assertTrue(FlourPacker.canPack(2, 2, 11));
        assertTrue(FlourPacker.canPack(0, 7, 6));
        assertTrue(FlourPacker.canPack(0, 7, 7));
        assertTrue(FlourPacker.canPack(2, 0, 10));
        assertTrue(FlourPacker.canPack(0, 5, 5));
        assertTrue(FlourPacker.canPack(2, 10, 18));

        assertFalse(FlourPacker.canPack(1, -3, 5));
        assertFalse(FlourPacker.canPack(1, 0, 4));
        assertFalse(FlourPacker.canPack(0, 4, 6));
    }
}
