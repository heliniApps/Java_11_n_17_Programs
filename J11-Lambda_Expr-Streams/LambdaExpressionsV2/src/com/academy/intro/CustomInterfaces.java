package com.academy.intro;

import com.academy.model.Data;

public class CustomInterfaces {

    public static void main(String args[]) {

        /* Interface argument ==>  as an Anonymous Class. */
        String concatNames = doStringStuff(
                new UpperConcat() {
                    @Override
                    public String convertUpperAndConcat(String s1, String s2) {
                        return s1.toUpperCase().concat(" ").concat(s2.toUpperCase());
                    }
                },
                Data.employees.get(2).getName(), Data.employees.get(0).getName());

        System.out.println("Combined Names: " + concatNames);


        // ============================================================


        /* Assigning the Lambda Expression to a variable. */
        UpperConcat uc = (s1, s2) -> s2.toUpperCase().concat(" ").concat(s1.toUpperCase());

        String combinedNames = doStringStuff(
                uc, Data.employees.get(3).getName(), Data.employees.get(4).getName());

        System.out.println("Combined Names V2 : " + combinedNames);


        // ============================================================


        /*  Lambda Expressions with "single argument".  Parenthesis is Optional. */
        ParseNumber ps = (number) -> Integer.parseInt(number);
        // ParseNumber pn = Integer::parseInt;

        printParsedNumber(ps, "89");
    }

    /* Function, using the custom interface as an argument. */
    public static String doStringStuff(UpperConcat uc, String name1, String name2) {
        return uc.convertUpperAndConcat(name1, name2);
    }

    public static void printParsedNumber(ParseNumber ps, String number) {
        int parsedNum = ps.parseInteger(number);
        System.out.println("Int value : " + parsedNum);
    }
}

interface UpperConcat {
    String convertUpperAndConcat(String s1, String s2);
}

interface ParseNumber {
    int parseInteger(String number);
}