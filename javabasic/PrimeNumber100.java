package com.javabasic;

public class PrimeNumber100 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			boolean temp = true;

			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					temp = false;
				}
			}
			if (temp)
				System.out.println("prime number : " + i);
		}
	}

}