package com.kotari;

import java.util.function.BiConsumer;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> biConsObj = (a,b) -> System.out.println(a+b);
		biConsObj.accept(2, 3);
		
	}

}
