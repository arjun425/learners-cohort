package com.kotari;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> pred = s-> s.intValue()==-11;
		System.out.println(pred.test(-11));
	}

}
