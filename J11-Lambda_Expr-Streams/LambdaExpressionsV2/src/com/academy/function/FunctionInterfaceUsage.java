package com.academy.function;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class FunctionInterfaceUsage {

    public static void main(String args[]) {

        /* Logic to get Employee's lastname.*/
        Function<Employee, String> getLastName =
                (employee) -> employee.getName().substring(employee.getName().indexOf(' ') + 1);

        /* Logic to get Employee's firstname.*/
        Function<Employee, String> getFirstName =
                (employee) -> employee.getName().substring(0, employee.getName().indexOf(' '));

        /*  Using same function to print different scenarios, by varying the "Function" arg.  */
        printEmployeeNames(Data.employees, getLastName);
        printEmployeeNames(Data.employees, getFirstName);

        System.out.println("\nRandom First and Last Names: ");
        Random randomBoolean = new Random();
        Data.employees.forEach((employee) -> {
            if (randomBoolean.nextBoolean()) {
                printPreferredName(employee, getFirstName);
            } else {
                printPreferredName(employee, getLastName);
            }
        });
    }

    public static String getPreferredName(Employee employee, Function<Employee, String> getName) {
        return getName.apply(employee);
    }

    public static void printPreferredName(Employee employee, Function<Employee, String> getName) {
        System.out.println(getPreferredName(employee, getName));
    }

    public static void printEmployeeNames(List<Employee> employeeList,
                                          Function<Employee, String> getNameFunc) {
        System.out.println("\nPreferred Names: ");
        employeeList.forEach(
                (employee) -> printPreferredName(employee, getNameFunc));
    }
}
