package com.string;

public class StringMethods {
public static void main(String[] args) {
	String s ="LokesH   ";
	
	System.out.println(s.charAt(1));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf("s"));
	System.out.println(s.contains("e"));
	System.out.println(s.isEmpty());
	System.out.println(s.isBlank());
	System.out.println(s.length());
	System.out.println(s.trim());
	System.out.println(s.endsWith("sh"));
}
}
