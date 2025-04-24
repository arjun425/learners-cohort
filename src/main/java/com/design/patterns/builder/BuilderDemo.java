package com.design.patterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Cake cake = new Cake.Builder().sugar(2).butter(1).flour(2).flavor("Vanilla").eggs(2).build();
        System.out.println(cake);

        Cake cake1 = new Cake.Builder().sugar(2).butter(1).flour(2).flavor("Lemon").build();
        System.out.println(cake1);
    }
}
