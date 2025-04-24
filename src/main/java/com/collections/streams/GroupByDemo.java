package com.collections.streams;

import com.kotari.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Pradeep","Piscataway",39);
        Person person2 = new Person("Manisha","Piscataway",38);
        Person person3 = new Person("Sai","Piscataway",7);

        Person person4 = new Person("Ram","Ayodhya",38);
        Person person5 = new Person("Lakshman","Ayodhya",7);
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        Map<String, List<Person>> nameMap =  people.stream().collect(Collectors.groupingBy(Person::getCity));

        System.out.println(nameMap);

        Map<Integer,List<Person>> ages = people.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(ages);
    }
}
