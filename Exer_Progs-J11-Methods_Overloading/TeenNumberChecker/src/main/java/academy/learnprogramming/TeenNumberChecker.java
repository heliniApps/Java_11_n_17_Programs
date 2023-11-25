package academy.learnprogramming;

public class TeenNumberChecker {

    public static boolean hasTeenNumber(int param1, int param2, int param3) {

        boolean hasTeenNum = false;

        if (isTeenNumber(param1)) {
            hasTeenNum = true;
        } else if (isTeenNumber(param2)) {
            hasTeenNum = true;
        } else if (isTeenNumber(param3)) {
            hasTeenNum = true;
        }

        return hasTeenNum;
    }

    public static boolean isTeenNumber(int param) {

        return ((param >= 13) && (param <= 19));
    }
}