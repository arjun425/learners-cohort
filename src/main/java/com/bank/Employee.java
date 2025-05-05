package com.bank;

import java.math.BigDecimal;
import java.util.Objects;

public final class Employee {

    private final Integer id;
    private final String firstName;
    private final String lastName;

    private final BigDecimal salary;
    private final Integer age;

    public static final String COMPANY_NAME = "Hexaware";

    public Employee(Integer id, String firstName, String lastName, BigDecimal salary, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(salary, employee.salary) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, salary, age);
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
