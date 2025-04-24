package com.kotari;

public class FunctionalInterfaceImpl implements FunctionalInterfaceDemo {

	@Override
	public int getSquare(int x) {
		System.out.println("value of x:"+x);
		return x * x;

	}

}
