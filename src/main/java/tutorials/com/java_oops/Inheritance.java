package com.java_oops;

class Shape {
	String color;

	public void area(int l, int h) {

		System.out.println("Area : " + (l * h) / 2);
	}
}

class Triangle extends Shape {

}

class Circle extends Shape {
	// Method Overriding
	public void area(int r) {
		System.out.println(3.14 * r * r);

	}
}

public class Inheritance {

	public static void main(String[] args) {
		// Inheritance
		Triangle t1 = new Triangle();
		t1.color = "blue";
		t1.area(2, 3);

		Circle s1 = new Circle();
		s1.area(5);
	}

}
