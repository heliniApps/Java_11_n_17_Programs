package main.java;

public class TernaryOperator {

    public static void main(String args[]) {

        differentWaysToUseTernaryOperator();
    }

    public static void differentWaysToUseTernaryOperator() {
        String brandOfCar = "Toyota";

        /* Assigning a Boolean value. */
        boolean isDomestic = (brandOfCar == "Holden" ? true : false);

        System.out.println("isDomestic = " + isDomestic);

        /* Simplified version of the above statement. Avoid Ternary Operator. */
        // isDomestic = (brandOfCar == "Holden");

        /* Assigning a String. */
        String messageText = (brandOfCar == "Toyota") ? "This is not a domestic brand." : "A domestic brand.";

        System.out.println("messageText = " + messageText);

        /* As a standalone statement. */    // ERROR
        /* (brandOfCar == "Holden") ? System.out.println("Brand is Holden.") : System.out.println("Imported brand."); */

        // Ternary Operator CANNOT be used as a Standalone Statement.
        // It must return a value.
    }
}
