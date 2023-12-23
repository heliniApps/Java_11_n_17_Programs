package main.java.com.academy.streams;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Department> departments = populateDepartments();

        // List all employees.
        System.out.println("\nList all employees.");

        LinkedHashSet<Employee> allEmployees = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        allEmployees.forEach(System.out::println);


        // All employees sorted by age (descending).
        System.out.println("\nAll employees sorted by age (descending)");

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .forEach(System.out::println);


        // List of all employee names.
        System.out.println("\nList of all employee names.");

        List<String> allEmployeeNames = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .map(Employee::getName)
                .collect(Collectors.toList());

        allEmployeeNames.forEach(System.out::println);


        // Employees with salary above 70000.
        System.out.println("\nEmployees with salary above 70000.");

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary() > 70000)
                .forEach(System.out::println);


        // Details of Employee with the highest salary.
        System.out.println("\nEmployee with the highest salary.");

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        departments.stream()
                .filter(department -> department.getName().equals("HR"))
                .flatMap(department -> department.getEmployees().stream())
                .reduce((employee1, employee2) -> (employee1.getSalary() > employee2.getSalary() ? employee1 : employee2))
                .ifPresent(employee -> System.out.println("Department: HR  ,  " + employee));

        /*departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.maxBy((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1))
                .ifPresent(System.out::println);*/


        // Group employees by salary
        System.out.println("\nGroup employees by salary.");

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getSalary))
                .forEach((salaryKey, empList) ->
                        System.out.printf("Salary: %.2f , Employees: %s%n",
                                salaryKey, Arrays.toString(empList.toArray()))
                );

        System.out.println();

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getSalary))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry ->
                        System.out.printf("Salary: %.2f , Employees: %s%n",
                                entry.getKey(), Arrays.toString(entry.getValue().toArray()))
                );


        // Group departments and total salary for each department.
        System.out.println("\nGroup departments and total salary for each department.");

        Collector<Employee, ?, Double> summingEmpSal = Collectors.summingDouble(Employee::getSalary);
        Collector<Department, ?, Map<Department, Double>> collectorSalByDept =
                Collectors.groupingBy(
                        Function.identity(),
                        (Collectors.summingDouble(department -> department.getEmployees().stream().collect(summingEmpSal))));

        BiConsumer<Department, Double> printDeptSalaryInfo =
                (dept, salary) -> System.out.format("%s :: %.2f %n", dept.getName(), salary);

        Map<Department, Double> totalSalByDept = departments.stream().collect(collectorSalByDept);
        totalSalByDept.forEach(printDeptSalaryInfo);


        // Group department names and total salary.
        System.out.println("\nGroup department names and total salary.");

        Collector<Department, ?, Map<String, Double>> collectorSalByDeptName = Collectors.groupingBy(
                Department::getName,
                Collectors.summingDouble(
                        department -> department.getEmployees().stream().mapToDouble(Employee::getSalary).sum()));

        /*Collector<Department, ?, Map<String, Double>> collectorSalByDeptName2 = Collectors.groupingBy(
                Department::getName,
                Collectors.mapping(
                        department -> department.getEmployees().stream().mapToDouble(Employee::getSalary).sum(),
                        Collectors.summingDouble(deptSalary -> deptSalary)));*/

        departments.stream()
                .collect(collectorSalByDeptName)
                .forEach((deptName, totalSalary) -> System.out.format("%s :: %.2f %n", deptName, totalSalary));


        // Highest salary for each department.
        System.out.println("\nHighest salary for each department.");

        departments.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        ((Department department) -> department.getEmployees().stream()
                                .mapToDouble(Employee::getSalary).max().orElse(0.0d)))
                )
                .forEach(printDeptSalaryInfo);


        // Employee names by Department
        System.out.println("\nEmployee names by Department");

        departments.stream()
                .collect(Collectors.groupingBy(
                            Department::getName,
                            Collectors.flatMapping(
                                    department -> department.getEmployees().stream().map(Employee::getName),
                                    Collectors.toList()))
                )
                .forEach((deptName, namesList) -> System.out.printf("%s  ::  %s%n", deptName, Arrays.toString(namesList.toArray())));

    }

    private static List<Department> populateDepartments() {
        Employee jane = new Employee("Jane Doe", 27, 50000);
        Employee jack = new Employee("Jack Hill", 42, 82000);
        Employee mary = new Employee("Mary Ann", 36, 50000);
        Employee bob = new Employee("Bob Marley", 38, 75000);
        Employee tim = new Employee("Tim B", 50, 100000);
        Employee victor = new Employee("Victor A", 25, 35000);
        Employee peter = new Employee("Peter P", 35, 80000);

        Department hr = new Department("HR");
        Department accounts = new Department("Accounts");
        Department secondAccounts = new Department("Accounts");
        try {
            hr.addEmployee(jane);
            hr.addEmployee(mary);
            hr.addEmployee(bob);
            accounts.addEmployee(jack);
            accounts.addEmployee(peter);
            secondAccounts.addEmployee(tim);
            secondAccounts.addEmployee(victor);
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounts);
        departments.add(secondAccounts);

        return departments;
    }
}
