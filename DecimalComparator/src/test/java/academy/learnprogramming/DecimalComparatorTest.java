package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlaces() {
    }

    @Test
    void areEqualByThreeDecimalPlaces_v2() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v2(78.90765, 78.90788));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces_v2(78.90765, 78.907));

        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(78.90765, 78.98));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(78.90765, 78));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(-78.90765, 78.907));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces_v2(78.90765, -78.907));
    }
}