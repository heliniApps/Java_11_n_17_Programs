package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SharedDigitTest {

    @Test
    void hasSharedDigit() {
        Assertions.assertTrue(SharedDigit.hasSharedDigit(23, 12));
        Assertions.assertTrue(SharedDigit.hasSharedDigit(15, 55));

        Assertions.assertFalse(SharedDigit.hasSharedDigit(9, 99));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(-9, 89));
        Assertions.assertFalse(SharedDigit.hasSharedDigit(80, 76));
    }
}
