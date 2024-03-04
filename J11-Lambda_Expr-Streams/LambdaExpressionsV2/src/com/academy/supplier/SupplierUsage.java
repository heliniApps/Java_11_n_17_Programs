package com.academy.supplier;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.Date;
import java.util.Random;
import java.util.function.*;

public class SupplierUsage {

    public static void main(String args[]) {

        // Scenario
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(0, 100));
        }

        System.out.println();

        /* Implementation using a Supplier (as Anonymous Class). */
        Supplier<Integer> randomIntSupplier = new Supplier<>() {
            @Override
            public Integer get() {
                return random.nextInt(100, 500);
            }
        };
        printSupplierOutput(randomIntSupplier);

        /* Implementation using a Supplier (Lambda Expr).  */
        Supplier<Integer> randomIntSupplier2 = () -> random.nextInt(600);
        printSupplierOutput(randomIntSupplier2);

        /*  Returning Objects using Supplier.  */
        supplierWithObjects();

        /*  Using different Supplier implementations.  */
        differentSupplierVariations();
    }

    public static void differentSupplierVariations() {
        // Long Supplier
        LongSupplier currentTimeMilliSec = new LongSupplier() {
            @Override
            public long getAsLong() {
                Date currentDate = new Date();
                return currentDate.getTime();
            }
        };
        System.out.println("\nCurrent Time: " + currentTimeMilliSec.getAsLong());

        // Integer Supplier
        IntSupplier parseIntSupplier = () -> Integer.parseInt("45");
        System.out.println("Parse Int: " + parseIntSupplier.getAsInt());
    }

    /*  Object Supplier. (scenario: comparison to a default object's values)  */
    public static void supplierWithObjects() {

        Supplier<Employee> defaultEmpObjSupplier = () -> new Employee("Snow White", 26);
        System.out.println("\nDefault Employee:  " + defaultEmpObjSupplier.get() + "\n");

        Predicate<Employee> compareToDefaultEmployee =
                (employee) -> employee.getAge() < defaultEmpObjSupplier.get().getAge();

        Consumer<Employee> employeeConsumer = (emp) -> {
            if (compareToDefaultEmployee.test(emp)) {
                System.out.println(emp);
            }
        };
        Data.employees.forEach(employeeConsumer);
    }

    public static <T> void printSupplierOutput(Supplier<T> randomSupplier) {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }
    }

}
