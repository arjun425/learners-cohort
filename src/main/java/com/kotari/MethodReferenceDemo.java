package com.kotari;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo functionalInterface = new FunctionalInterfaceImpl();
		functionalInterface.getSquare(3);
		System.out.println(functionalInterface.getSomeString());
		
		FunctionalInterfaceDemo fd1 = (x)->(x*x);
		System.out.println(fd1.getSquare(6));
		
		FunctionalInterfaceDemo fd2 = MethodReferenceDemo::getSquare;
		System.out.println(fd2.getSquare(7));
		
		Test test = new Test();
		test.print(25);
	}
	
	
	public static int getSquare(int x) {
		System.out.println("value of x:"+x);
		return x * x;

	}
	
	public static int getSquare1(String x) {
		System.out.println("value of x:"+x);
		return Integer.valueOf(x)*Integer.valueOf(x);

	}

}

class Test{
	
	public static void print(int x) {
		System.out.println(x);
	}
}
