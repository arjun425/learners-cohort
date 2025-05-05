package com.learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Check if roll number already exists
    public static boolean isRollNoExists(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) return true;
        }
        return false;
    }

    public static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline

        if (isRollNoExists(roll)) {
            System.out.println("Roll No already exists! Cannot add duplicate.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(roll, name, marks));
        System.out.println("Student added successfully.");
    }

    public static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n--- List of Students ---");
        for (Student s : students) {
            s.display();
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.println("Student found:");
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void updateStudent() {
        System.out.print("Enter Roll No to update: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline
        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();
                System.out.print("Enter new Marks: ");
                double marks = sc.nextDouble();
                s.name = name;
                s.marks = marks;
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.rollNo == roll) {
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void sortByName() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        students.sort(Comparator.comparing(s -> s.name.toLowerCase()));
        System.out.println("Students sorted by name.");
    }

    public static void sortByMarks() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        students.sort((s1, s2) -> Double.compare(s2.marks, s1.marks)); // descending order
        System.out.println("Students sorted by marks (highest to lowest).");
    }

    public static void main(String[] args) {
        int choice;
        // Sample data
        do {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort by Name");
            System.out.println("7. Sort by Marks");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayAll(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: sortByName(); displayAll(); break;
                case 7: sortByMarks(); displayAll(); break;
                case 8: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}