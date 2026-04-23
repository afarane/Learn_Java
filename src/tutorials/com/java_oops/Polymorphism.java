package com.java_oops;

class Student {

	String name;
	int age;

	// Function Overloading - Compile time Polymorphism
	public void printInfo(String name) {
		System.out.println(name);
	}

	public void printInfo(int age) {
		System.out.println(age);
	}

	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.printInfo(24);
		s1.printInfo("John");

	}

}
