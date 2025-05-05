package com.oops;

public class OverloadingDemo {

    public static void main(String[] args) {
        printSomething("Hello");
        printSomething(100);
        Rectangle rectangle = new Rectangle(10, 20);
    }

    private static void printSomething(long number) {
        // int logic
        System.out.println("number: " + number);
    }


    private static void printSomething(String str) {
        System.out.println("String: " + str);
    }

}
