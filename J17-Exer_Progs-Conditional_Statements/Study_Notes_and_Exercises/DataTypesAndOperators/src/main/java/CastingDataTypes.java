package main.java;

public class CastingDataTypes {

    public static void main(String args[]) {

        castingIntToByte();
        valueOverflowWithCasting();
        castingIntToChar();
    }

    public static void castingIntToByte() {
        byte minByteValue = Byte.MIN_VALUE;
        byte secondByteVal = 2;

        /* ERROR. Below expr uses a variable and '2' literal value.
         * Default Data Type of the result is 'Integer'.
         * Compiler can't determine if the result is within bounds for Byte.
         */
        // byte divideByTwoLiteral = minByteValue / 2;

        /* ERROR. Below expr uses two 'Byte' type variables.
         * Still the compiler doesn't make assumptions about whether the result fits
         * the defined variable's Data Type. */
        // byte divideByByteTwo = minByteValue / secondByteVal;

        byte divideByTwoLiteral = (byte) (minByteValue / 2);
        System.out.printf("divideByTwoLiteral : %d %n", divideByTwoLiteral);

        byte divideByByteTwo = (byte) (minByteValue / secondByteVal);
        System.out.printf("divideByByteTwo : %d %n%n", divideByByteTwo);
    }

    public static void valueOverflowWithCasting() {
        byte maxByteValue = Byte.MAX_VALUE;
        byte thirdByteVal = 5;
        byte overflowByte = (byte) (maxByteValue + thirdByteVal); /* Compiler doesn't check if the result overflows/wraps around. */

        System.out.printf("Adding %2$d and %1$d. Expected result is %3$d. %n",
                thirdByteVal, maxByteValue, (maxByteValue + thirdByteVal));

        System.out.printf("Byte Overflow result : %d %n%n", overflowByte);
    }

    public static void castingIntToChar() {
        int numericValN = 78;
        // char charLiteralN = numericValN;     // Invalid

        char charLiteralN = (char) numericValN;     // Valid
        System.out.println("Casting 'int' to 'char' : " + charLiteralN);
    }
}