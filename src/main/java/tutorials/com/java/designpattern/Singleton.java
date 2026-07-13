package com.java.designpattern;

public class Singleton {

	// You can create only one instance or object of this Singleton class.
	// Constructor is private
	// public Static method with return type of object of Singleton class. (Lazy
	// Initialization)

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "I am in Singleton constructor";
		System.out.println(str);
	}

	public static Singleton getInstance() {

		if (singleton_instance == null) {
			singleton_instance = new Singleton();

		}
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}

}
