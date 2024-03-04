package com.academy.function;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.Date;
import java.util.function.*;

public class FunctionVariants {

    public static void main(String args[]) {

        /*  Argument of these "Functions" cannot be the Wrapper class type. Causes a compile error. */
        /*  Must be primitive data type, such as "long, int, double" */

        LongToIntFunction milliSecToDays = (long longVal) -> {
            long result = longVal / 86400000L;
            return (int) result;
        };
        System.out.println("Num of Days: " + milliSecToDays.applyAsInt(new Date().getTime()));


        IntToDoubleFunction intToDoubleFunc = (int intVal) -> intVal * 10d;
        System.out.println(intToDoubleFunc.applyAsDouble(3));


        // ============================================================

        /*  BiFunction  */
        testBiFunction();

        biFunctionVariants();

        /*  UnaryOperator  */
        testUnaryOperator();

    }

    /*  BiFunction Usage */
    public static void testBiFunction() {

        BiFunction<Employee, Integer, String> appendDefaultAge = (employee, averageAge) -> {
            String employeeInfo = employee.toString();
            if (employee.getAge() < 25) {
                employeeInfo = employee.getName() + "  |  " + averageAge;
            }
            return employeeInfo;
        };

        String info = appendDefaultAge.apply(Data.employees.get(7), 30);
        System.out.println(info);


        /* Chaining "BiFunction". */
        /* BiFunction must be the first link/"point of entry" in the chain. */
        Function<String, String> upperCase = String::toUpperCase;

        info = appendDefaultAge.andThen(upperCase).apply(Data.employees.get(2), 30);
        System.out.println(info);
    }

    public static void biFunctionVariants() {
        /* Variations of "BiFunction" */
        ToDoubleBiFunction<Integer, Double> calcTaxAmount =
                (roundItemPrice, taxRate) -> ((roundItemPrice * taxRate) / 100d);

        double taxAmount = calcTaxAmount.applyAsDouble(45, 7d);
        System.out.println("Tax amount: $" + taxAmount);

    }

    /*  UnaryOperator  */
    public static void testUnaryOperator() {

        /* Returns a value of the exact same data type, as the provided argument. */
        UnaryOperator<Employee> constructNewEmployee = (existingEmployee) -> {
            String name = "Snow White";
            int age = (existingEmployee.getAge() > 40) ? 30 : existingEmployee.getAge();
            return new Employee(name, age);
        };

        Employee newEmployee = constructNewEmployee.apply(Data.employees.get(6));
        System.out.println(newEmployee);

        /* variations */
        IntUnaryOperator multiplyByTwo = (i) -> i * 2;
        System.out.println(multiplyByTwo.applyAsInt(30));
    }
}
