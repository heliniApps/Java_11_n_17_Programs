package com.academy.consumer;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.function.Consumer;

public class ConsumerUsage {

    public static void main(String args[]) {

        // Consumer as Anonymous Class.
        System.out.println("\nTraditional Anonymous Class...");

        Data.employees.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

        // Consumer as Lambda Expression/Method Reference.
        System.out.println("\nMethod Reference...");
        Data.employees.forEach(System.out::println);

        System.out.println("\nLambda Expr...");
        Data.employees.forEach((employee) -> {
            if (employee.getAge() > 30) {
                System.out.println(employee);
            }
        });

    }
}
