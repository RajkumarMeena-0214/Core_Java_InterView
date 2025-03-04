package com.oop.overriding;

public class Dog extends Animal {

	public void sound() {
		System.out.println("this is dog");
	}
	
	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		
	}
}