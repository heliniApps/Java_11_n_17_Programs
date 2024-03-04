package main.java;

public class StringDataType {

    public static void main(String args[]) {

        creatingStringsWithUnicodeValues();
    }

    public static void creatingStringsWithUnicodeValues() {
        String unicodeDollarStr = "Invoice total is \u0024234,000.";    // Output: ... $234,000.
        System.out.println(unicodeDollarStr);
    }
}
