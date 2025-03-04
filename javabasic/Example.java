package com.javabasic;

public class Example {
	public static void main(String[] args) {
		FunctionalInt f = new TestFunctionalInt() {
			@Override
			public int doStuff(int a, int b) {
				return doStuff(a, b);
			}
		};
		int a = 10;
		int b = 22;
		 f.add(a, b);
		System.out.println(f.doStuff(a, b));
	}
}
