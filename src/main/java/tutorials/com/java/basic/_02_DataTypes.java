package com.java.basic;

public class _02_DataTypes {

	public static void main(String[] args) {

		// DataType : Integer | Operator : +
		
		byte b = 5; // 1 bytes -> 8 bits -> -128 to 127
		short k = 5; // 2 bytes -> 16 bits -> -32768 to 32767
		int x = 20; // 4 bytes -> 32 bits -> 
		long c = 5000l; // 8 bytes ->
		float m = 5.5f;
		double p = 5.5;
		int y = 30;
		int result = x + y;
		
		System.out.println(result);

		// We can concatenate Result with String as below:
		System.out.println("Addition Result is : " + result);

	}
}