package com.learning;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSorter {

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();
        employees.sort(Comparator.comparing(e -> e.getId()));

        Comparator<Employee> comparator = Comparator.comparing(Employee::getFirstName).thenComparingInt(Employee::getAge);
        employees.sort(comparator);

        System.out.println(employees);

        Optional<Employee> maxSalaryEmployee = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("MaxSalary Employee:" + maxSalaryEmployee);


        Map<Integer, List<Employee>> empIdMap = employees.stream().collect(Collectors.groupingBy(Employee::getId));
        System.out.println("Employees data:" );
        empIdMap.entrySet().stream().forEach(x-> System.out.println(x));

    }


    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(6, "Yash", "Chopra", BigDecimal.valueOf(100000), 25));
        employees.add(new Employee(2, "Aman", "Sharma", BigDecimal.valueOf(200000), 28));
        employees.add(new Employee(3, "Aakash", "Yaadav", BigDecimal.valueOf(120000), 52));
        employees.add(new Employee(5, "David", "Kameron", BigDecimal.valueOf(78000), 19));
        employees.add(new Employee(4, "James", "Hedge", BigDecimal.valueOf(250000), 62));
        employees.add(new Employee(8, "Balaji", "Subbu", BigDecimal.valueOf(95000), 22));
        employees.add(new Employee(7, "Karan", "Johar", BigDecimal.valueOf(300000), 59));
        employees.add(new Employee(1, "Lokesh", "Gupta", BigDecimal.valueOf(130000), 32));
        employees.add(new Employee(9, "Vishu", "Bissi", BigDecimal.valueOf(140000), 33));
        employees.add(new Employee(10, "Lokesh", "Ramachandran", BigDecimal.valueOf(500000), 41));
        return employees;
    }
}
