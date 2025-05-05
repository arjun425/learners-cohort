package com.datastructures;

import com.bank.Customer;
import com.bank.Department;
import com.bank.Employee;

import java.math.BigDecimal;
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(); // Hash Map
        map.put("name1", "Pradeep");
        map.put("name2", "Pranaya");
        map.put("name3", "Arjun");
        map.put("name4", "Lokesh");

        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // key value pairs

        Map<Integer, String> numbersMap = new HashMap<>(1000, 0.75f); // Hash Map
        numbersMap.put(1,"Pradeep");
        numbersMap.put(2,"Pranaya");
        numbersMap.put(3,"Arjun");
        numbersMap.put(4,"Lokesh");
        numbersMap.put(4,"Lokesh Reddy");
        numbersMap.put(1,"Pradeep Kumar Kotari");

        for(Map.Entry<Integer, String> entry: numbersMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<Integer, Employee> employeeMap = new HashMap<>();

        Employee employee1 = new Employee(1, "Pradeep", "Kotari",
                BigDecimal.valueOf(100000), 42);


        Employee employee2 = new Employee(2, "Pranaya", "Sri",
                BigDecimal.valueOf(200000), 22);

        Employee employee3 = new Employee(3, "Arjun", "K",
                BigDecimal.valueOf(300000), 21);

        Employee employee4 = new Employee(4, "Lokesh", "Reddy",
                BigDecimal.valueOf(400000), 20);



        Employee employee5 = new Employee(1, "Pradeep", "Kotari",
                BigDecimal.valueOf(800000), 42);



        employeeMap.put(1, employee1);
        employeeMap.put(2, employee2);
        employeeMap.put(3, employee3);
        employeeMap.put(4, employee4);
        System.out.println("Employee Map:");
        System.out.println(employeeMap);

        System.out.println(employeeMap.keySet());
        System.out.println(employeeMap.values());

        for(Map.Entry<Integer, Employee> entry: employeeMap.entrySet()) {
            System.out.println("Entry:");
            System.out.println(entry);
            Employee emp = entry.getValue();
            System.out.println("hashCode:"+ emp.hashCode());
        }

        Map<String, String> map1 = Map.of("A", "apple", "B", "banana", "C", "cat", "D", "dog"
        , "E", "elephant", "F", "frog", "G", "goat", "H", "horse",
                "I", "iguana", "J", "jaguar");

        Map<String, String> map2 = Map.ofEntries(Map.entry("A", "apple"));

        Map<Employee, Department> empNewMap = new HashMap<>();
        Department department1 = new Department();
        department1.setDepartmentId(100);
        Department department2 = new Department();
        department2.setDepartmentId(200);
        Department department3 = new Department();
        department3.setDepartmentId(300);

        empNewMap.put(employee1,department1);
        empNewMap.put(employee2,department2);
        empNewMap.put(employee3,department3);
        empNewMap.put(employee4,department1);

        System.out.println("Map Data:");
        System.out.println(empNewMap);

        System.out.println("Map Data in separate lines:");
        for(Map.Entry<Employee, Department> entry: empNewMap.entrySet()) {
            System.out.println("Key:"+entry.getKey());
            System.out.println("Value:"+entry.getValue());
        }

        Map<Customer,Integer> custMap = new HashMap<>();

        Set<Integer> keys = new HashSet<>();

        keys.add(1);
        keys.add(2);
        keys.add(3);
        keys.add(4);
        keys.add(3);
        keys.add(1);

        List<Integer> keysList = new ArrayList<>();
        keysList.add(1);
        keysList.add(2);
        keysList.add(3);
        keysList.add(4);
        keysList.add(3);
        keysList.add(1);
        System.out.println(keys);
        System.out.println(keysList);


        String[] strArr = new String [10] ; // Array

        List<String> items = new ArrayList<>(); // Array List
    }
}
