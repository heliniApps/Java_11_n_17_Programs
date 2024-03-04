package main.java.model;

import java.util.Arrays;
import java.util.List;

public class Data {

    private static Employee jane = new Employee("Jane Doe", 30, 85000);
    private static Employee john = new Employee("John Doe", 36, 85000);
    private static Employee snow = new Employee("Snow White", 28, 70000);
    private static Employee violet = new Employee("Violet Smith", 42, 100000);
    private static Employee ben = new Employee("Ben Hill", 28, 80000);
    private static Employee kate = new Employee("Kate Simons", 40, 100000);
    private static Employee tim = new Employee("Tim Roswell", 30, 70000);
    private static Employee phillip = new Employee("Phillip Walsh", 40, 120000);

    public static Department hr = new Department("Human Resources");
    public static Department account = new Department("Accounting");
    public static Department admin = new Department("Administration");
    public static Department it = new Department("IT");

    public static List<Department> hrAndAdmin = Arrays.asList(hr, admin);
    public static List<Department> allDepartments = Arrays.asList(hr, account, admin, it);

    public static void prepData() {
        hr.addEmployee(jane);
        hr.addEmployee(snow);
        account.addEmployee(john);
        account.addEmployee(violet);
        admin.addEmployee(ben);
        admin.addEmployee(phillip);
        it.addEmployee(kate);
        it.addEmployee(tim);
    }
}
