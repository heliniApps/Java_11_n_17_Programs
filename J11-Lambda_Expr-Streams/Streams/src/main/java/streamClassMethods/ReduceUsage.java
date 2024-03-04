package main.java.streamClassMethods;

import main.java.model.Data;

public class ReduceUsage {

    public static void main(String args[]) {
        Data.prepData();

        /*  reduce()  */
        Data.allDepartments
                .stream()
                .flatMap((dept) -> dept.getAllEmployees().stream())
                .reduce((emp1, emp2) -> (emp1.getSalary() > emp2.getSalary()) ? emp1 : emp2)
                .ifPresent(System.out::println);

        // .reduce((emp1) -> emp1.getSalary() > 100000?emp1:null)   // compile error.
        /* BinaryOperator always takes two arguments. Similar to BiFunction.*/

    }
}
