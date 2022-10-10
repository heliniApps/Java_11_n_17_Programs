package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distance() {
        Point first = new Point(6,5);
        assertEquals(5.0, first.distance(2, 2));
    }

    @Test
    void testDistance() {
        Point first = new Point(6,5);
        assertEquals(7.810249675906654, first.distance());
    }

    @Test
    void testDistance1() {
        Point first = new Point(6,5);
        Point second = new Point(3, 1);
        assertEquals(5.0, first.distance(second));
    }
}