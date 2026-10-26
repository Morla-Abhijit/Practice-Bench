package org.example;
import java.lang.Math;
import java.util.*;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        // Problem 11: Sort a list of employees by their salary.
        class Employee {
            String name;
            double salary;

            Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }

            @Override
            public String toString() {
                return name + " - " + salary;
            }
        }

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 60000)
        );

        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparingDouble((Employee e) -> e.salary)).toList();
        sortedEmployees.forEach(System.out::println);

        // Problem 12: Find the maximum and minimum number in a list.
        List<Integer> numbers = Arrays.asList(12, 45, 2, 19, 8);
        int max = numbers.stream().max(Comparator.comparingInt(i->i)).get();
        System.out.println(max);

    }
}
