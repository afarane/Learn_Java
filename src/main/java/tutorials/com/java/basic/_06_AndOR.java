package com.java.basic;

public class _06_AndOR {

	public static void main(String[] args) {

		int x = -1;
		int y = 1;

		if (x > 0 && y > 0) {
			System.out.println("Both Numbers are Positive");
		} else if (x > 0 || y > 0) {
			System.out.println("Atleast One Number is Positive");
		} else {
			System.out.println("Both Numbers are Negative");
		}

		// You can use single '&' and '|' used to
		// mandatorily check both conditions

	}

}
