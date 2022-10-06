package academy.learnprogramming;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int arg1, int arg2, int arg3) {

        if (!isValid(arg1) || !isValid(arg2) || !isValid(arg3)) {
            return false;
        }

        int arg1LastDigit = arg1 % 10;
        int arg2LastDigit = arg2 % 10;
        int arg3LastDigit = arg3 % 10;

        if ((arg1LastDigit == arg2LastDigit)
            || (arg2LastDigit == arg3LastDigit)
            || (arg1LastDigit == arg3LastDigit)) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return ((number >= 10) && (number <= 1000));
    }
}
