package com.java.numbers;

public class _10_PalindromeNumber {

	
	public static void main(String[] args) {
		
		isPalindromeNumber(150);

		int myInt = 121; // Reverse this int
		int revInt = 0;

		int originalInt = myInt;

		while (myInt != 0) {
			revInt = revInt * 10 + myInt % 10;
			myInt = myInt / 10;
		}

		System.out.println();

		// Check of originalInt is Palindrome number or Not
		if (originalInt == revInt)
			System.out.printf("[log] %d This is a Palindrome number", originalInt);
		else
			System.out.printf("[log] %s This is Not a Palindrome number", originalInt);

	}
	
	public static void isPalindromeNumber(int num) {

		int originalNum = num;
		int revInt = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			revInt = revInt * 10 + r;
			num = num / 10;

		}

		// Check of originalInt is Palindrome number or Not
		if (originalNum == revInt)
			System.out.printf("[log] %d This is a Palindrome number", originalNum);
		else
			System.out.printf("[log] %s This is Not a Palindrome number", originalNum);
	}


}
