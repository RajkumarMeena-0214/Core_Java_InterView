package com.javabasic;

public class ArmStrongNo {
	public static void main(String[] args) {
		int num = 153;
		int temp = 0;
		int num2 = num;
		while (num > 0) {
			int r = num % 10;
			temp = temp + r * r * r;
			num = num / 10;
		}
		if (num2 == temp) {
			System.out.println("y");
		} else {
			System.out.println("no");
		}
	}
}
