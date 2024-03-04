package main.java.streamClassMethods;

import main.java.model.Data;
import main.java.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByUsage {

    public static void main(String args[]) {

        Data.prepData();

        /*  Collectors.groupingBy()  */
        Function<Employee, Integer> ageClassifierFunc = Employee::getAge;

        Map<Integer, List<Employee>> groupByAge =
                Data.allDepartments
                        .stream()
                        .flatMap((dept) -> dept.getAllEmployees().stream())
                        .collect(Collectors.groupingBy(ageClassifierFunc));

        groupByAge.forEach(
                (ageKey, empList) -> System.out.printf("\nAge: %d \n\t%s", ageKey, empList));


        Function<Employee, Integer> salaryClassifier = Employee::getSalary;
        Map<Integer, List<Employee>> groupBySalary =
                Data.allDepartments
                        .stream()
                        .flatMap((dept) -> dept.getAllEmployees().stream())

                        .collect(Collectors.groupingBy(salaryClassifier));

        System.out.println();
        groupBySalary.forEach(
                (salary, empList) -> System.out.printf("\nSalary: %d \n\t%s", salary, empList));
    }
}
