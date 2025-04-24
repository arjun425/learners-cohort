package com.collections.streams;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {


        Stream<Integer> numbers = Stream.of(1, 2, 3, 4);
        Stream<String> values = Stream.of("Name", "Place", "Animal", "Thing");
        numbers.forEach(n -> System.out.println(n));
        values.forEach(System.out::println);


        Stream<String> names = Stream.of("Pradeep", "Mani", "Sai", "Ashmita", "Puppy");

        //names.peek(System.out::println).count();

        names.filter(s -> s.startsWith("S")).peek(System.out::println).map(String::toUpperCase).peek(s->System.out.println(s)).count();

        List<String> values1 = Arrays.asList("1", "2", "3", "names");
        System.out.println(values1);

        List<String> values2 = values1.stream().map(x->x.toUpperCase()).collect(Collectors.toList());

        values2.stream().forEach(System.out::println);
    }
}
