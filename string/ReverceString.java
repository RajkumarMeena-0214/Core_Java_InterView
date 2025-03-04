package com.string;

public class ReverceString {
	public static void main(String[] args) {
		String s = "lokesh solanki";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
