package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(23, 33, 45));
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(41, 22, 71));

        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(23, 24, 25));
    }

    @Test
    void isValid() {
        Assertions.assertTrue(LastDigitChecker.isValid(39));
        Assertions.assertTrue(LastDigitChecker.isValid(1000));
        Assertions.assertTrue(LastDigitChecker.isValid(10));

        Assertions.assertFalse(LastDigitChecker.isValid(9));
        Assertions.assertFalse(LastDigitChecker.isValid(1070));
        Assertions.assertFalse(LastDigitChecker.isValid(-10));
    }
}
