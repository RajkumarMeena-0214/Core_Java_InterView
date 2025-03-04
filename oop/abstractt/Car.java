package com.oop.abstractt;

public class Car extends Vahical {

	@Override
	void strat() {
		System.out.println("car engine starts");
	}

	public Car(String brand, int speed) {
		super(brand, speed);
	}

	public static void main(String[] args) {
		Car c = new Car("testla", 100);
		c.getInfo();
		c.strat();
	}
}
