package com.java.numbers;

public class _03_ReverseInt {

	public static void main(String[] args) {

		int myInt = 12345; // Reverse this int
		int revInt = 0; // Reserve Result int variable

		// Method 1 : while
		while (myInt != 0) {
			revInt = revInt * 10 + myInt % 10;
			myInt = myInt / 10;
		}
		

		System.out.println(revInt);

		int myInt1 = 12345; // Reverse this int

		// Method 2 : StringBuffer

		System.out.println(new StringBuffer(String.valueOf(myInt1)).reverse());
		

	}

}
