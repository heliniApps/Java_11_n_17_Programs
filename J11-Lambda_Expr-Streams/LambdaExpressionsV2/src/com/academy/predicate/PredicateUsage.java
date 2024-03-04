package com.academy.predicate;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateUsage {

    public static void main(String args[]) {
        /*  Predicate as a function argument.  */
        printEmployeesByAge(Data.employees, "Employees under age 25...",
                ((employee) -> employee.getAge() <= 25));

        printEmployeesByAge(Data.employees, "Employees age 35 or above...",
                ((employee) -> employee.getAge() >= 35));

        System.out.println();

        /*  Different variations of Predicates.  */
        usingIntegerPredicates(Data.employees);
        usingDoublePredicates();

        System.out.println();

        /*  Chaining Predicates.  */
        chainingPredicates(Data.employees);

    }

    /* Predicate as a function argument. */
    public static void printEmployeesByAge(List<Employee> employeeList,
                                           String msgText,
                                           Predicate<Employee> ageCondition) {
        System.out.println("\n" + msgText);

        employeeList.forEach((employee) -> {
            if (ageCondition.test(employee)) {
                System.out.println(employee);
            }
        });
    }

    /*  Integer Predicates.  */
    public static void usingIntegerPredicates(List<Employee> employeeList) {
        IntPredicate greaterThan25 = (i) -> i > 25;
        IntPredicate lessThan50 = (i) -> i < 50;

        System.out.println("Employees above age 25...");
        employeeList.forEach((employee) -> {
            if (greaterThan25.test(employee.getAge())) {
                System.out.println(employee);
            }
        });
    }

    /*  Double Predicates.  */
    public static void usingDoublePredicates() {
        DoublePredicate between10And15 = (i) -> (i > 10d) && (i < 15d);

        System.out.printf("\n10.0 => %b", between10And15.test(10d));
        System.out.printf("\n12.0 => %b", between10And15.test(12d));
        System.out.printf("\n14.0 => %b", between10And15.test(14d));
        System.out.printf("\n15.0 => %b", between10And15.test(15d));
        System.out.printf("\n16.0 => %b\n", between10And15.test(16d));
    }

    /*  Chaining Predicates.  */
    public static void chainingPredicates(List<Employee> employeeList) {
        IntPredicate greaterThan25 = (i) -> i > 25;
        IntPredicate lessThanOrEqual30 = (i) -> i <= 30;

        System.out.println("\n*** Employees between 25 and 30 ***");
        employeeList.forEach((employee) -> {
            // using "and()" function to chain two predicates
            if (greaterThan25.and(lessThanOrEqual30).test(employee.getAge())) {
                System.out.println(employee);
            }
        });

        IntPredicate lessThanOrEqual25 = (j) -> j <= 25;
        IntPredicate greaterThanOrEqual40 = (j) -> j >= 40;

        Comparator<Employee> empComparator = (emp1, emp2) -> emp1.getName().compareTo(emp2.getName());

        System.out.println("\n*** Employees younger than 25 and older than 40 ***");
        employeeList.sort(empComparator);
        employeeList.forEach((employee) -> {
            // chaining with "or()".
            if (lessThanOrEqual25.or(greaterThanOrEqual40).test(employee.getAge())) {
                System.out.println(employee);
            }
        });
    }
}
