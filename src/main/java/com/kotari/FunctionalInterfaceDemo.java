package com.kotari;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	public abstract int getSquare(int x);

	public static void main() {
		System.out.println(" in main");
	}

	public default String getSomeString() {
		return "something";
	}

}
