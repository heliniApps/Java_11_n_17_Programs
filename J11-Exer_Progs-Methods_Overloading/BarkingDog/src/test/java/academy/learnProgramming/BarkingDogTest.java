package academy.learnProgramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarkingDogTest {

    @Test
    public void shouldWakeUp() {

        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 1));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 2));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 8));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, -1));

    }

    @Test
    public void isValidHourOfDay() {

        Assertions.assertTrue(BarkingDog.isValidHourOfDay(1));
        Assertions.assertTrue(BarkingDog.isValidHourOfDay(2));
        Assertions.assertTrue(BarkingDog.isValidHourOfDay(23));
        Assertions.assertTrue(BarkingDog.isValidHourOfDay(0));

        Assertions.assertFalse(BarkingDog.isValidHourOfDay(8));
        Assertions.assertFalse(BarkingDog.isValidHourOfDay(-1));
        Assertions.assertFalse(BarkingDog.isValidHourOfDay(22));
        Assertions.assertFalse(BarkingDog.isValidHourOfDay(24));

    }
}
