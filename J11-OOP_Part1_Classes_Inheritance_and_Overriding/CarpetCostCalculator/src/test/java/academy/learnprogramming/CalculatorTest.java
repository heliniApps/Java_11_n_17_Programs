package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getTotalCost() {

        Floor floor = new Floor(3, 5);
        Carpet carpet = new Carpet(7.5);
        Calculator calc = new Calculator(floor, carpet);

        assertEquals(112.5, calc.getTotalCost());
    }
}