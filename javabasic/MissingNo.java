package com.javabasic;

public class MissingNo {
	public static void main(String[] args) {
		int a[] = { 1, 4, 3};
		int b[] = { 1, 0, 4 ,8};

		for (int i = 0; i < b.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length; j++) {
				if(b[i]==a[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(b[i]);
			}
		}
	}
}
