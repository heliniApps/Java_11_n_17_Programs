package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenDigitSumTest {

    @Test
    void getEvenDigitSum() {
        Assertions.assertEquals(4, EvenDigitSum.getEvenDigitSum(252));
        Assertions.assertEquals(-1, EvenDigitSum.getEvenDigitSum(-22));
        Assertions.assertEquals(20, EvenDigitSum.getEvenDigitSum(123456789));
    }
}
