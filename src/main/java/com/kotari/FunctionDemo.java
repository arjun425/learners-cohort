package com.kotari;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String, String> sample = x -> "Hi " +x;
		System.out.println(sample.apply("Pradeep"));


		Function<Integer, String> sample1 = x -> "Hi " +x;
		System.out.println(sample1.apply(123));


	}

}
