package com.oop.ConstructorCalling;

public class ConstructorCalling {

	String fName;
	String lName;
	String Address;

	public ConstructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
	}

	public ConstructorCalling(String fName, String lName, String Address) {
		this(fName,lName);
		
		this.Address = Address;
		System.out.println(Address);
	}
}