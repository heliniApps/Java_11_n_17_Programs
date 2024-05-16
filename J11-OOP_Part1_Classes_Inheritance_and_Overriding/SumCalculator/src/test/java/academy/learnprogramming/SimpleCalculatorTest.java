package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void setFirstNumber() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setFirstNumber(40);
    }

    @Test
    void getFirstNumber() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setFirstNumber(40);
        assertEquals(40.0, simpleCalc.getFirstNumber());
    }

    @Test
    void setSecondNumber() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setSecondNumber(4);
    }

    @Test
    void getSecondNumber() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setSecondNumber(4);
        assertEquals(4.0, simpleCalc.getSecondNumber());
    }

    @Test
    void getAdditionResult() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setFirstNumber(40);
        simpleCalc.setSecondNumber(4);
        assertEquals(44.0, simpleCalc.getAdditionResult());
    }

    @Test
    void getSubtractionResult() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setFirstNumber(40);
        simpleCalc.setSecondNumber(-4);
        assertEquals(44.0, simpleCalc.getSubtractionResult());
    }

    @Test
    void getMultiplicationResult() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setFirstNumber(40);
        simpleCalc.setSecondNumber(-4);
        assertEquals(-160, simpleCalc.getMultiplicationResult());
    }

    @Test
    void getDivisionResult() {
        SimpleCalculator simpleCalc = new SimpleCalculator();
        simpleCalc.setFirstNumber(40);
        simpleCalc.setSecondNumber(-2);
        assertEquals(-20, simpleCalc.getDivisionResult());
    }
}