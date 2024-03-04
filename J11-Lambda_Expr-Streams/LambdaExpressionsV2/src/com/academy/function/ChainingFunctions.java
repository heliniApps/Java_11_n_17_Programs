package com.academy.function;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.function.Function;

public class ChainingFunctions {

    public static void main(String args[]) {

        Function<String, String> upperCase = String::toUpperCase;
        Function<Employee, String> firstName =
                (employee) -> employee.getName().substring(0, employee.getName().indexOf(' '));
        Function<Employee, Employee> lowerCase = (employee) -> {
            employee.setName(employee.getName().toLowerCase());
            return employee;
        };

        /*  andThen()  */
        Function<Employee, String> chainUpperFirstName = firstName.andThen(upperCase);

        String returnStr = chainUpperFirstName.apply(Data.employees.get(2));
        System.out.println("andThen() :: " + returnStr);

        /*  compose()  */
        Function<Employee, String> chainWithCompose = firstName.compose(lowerCase);

        returnStr = chainWithCompose.apply(Data.employees.get(5));
        System.out.println("compose() :: " + returnStr);

        Data.employees.forEach(System.out::println);
    }
}
