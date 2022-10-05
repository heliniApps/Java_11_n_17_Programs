package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int arg1, int arg2) {

        if ((arg1 < 10) || (arg1 > 99)) {
            return false;
        }
        if ((arg2 < 10) || (arg2 > 99)) {
            return false;
        }

        int originalArg2 = arg2;
        boolean hasSharedDigit = false;

        do {
            int arg1LastDigit = arg1 % 10;
            arg1 /= 10;

            arg2 = originalArg2;
            while (arg2 > 0) {
                int arg2LastDigit = arg2 % 10;
                arg2 /= 10;

                if (arg1LastDigit == arg2LastDigit) {
                    hasSharedDigit = true;
                    break;
                }
            }

            if (hasSharedDigit) {
                break;
            }
        } while (arg1 > 0);

        return hasSharedDigit;
    }
}
