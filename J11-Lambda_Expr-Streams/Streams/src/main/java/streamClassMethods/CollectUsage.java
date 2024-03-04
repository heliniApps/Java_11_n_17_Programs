package main.java.streamClassMethods;

import main.java.model.Data;
import main.java.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectUsage {

    public static void main(String args[]) {

        Data.prepData();

        /*  collect()  */
        List<Employee> empLessThan30 =
                Data.allDepartments
                        .stream()
                        .flatMap((dept) -> dept.getAllEmployees().stream())
                        .filter((employee) -> employee.getAge() <= 30)
                        .collect(() -> new ArrayList<Employee>(), /* How to create the empty collection object. */
                                (list, empObj) -> list.add(empObj), /* How to accumulate the Stream's objects into the new collection. */
                                (ArrayList<Employee> list, ArrayList<Employee> combinedList) -> combinedList.addAll(list) /* How to combine all existing collections and create one resulting collection. */);

        empLessThan30.forEach(System.out::println);


        List<Employee> empOlderThan40 =
                Data.allDepartments
                        .stream()
                        .flatMap((dept) -> dept.getAllEmployees().stream())
                        .filter((employee) -> employee.getAge() >= 40)
                        .collect(ArrayList::new, /* Creating an empty collection. Concise way. */
                                ArrayList::add,  /* Adding each Employee object to new collection obj. */
                                ArrayList::addAll /* Combining each new collection into one result List. */
                        );
        System.out.println();

        empOlderThan40.forEach(System.out::println);


        Predicate<Employee> startWithJ = (employee) -> employee.getName().toUpperCase().startsWith("J");
        Predicate<Employee> startsWithK = (employee) -> employee.getName().toUpperCase().startsWith("K");
        Predicate<Employee> employeeNameFilter = startWithJ.or(startsWithK);

        List<Employee> empStartsWithJK =
                Data.allDepartments
                        .stream()
                        .flatMap((dept) -> dept.getAllEmployees().stream())
                        .filter(employeeNameFilter)
                        .collect(Collectors.toCollection(ArrayList::new));
        System.out.println();

        empStartsWithJK.forEach(System.out::println);

    }
}
