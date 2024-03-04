package main.java.primitiveTypes;

public class FloatAndDouble {

    public static void main(String args[]) {

        assigningNumericLiteralsToDoubleAndFloat();
        divisionWithRealNumbers();
    }

    public static void assigningNumericLiteralsToDoubleAndFloat() {
        /* Integer literals can be assigned to both Double and Float.
         * 'd' or 'f' suffix is optional.
         * Integer literal is converted to decimal value.
         */
        int integerValue = 5;
        double doubleValue = 5;
        float floatValue = 5;

        System.out.println("Float value with Int literal: " + floatValue);    // Output: 5.0
        System.out.println("Double value with Int literal: " + doubleValue);    // Output: 5.0

        /* "Double" is the default Data Type for Real Numbers/Floating-point/Decimal values.
         * Therefore, when assigning a decimal value to a 'Float' variable, 'f' suffix is mandatory.
         * Else, it will be considered a Double literal, and Compiler Error occurs.
         */
        float secondFloatVal = 4.56f;
        // float secondFloatVal = 4.56;    // Compile ERROR.

        System.out.println("secondFloatVal : " + secondFloatVal);

        /* Can also use casting to solve the above issue. ('f' suffix is recommended) */
        secondFloatVal = (float) 12.34;
        System.out.println("secondFloatVal - casted : " + secondFloatVal);
    }

    public static void divisionWithRealNumbers() {
        System.out.println("\nDecimal Number Divisions:");

        /* Result of the below division is always an Integer.
         * '5' & '2' are both Integer literals. Output is assigned to an Integer variable.
         */
        int myIntValue = 5 / 2;
        System.out.println("IntVal = (5 / 2) : " + myIntValue);

        /* Shows warning -> '5 / 2': integer division in floating-point context
         * Output = 2.0
         * Because both the 5 and 2 literals are Integers, result of the calculation is Integer.
         * It just displays as a decimal number '2.0', because it's assigned to a 'Float' variable.
         */
        float myFloatValue = 5 / 2;
        System.out.println("FloatVal = (5 / 2) : " + myFloatValue);   // Output = 2.0

        double myDoubleValue = 5 / 2;
        System.out.println("DoubleVal = (5 / 2) : " + myDoubleValue);  // Output = 2.0


        /* myIntValue = 5 / 2.0; */     // Compile Error. Double result is 64 bit. Integer is 32 bit.

        /* This is valid with the Casting to (int). */
        myIntValue = (int) (5 / 2.0);
        System.out.println("Double result, casted to Int : " + myIntValue);


        /* myFloatValue = 5 / 2.0; */     // Compile Error. Double result is 64 bit. Integer is 32 bit.

        myFloatValue = (float) (5 / 2.0);   /* Valid with Casting the result to (float). */
        System.out.println("Double result, casted to Float :" + myFloatValue);

        /* As long as one operand is decimal, result will be decimal. 'f' indicates Float literal.
         * This operation is valid, because literals are Integer and Float.
         * So, the result fits into 32 bit Float variable.
         * If one of the operands are Double, statement will be invalid. (as shown in the next e.g.)
         */
        myFloatValue = (5 / 2f);
        System.out.println("As a float - (int/float)) : " + myFloatValue);

        /* Below division statement causes a Compiler Error.
         * Because one of the operands is Double. Therefore, the Result is also Double (64 bit).
         * It doesn't fit into Float (32 bit).
         */
        // myFloatValue = (5.0 / 2f);   // Compile ERROR.


        /* Valid statement. 'd' suffix is not mandatory.
         * If a decimal value (e.g.: 5.0) is given, output will be a Double.
         * Since, Double is the default data type for Real Numbers.
         */
        myDoubleValue = 5d / 2;
        System.out.println("Double division - (double/int) : " + myDoubleValue);
    }
}
