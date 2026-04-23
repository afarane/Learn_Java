package com.java.basic;

public class _07_If_Else {
	
	public static void main(String[] args) {
		
		// If condition
		int x = 30;
		int y = 20;		
		
		if (x>y) {
			System.out.println("X is Greater than Y");
		} else if (x<y) {
			System.out.println("X is Less than Y");
		} else {
			System.out.println("X is Equal to Y");
		}
		
		// Ternary Operator
		int income = 120_000;
		String className = income > 100_000 ? "First" : "Economy";
		
	}

}
