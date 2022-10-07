package com.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void add() {
        ComplexNumber complexNum = new ComplexNumber(5, 10);
        complexNum.add(3, -4);
        assertEquals(8, complexNum.getReal());
        assertEquals(6, complexNum.getImaginary());
    }

    @Test
    void testAdd() {
        ComplexNumber complexNum = new ComplexNumber(5, 10);
        ComplexNumber complexNum2 = new ComplexNumber(-5, 5);
        complexNum.add(complexNum2);
        assertEquals(0, complexNum.getReal());
        assertEquals(15, complexNum.getImaginary());
    }

    @Test
    void subtract() {
        ComplexNumber complexNum = new ComplexNumber(5, 10);
        complexNum.subtract(-3, 7);
        assertEquals(8, complexNum.getReal());
        assertEquals(3, complexNum.getImaginary());
    }

    @Test
    void testSubtract() {
        ComplexNumber complexNum = new ComplexNumber(5, 10);
        ComplexNumber complexNum2 = new ComplexNumber(-5, 5);
        complexNum.subtract(complexNum2);
        assertEquals(10, complexNum.getReal());
        assertEquals(5, complexNum.getImaginary());
    }
}