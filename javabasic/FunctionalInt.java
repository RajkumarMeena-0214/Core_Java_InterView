package com.javabasic;

@FunctionalInterface
public interface FunctionalInt {
	int doStuff(int a, int b);

	public static void sub(int a, int b) {
		System.out.println("substraction " + (a - b));
	}

	public default void add(int a, int b) {
		System.out.println("addition is "+  (a + b));
	}
}
