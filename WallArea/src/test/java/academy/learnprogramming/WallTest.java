package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    @Test
    void getWidth() {

        Wall wall1 = new Wall();
        assertEquals(0, wall1.getWidth());

        Wall wall2 = new Wall(3, 5);
        assertEquals(3, wall2.getWidth());

        Wall wall3 = new Wall(-3, 5);
        assertEquals(0, wall3.getWidth());
    }

    @Test
    void getHeight() {

        Wall wall1 = new Wall();
        assertEquals(0, wall1.getHeight());

        Wall wall2 = new Wall(3, 5);
        assertEquals(5, wall2.getHeight());

        Wall wall3 = new Wall(3, -5);
        assertEquals(0, wall3.getHeight());
    }

    @Test
    void getArea() {

        Wall wall1 = new Wall();
        assertEquals(0, wall1.getArea());

        Wall wall2 = new Wall(3, 5);
        assertEquals(15, wall2.getArea());

        Wall wall3 = new Wall(-3, 5);
        assertEquals(0, wall3.getArea());
    }
}