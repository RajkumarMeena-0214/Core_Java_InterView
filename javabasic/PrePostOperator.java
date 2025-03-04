package com.javabasic;

public class PrePostOperator {
	public static void main(String[] args) {
		int i = 1;
		System.out.println(--i + i + i++ + --i + i-- + i++ + 
				i++ + ++i + --i + i-- + i + i++ + --i + i--);
	}
}
