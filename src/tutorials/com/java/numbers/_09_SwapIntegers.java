package com.java.numbers;

public class _09_SwapIntegers {

	public static void main(String[] args) {
		

		int x = 5;
		int y = 10;
		
		// Without using temp variable:
		
		x = x + y;
		y = x -y;
		x = x - y;
		
		System.out.println("x: " + x + " y: " + y);
		
		int t;
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("x: " + x + " y: " + y);
		

	}

}
