package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTeenNumberChecker {

    @Test
    void hasTeen() {
        Assertions.assertTrue(TeenNumberChecker.hasTeen(11, 12, 13));
        Assertions.assertTrue(TeenNumberChecker.hasTeen(10, 15, 20));
        Assertions.assertTrue(TeenNumberChecker.hasTeen(19, 11, 12));
        Assertions.assertTrue(TeenNumberChecker.hasTeen(-40, -1, 18));
        Assertions.assertTrue(TeenNumberChecker.hasTeen(0, 14, 0));

        Assertions.assertFalse(TeenNumberChecker.hasTeen(-40, -1, -18));
        Assertions.assertFalse(TeenNumberChecker.hasTeen(-19, 10, 25));
        Assertions.assertFalse(TeenNumberChecker.hasTeen(-19, -13, 25));
        Assertions.assertFalse(TeenNumberChecker.hasTeen(0, 0, 0));
        Assertions.assertFalse(TeenNumberChecker.hasTeen(5, 12, 20));
    }

    @Test
    void isTeen() {
        Assertions.assertTrue(TeenNumberChecker.isTeen(13));
        Assertions.assertTrue(TeenNumberChecker.isTeen(19));
        Assertions.assertTrue(TeenNumberChecker.isTeen(14));
        Assertions.assertTrue(TeenNumberChecker.isTeen(18));

        Assertions.assertFalse(TeenNumberChecker.isTeen(0));
        Assertions.assertFalse(TeenNumberChecker.isTeen(-13));
        Assertions.assertFalse(TeenNumberChecker.isTeen(-19));
        Assertions.assertFalse(TeenNumberChecker.isTeen(-15));
        Assertions.assertFalse(TeenNumberChecker.isTeen(20));
        Assertions.assertFalse(TeenNumberChecker.isTeen(12));
    }

}