package com.oop.shapeArrayWMRT;

/**
 * @author lokesh solanki
 * the class full name is Shape Array with method return type
 */
public class TestShape {
	public static void main(String[] args) {

		Shape[] s = new Shape[2];
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		
		
		double area = area(s);
		System.out.println(area);
	}

	public static double area(Shape[] s) {
		double d = 0;
		for (Shape ss : s) {
			d = d + ss.area();
		}
		return d;
	}
}