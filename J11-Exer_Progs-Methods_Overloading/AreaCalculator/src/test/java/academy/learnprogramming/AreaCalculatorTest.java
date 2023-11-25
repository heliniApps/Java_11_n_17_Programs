package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {

    @Test
    void circleArea() {

        Assertions.assertEquals(63.61725123519331, AreaCalculator.area(4.5));
        Assertions.assertEquals(-1.0, AreaCalculator.area(-4.5));
    }

    @Test
    void rectangleArea() {

        Assertions.assertEquals(27.0, AreaCalculator.area(4.5, 6));
        Assertions.assertEquals(-1.0, AreaCalculator.area(-4.5, 6));
    }

}
