package com.javabasic;

public class TestFunctionalIntWithLemda {

	public static void main(String[] args) {

		FunctionalInt f = (a, b) -> {
			return a * b;
		};
		int a = 10;
		int b = 5;

		f.add(a, b);
		FunctionalInt.sub(a, b);
		System.out.println(f.doStuff(a, b));
	}
}
