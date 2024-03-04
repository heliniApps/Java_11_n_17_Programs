package main.java.primitiveTypes;

public class CharAndBoolean {

    public static void main(String args[]) {

        charMinAndMaxValues();
        differentWaysToAssignChars();
        assigningCharsToIntegers();
        concatenatingChars();
        mathOperatorsWithChars();
    }

    /*
     * Character is stored in memory as a 2 byte (16 bit) 'number'.
     * When displaying or using in an expr, the 'Char' representation of the 'numeric value' is retrieved.
     */
    public static void charMinAndMaxValues() {

        /* As 'char' value. */
        char maxChar = Character.MAX_VALUE;
        System.out.println("Max Char value : " + maxChar);

        char minChar = Character.MIN_VALUE;
        System.out.println("Min Char value : " + minChar);

        /* Character as 'int' value. */
        int maxCharIntVal = Character.MAX_VALUE;
        System.out.println("Max char as Int value : " + maxCharIntVal);

        int minCharIntVal = Character.MIN_VALUE;
        System.out.println("Min char as Int value : " + minCharIntVal);
    }

    /* There are 3 different ways to assign a value to a 'char' variable.
     *   As a character literal. ('D')
     *   As a Unicode value. ('\u0044')
     *   As a numeric literal. ('68')  [Assigning Integer variables causes Compile Error.]
     *
     *  Assigning 'empty char literal' to a char variable causes Compile Error.
     */
    public static void differentWaysToAssignChars() {
        char charLiteral = 'X';
        char charAsUnicodeVal = '\u0058';
        char charAsDecimal = 88;
        // char emptyCharLiteral = '';     // Compile ERROR.

        System.out.println("\ncharLiteral: " + charLiteral);    // Output: X
        System.out.println("charAsUnicodeVal: " + charAsUnicodeVal);    // Output: X
        System.out.println("charAsDecimal: " + charAsDecimal);  // Output: X
    }

    public static void assigningCharsToIntegers() {

        /* Valid statement. Can assign a "char" literal or a "char" variable to an "int" variable.
         * Char is stored in memory as a 2 byte numeric value.
         */
        int characterD = 'D';
        System.out.println("\nChar literal 'D' as an Integer : " + characterD);

        char charLiteralW = 'W';
        int characterW = charLiteralW;
        System.out.println("Char 'W' as an Int : " + characterW);

        /* Invalid statement. Causes compiler ERROR.
         * Cannot assign an "Integer" variable to a "char" variable.
         *
         * This expression is not checked by the compiler, to see if the literal value assigned to the
         * 'integer' can fit into the 'char' variable.
         *
         * It requires explicit casting, as shown below.
         */
        int numericValN = 78;
        // char charLiteralN = numericValN;     // Invalid

        char charLiteralN = (char) numericValN;     // Valid
        System.out.println("Casting 'int' to 'char' : " + charLiteralN);
    }

    /*
     * It is Valid to concatenate 'char' literals or variables.
     *
     * Chars are stored as 2-byte Numbers.
     * Therefore, when concatenating using '+' operator, it will 'add/sum-up' the two numeric representations.
     * e.g.: 'A' + 'B' = 131
     */
    public static void concatenatingChars() {
        char charValA = 'A';
        char charValB = 'B';

        System.out.println("\nCombined 'char' variables : " + (charValA + charValB));   // Output: 131

        System.out.println("Combined 'char' literals (C & D): " + ('C' + 'D'));   // Output: 135
    }

    /*
     * It is VALID to use arithmetic Operators with 'char' values. (variables or literals)
     * This is because, 'char' is stored in memory as a Numeric Value (2-bytes).
     */
    public static void mathOperatorsWithChars() {
        char charValA = 'A';
        char charValB = 'B';

        System.out.println("\n'B' - 'A' = " + (charValB - charValA));
        System.out.println("'B' / 'A' = " + (charValB / charValA));
        System.out.println("'N' % 'A' = " + ('N' % 'A'));
    }
}
