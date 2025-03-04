package com.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		LocalDate d = LocalDate.of(2002, 04, 15);
		Period p = Period.between(d, ldate);
		System.out.println(p.getYears());
	}
}
