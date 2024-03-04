package main.java.streamClassMethods;

import main.java.model.Data;
import main.java.model.Employee;

import java.util.Comparator;

public class FlatMapUsage {

    public static void main(String args[]) {

        Data.prepData();

        Data.hrAndAdmin.stream()
                .forEach((dept) -> System.out.println(dept.getAllEmployees().stream()));
        /*
         * Result:
         * java.util.stream.ReferencePipeline$Head@372f7a8d
         * java.util.stream.ReferencePipeline$Head@2f92e0f4
         */


        System.out.println(Data.hrAndAdmin
                .stream()
                .flatMap((department) -> department.getAllEmployees().stream())
                .count());
        /*
         * Returns:
         *   4
         *   The sum of all employees in both hr and admin departments.
         *   Returns as a "Stream<Employee>". No longer "Stream<Department>".
         */


        Data.allDepartments
                .stream()
                .flatMap((dept) -> dept.getAllEmployees().stream())
                .map(Employee::getName)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        /*
         * Returns:
         *   Only the names of all employees in the departments list.
         *   As a "Stream<String>"
         */


        System.out.println("\n--------------------------");
        Data.allDepartments
                .stream()
                .flatMap((dept) -> dept.getAllEmployees().stream())
                .filter((employee) -> employee.getAge() >= 30)
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        /*
         * Returns:
         *   List of employee names, filtered by age and sorted.
         *   As a "Stream<String>"
         */
    }
}
