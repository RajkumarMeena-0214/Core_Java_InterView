package com.string;

public class UpperCase {
	//UpperCase withOut built in method
	// isko sawan sir ni banwate hay
	public static void main(String[] args) {
		String s = "lokesh";
		String val = "";
		for (int i = 0; i < s.length(); i++) {
			String x = String.valueOf(s.charAt(i));
			for (char j = 'A'; j <= 'Z'; j++) {
				if (x.equalsIgnoreCase(String.valueOf(j))) {
					val+=j;
				}
			}
		}
		System.out.println(val);
	}
}
