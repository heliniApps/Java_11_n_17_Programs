package com.academy.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestSumDivisibleByThreeAndFive {

    @Test
    void isDivisibleByThreeAndFive() {
        Assertions.assertTrue(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(15));
        Assertions.assertTrue(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(30));
        Assertions.assertTrue(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(60));
        Assertions.assertTrue(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(105));

        Assertions.assertFalse(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(24));
        Assertions.assertFalse(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(35));
        Assertions.assertFalse(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(40));
        Assertions.assertFalse(SumDivisibleByThreeAndFive.isDivisibleByThreeAndFive(84));
    }
}
