package academy.learnprogramming;

public class LargestPrime {

    /**
     * Calculates the largest prime factor of a given number.
     * @param number - Find the largest prime factor of this given number.
     * @return - Returns the largest prime factor of the given number.
     */
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int maxPrime = 0;

        for (int i=2; i <= number; i++) {
            if (((number % i) == 0) && isPrimeNumber(i)) {
                maxPrime = Math.max(maxPrime, i);
            }
        }

        if (maxPrime == 0) {
            return -1;
        }

        return maxPrime;
    }

    static boolean isPrimeNumber(int number) {

        if (number == 1) {
            return false;
        }

        for (int i=2; i <= (number/2); i++) {
            if ((number % i) == 0) {
                return false;
            }
        }

        return true;
    }

    // Option 2:
    /*public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int maxPrime = 0;

        for (int i=2; i <= number; i++) {
            if ((number % i) == 0) {
                boolean isPrimeNum = true;

                for (int j=2; j <= (i/2); j++) {
                    if ((i % j) == 0) {
                        isPrimeNum = false;
                        break;
                    }
                }

                if (isPrimeNum) {
                    maxPrime = Math.max(maxPrime, i);
                }
            }
        }

        if (maxPrime <= 0) {
            return -1;
        }

        return maxPrime;
    }*/
}
