package com.kotari;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilterDemo {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> evenIntegers = integers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evenIntegers);
        //evenIntegers.stream().forEach(x-> System.out.println(x));
    }


}
