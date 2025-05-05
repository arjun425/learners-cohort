package com.oops;

import java.util.List;

public class Library {
    private String name;
    private String address;
    private int numberOfBooks;

    private static final String LIBRARY_NAME = "City Library";
    private List<Book> bookList;
    private List<Staff> staffList;

    public Library(String name, String address, int numberOfBooks) {
        this.name = name;
        this.address = address;
        this.numberOfBooks = numberOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
