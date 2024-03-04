package main.java.primitiveTypes;

public class PrimitiveTypesRange {

    public static void main(String args[]) {

        // Byte
        System.out.printf("Byte MAX value: %d %n", Byte.MAX_VALUE);     // 127
        System.out.printf("Byte MIN value: %d %n", Byte.MIN_VALUE);     // -128
        System.out.printf("Width of Byte: %d %n%n", Byte.SIZE); // 8

        // Short
        System.out.printf("Short MAX value: %d %n", Short.MAX_VALUE);   // 32767
        System.out.printf("Short MIN value: %d %n", Short.MIN_VALUE);   // -32768
        System.out.printf("Width of Short: %d %n%n", Short.SIZE);   // 16

        // Integer
        System.out.printf("Integer MAX value: %1d %n", Integer.MAX_VALUE);  // 2147483647
        System.out.printf("Integer MIN value: %d %n", Integer.MIN_VALUE);   // -2147483648
        System.out.printf("Width of Integer: %d %n%n", Integer.SIZE);   // 32

        // Long
        System.out.printf("Long MAX value: %d %n", Long.MAX_VALUE);     // 9223372036854775807 (2^63)
        System.out.printf("Long MIN value: %d %n", Long.MIN_VALUE);     // -9223372036854775808
        System.out.printf("Width of Long: %d %n%n", Long.SIZE); // 64

        // Float
        System.out.println("Float MAX value: " + Float.MAX_VALUE);      // 3.4028235E38 (3.4028235 * 10^38)
        System.out.println("Float MIN value: " + Float.MIN_VALUE);      // 1.4E-45 (1.4 * 10^-45)
        System.out.printf("Float MAX_EXPONENT: %1d %n", Float.MAX_EXPONENT);    // 127
        System.out.printf("Float MIN_EXPONENT: %1d %n", Float.MIN_EXPONENT);    // -126
        System.out.printf("Width of Float: %d %n%n", Float.SIZE);  // 32

        // Double
        System.out.println("Double MAX value: " + Double.MAX_VALUE);    // 1.7976931348623157E308
        System.out.println("Double MIN value: " + Double.MIN_VALUE);    // 4.9E-324
        System.out.printf("Double MAX_EXPONENT: %d %n", Double.MAX_EXPONENT);   // 1023
        System.out.printf("Double MIN_EXPONENT: %d %n", Double.MIN_EXPONENT);   // -1022
        System.out.printf("Width of Double: %d %n%n", Double.SIZE); // 64

        // Character / char
        System.out.println("Char MAX value: " + Character.MAX_VALUE);   // '\uFFFF' -> 65535
        System.out.println("Char MIN value: " + Character.MIN_VALUE);   // '\u0000' -> 0
        System.out.printf("Width of Char: %d %n%n", Character.SIZE);  // 16

        // Boolean
        System.out.println("No SIZE property or MAX_VALUE, MIN_VALUE properties available in 'Boolean' class.");
    }
}
