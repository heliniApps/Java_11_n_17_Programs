package academy.learnprogramming;

public class EqualityPrinter {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String ALL_DIFFERENT_MESSAGE = "All numbers are different";
    private static final String EQUAL_NOR_DIFF_MESSAGE = "Neither all are equal or different";

    static boolean isEqual(int value1, int value2) {
        return (value1 == value2);
    }

    static void printEqual(int arg1, int arg2, int arg3) {
        if ((arg1 < 0) || (arg2 < 0) || (arg3 < 0)) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (isEqual(arg1, arg2) && isEqual(arg2, arg3)) {
            System.out.println(ALL_EQUAL_MESSAGE);
        } else if (!isEqual(arg1, arg2) && !isEqual(arg2, arg3) && !isEqual(arg1, arg3)) {
            System.out.println(ALL_DIFFERENT_MESSAGE);
        } else {
            System.out.println(EQUAL_NOR_DIFF_MESSAGE);
        }
    }

    static void printEqualVersion2(int arg1, int arg2, int arg3) {

        if ((arg1 < 0) || (arg2 < 0) || (arg3 < 0)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }

        if (isEqual(arg1, arg2)) {
            if (isEqual(arg2, arg3)){
                System.out.println(ALL_EQUAL_MESSAGE);
            } else {
                System.out.println(EQUAL_NOR_DIFF_MESSAGE);
            }
        } else {
            if (isEqual(arg2, arg3)) {
                System.out.println(EQUAL_NOR_DIFF_MESSAGE);
            } else if (isEqual(arg1, arg3)) {
                System.out.println(EQUAL_NOR_DIFF_MESSAGE);
            } else {
                System.out.println(ALL_DIFFERENT_MESSAGE);
            }
        }
    }
}
