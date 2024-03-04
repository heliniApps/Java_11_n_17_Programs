package com.academy.intro;

import com.academy.model.Data;
import com.academy.model.Employee;

import java.util.Comparator;

public class LambdaIntro {

    public static void main(String args[]) {
        /* Runnable target ==>  Using a separate class implementing the Runnable interface. */
        new Thread(new ThreadToRun()).start();

        /* Runnable target ==>  Using Runnable interface as an Anonymous Class. */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from Runnable as Anonymous Class.");
            }
        }).start();

        /* Runnable target ==>  Using Lambda Expression to override Runnable.run() method. */
        new Thread(
                () -> System.out.println("Printing from Runnable.run() as the Lambda Expression.")
        ).start();

        System.out.println();

        // ============================================================

        /* List sorting ==>  Using Comparator as an Anonymous Class */
        Data.employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getName().compareTo(emp2.getName());
            }
        });

        for (Employee emp : Data.employees) {
            System.out.println(emp.getName());
        }

        System.out.println();

        /* List sorting ==>  Comparator.compare() as Lambda Expression. */
        Data.employees.sort((emp1, emp2) -> emp2.getName().compareTo(emp1.getName()));

        for (Employee emp : Data.employees) {
            System.out.println(emp);
        }
    }
}

class ThreadToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from Runnable implemented ThreadToRun class.");
    }
}