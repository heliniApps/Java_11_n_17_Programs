package main.java.com.academy.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Department {

    private final String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(this.employees);
    }

    public void addEmployee(Employee employee) throws NullPointerException {
        Objects.requireNonNull(employee);
        if (! this.employees.contains(employee)) {
            this.employees.add(employee);
        }
    }
}
