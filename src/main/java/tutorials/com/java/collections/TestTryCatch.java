package com.java.collections;

public class TestTryCatch {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		int result = 0;
		
		System.out.println("[log] Print This is Before try catch block");

		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			e.printStackTrace();
		}

		System.out.println("[log] Print This is After try catch block");

	}
}


