package com.kotari;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


public class StreamsDemo {
	
	public static void main(String[] args) {
		
		List<String> values = Arrays.asList(new String []{"test", "me"});
        Person1 nullName = new Person1(null);
        Person1 bob = new Person1("bob");
        Person1 barbara = new Person1("barbara");
		System.out.println(coalesce(nullName::name, bob::name, barbara::name));

		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		System.out.println(integers);

		//integers.stream().map()

	}
	
	public static <T> T coalesce (Supplier<T> ...ts) {
		return Arrays.asList(ts).stream().map(t->t.get()).filter(t->t!=null).findFirst().orElse(null);
		
	}
	



}

class Person1 {

	public Person1(Object object) {
		// TODO Auto-generated constructor stub
	}

	public String name () {
		return "";
	}

}
