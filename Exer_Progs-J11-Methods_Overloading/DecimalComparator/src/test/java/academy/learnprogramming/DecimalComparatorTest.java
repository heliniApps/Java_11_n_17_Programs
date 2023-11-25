package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlaces() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(78.90765, 78.9078));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(0, 0));

        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.123, -3.123));
    }

    @Test
    void areEqualByThreeDecimalPlaces_v2() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v2(-3.1756, -3.175));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v2(3.0, 3.0));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v2(78.90765, 78.9078));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v2(0, 0));

        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(3.175, 3.176));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(-3.123, 3.123));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(3.123, -3.123));
    }

    @Test
    void areEqualByThreeDecimalPlaces_v3() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v3(78.90765, 78.90788));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v3(78.90765, 78.907));

        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v3(78.90765, 78.98));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v3(78.90765, 78));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v3(-78.90765, 78.907));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v3(78.90765, -78.907));
    }
}