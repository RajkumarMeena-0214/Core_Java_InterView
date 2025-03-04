package com.string;

public class TextFile {
	public static void main(String[] args) {
		String [] arr = {"ohh.py","attitude.java","by.txt"};
		for(String s :arr) {
			if(s.endsWith(".java")) {
				System.out.println(s);
			}
		}
	}
}
