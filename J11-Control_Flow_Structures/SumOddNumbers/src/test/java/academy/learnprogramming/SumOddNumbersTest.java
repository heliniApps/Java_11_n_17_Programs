package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOddNumbersTest {

    @Test
    void isOdd() {
        Assertions.assertTrue(SumOddNumbers.isOdd(1));
        Assertions.assertTrue(SumOddNumbers.isOdd(13));

        Assertions.assertFalse(SumOddNumbers.isOdd(20));
    }

    @Test
    void sumOdd() {
        Assertions.assertEquals(2500, SumOddNumbers.sumOdd(1, 100));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(-1, 100));
        Assertions.assertEquals(0, SumOddNumbers.sumOdd(100, 100));
        Assertions.assertEquals(13, SumOddNumbers.sumOdd(13, 13));
        Assertions.assertEquals(-1, SumOddNumbers.sumOdd(100, -100));
        Assertions.assertEquals(247500, SumOddNumbers.sumOdd(100, 1000));
    }
}
