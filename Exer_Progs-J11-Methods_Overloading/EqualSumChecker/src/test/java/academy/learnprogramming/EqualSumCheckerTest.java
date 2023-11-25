package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualSumCheckerTest {

    @Test
    void hasEqualSum() {
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1,1,2));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1,-1,0));

        Assertions.assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));
    }
}
