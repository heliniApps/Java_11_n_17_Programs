package academy.learnprogramming;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        return (getFirstDigit(number) + getLastDigit(number));
    }

    static int getLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        return (number % 10);
    }

    static int getFirstDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;

        while (number > 0) {
            int leastSignificantNum = number % 10;
            number /= 10;

            if (number == 0) {
                firstDigit =  leastSignificantNum;
                break;
            }
        }

        return firstDigit;
    }
}
