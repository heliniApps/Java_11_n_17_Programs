package com.academy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDecimalComparator {

    @Test
    void areEqualByThreeDecimalPlaces() {
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(0, 0));
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(34.25, 34.25));
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-150.322, -150.322));
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-150.4567, -150.4569));

        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(0, 1));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-2.45, -2.467));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(2.45, 2.467));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(2.345, 2.789));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(10.345, 2.789));
    }
}