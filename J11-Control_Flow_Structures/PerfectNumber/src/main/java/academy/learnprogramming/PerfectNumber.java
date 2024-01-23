package academy.learnprogramming;

public class PerfectNumber {

    /**
     * A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
     * @param number - The integer value, to be checked if it is a perfect number.
     *                 Only accepts values greater than zero.
     * @return - Returns true, if the given value is a Perfect Number. Otherwise, returns false.
     */
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i=1; i <= (number / 2); i++) {
            if (((number % i) == 0) && (i != number)) {
                sumOfDivisors += i;
            }
        }

        return (number == sumOfDivisors);
    }
}
