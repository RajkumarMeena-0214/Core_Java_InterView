package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmpl {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Employee(2, "rajkumar"));
		l.add(new Employee(4, "Nikhil"));
		l.add(new Employee(3, "kp"));
		l.add(new Employee(1, "gopal"));
		l.add(new Employee(1, "zzname"));
		
		Collections.sort(l);

		System.out.println(l);
	}
}
