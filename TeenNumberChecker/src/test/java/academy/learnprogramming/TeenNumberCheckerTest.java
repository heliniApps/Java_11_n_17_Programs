package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeenNumberCheckerTest {

    @Test
    void hasTeenNumber() {

        Assertions.assertTrue(TeenNumberChecker.hasTeenNumber(1, 99, 19));
        Assertions.assertTrue(TeenNumberChecker.hasTeenNumber(23, 15, 42));
        Assertions.assertTrue(TeenNumberChecker.hasTeenNumber(14, 20, 42));
        Assertions.assertTrue(TeenNumberChecker.hasTeenNumber(14, 20, 17));

        Assertions.assertFalse(TeenNumberChecker.hasTeenNumber(22, 23, 24));
        Assertions.assertFalse(TeenNumberChecker.hasTeenNumber(0, -23, 24));
    }

    @Test
    void isTeenNumber() {

        Assertions.assertTrue(TeenNumberChecker.isTeenNumber(13));
        Assertions.assertTrue(TeenNumberChecker.isTeenNumber(15));

        Assertions.assertFalse(TeenNumberChecker.isTeenNumber(9));
        Assertions.assertFalse(TeenNumberChecker.isTeenNumber(0));
        Assertions.assertFalse(TeenNumberChecker.isTeenNumber(-3));
    }
}
