package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {

    @Test
    void getArea() {

        Floor floor = new Floor(3, 5);
        assertEquals(15, floor.getArea());

        floor.setWidth(-1);
        floor.setLength(4);
        assertEquals(0, floor.getArea());

    }
}