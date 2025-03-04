package com.javabasic;

public class TestFunctionalInt implements FunctionalInt {

	@Override
	public int doStuff(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		TestFunctionalInt f = new TestFunctionalInt();
		
		int a =5;
		int b =4;
		System.out.println(f.doStuff(a, b));
		
		
	}
}
