package com.java.numbers;

public class _07_ArmstrongNumber {

	public static void main(String[] args) {

		int myInt = 153;
		int temNum = myInt;

		int r, sum = 0;

		
		while (myInt > 0) {

			r = myInt % 10;

			sum = sum + r * r * r;

			myInt = myInt / 10;

		}

		if (temNum == sum)
			System.out.println(temNum + " is an ArmStrong Number");
		else
			System.out.println(temNum + " is NOT an ArmStrong Number");

	}
	
	

}
