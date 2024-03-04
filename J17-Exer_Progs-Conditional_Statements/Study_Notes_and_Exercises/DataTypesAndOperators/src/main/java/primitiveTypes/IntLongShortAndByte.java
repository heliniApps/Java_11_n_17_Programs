package main.java.primitiveTypes;

public class IntLongShortAndByte {

    public static void main(String args[]) {
        // Int
        integerOverflowAndUnderflow();
        assigningOutOfBoundsIntegers();

        // Long
        assigningLongAndIntLiterals();

        // Short
        assigningShortAndIntLiterals();

        calcWithDifferentDataTypes();
    }


    /*
     * Overflow -> assigning a larger value than the Int MAX_VALUE.
     * (value overflows and wraps around to minimum range, becoming a minus/negative number)
     *
     * Underflow -> assigning a smaller value than the Integer MIN_VALUE.
     *
     * This is also called 'integer wraparounds'.
     * Overflow or underflow situation usually happens during evaluating an expression,
     * that is not a simple literal value.
     * Compiler doesn't attempt to evaluate the expression to determine the value.
     * When it occurs, program usually wraps the value around, and continues to process.
     * It doesn't throw an error.
     */
    public static void integerOverflowAndUnderflow() {

        int overflowInt = Integer.MAX_VALUE + 1;
        int underflowInt = Integer.MIN_VALUE - 1;

        System.out.printf("Integer Overflow: %d %n", overflowInt);
        System.out.printf("Integer Underflow: %d %n%n", underflowInt);
    }


    /**
     * Compiler can check the bounds of Integer literals during compile time.
     * Therefore, this situation throws compiler error.
     */
    public static void assigningOutOfBoundsIntegers() {

        // int myPositiveNum = 2147483649;
        /* Error -> integer number too large */

        // int myNegativeNum = -2_147_483_650;
        /* Error -> integer number too large */
    }


    /*
     * Default data type for whole numbers is 'Integer'.
     *
     * Any numeric literal that exceeds the value of Integer.MAX_VALUE, must use the 'L' suffix,
     * to indicate it's a Long value.
     *
     */
    public static void assigningLongAndIntLiterals() {

        /* Assigns the value as an Integer. */
        long smallLongNum = 100;

        /* Assigns the value as a Long. */
        smallLongNum = 100L;
        System.out.println("Small Long val: " + smallLongNum);

        // long largeLongNum = 2147483650;  // Compile Error. Value exceeds Integer.MAX_VALUE.

        long largeLongNum = 2147483650L;
        System.out.printf("Large Long num: %d %n%n", largeLongNum);
    }


    public static void assigningShortAndIntLiterals() {

        /* '32700' is considered an Integer. But it's less than Short.MAX_VALUE. Therefore, it's accepted. */
        short smallShortNum = 32700;
        System.out.println("Small Short value: " + smallShortNum + "\n");

        // short largeShortVal = 32769;
        /* Error ->  incompatible types: possible lossy conversion from int to short */
    }


    public static void calcWithDifferentDataTypes() {
        int minIntVal = Integer.MIN_VALUE;
        short minShortVal = Short.MIN_VALUE;
        byte minByteVal = Byte.MIN_VALUE, maxByteVal = Byte.MAX_VALUE;  // Valid variable declaration. Same Data Type.

        // byte secondByteVal = (minByteVal / 2);
        /* Error is thrown, because java doesn't evaluate variables in the expression (e.g.: minByteVal),
         * to see if it fits the specified data type. */

        byte thirdByteVal = (127 / 2);
        System.out.println("thirdByteVal: " + thirdByteVal + "\n");
        /* NO Error. Because Java can make assumptions about numeric literals in an expression,
         * and see if the result fits the defined variable's Data Type. */
    }
}
