package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    @Test
    void getCost() {

        Carpet carpet = new Carpet(7.80);
        assertEquals(7.80, carpet.getCost());

        Carpet carpet2 = new Carpet(-7.80);
        assertEquals(0, carpet2.getCost());

    }
}