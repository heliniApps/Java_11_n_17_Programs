package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    void isPalindrome() {

        Assertions.assertTrue(PalindromeNumber.isPalindrome(101));
        Assertions.assertTrue(PalindromeNumber.isPalindrome(-1221));
        Assertions.assertTrue(PalindromeNumber.isPalindrome(707));
        Assertions.assertTrue(PalindromeNumber.isPalindrome(11));

        Assertions.assertFalse(PalindromeNumber.isPalindrome(11212));
        Assertions.assertFalse(PalindromeNumber.isPalindrome(-123));
    }

    @Test
    void getReversedNumber() {
        Assertions.assertEquals(101, PalindromeNumber.getReversedNumber(101));
        Assertions.assertEquals(-1221, PalindromeNumber.getReversedNumber(-1221));
        Assertions.assertEquals(707, PalindromeNumber.getReversedNumber(707));
        Assertions.assertEquals(21211, PalindromeNumber.getReversedNumber(11212));
    }
}
