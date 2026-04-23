package com.java.dataStructure;

public class Big_O_Notation {

	public static void main(String[] args) {

	}

	public void tes1(int[] numbers) {

		// O(1)
		System.out.println(numbers[0]);
		System.out.println(numbers[0]);

	}

	public void test2(int[] numbers) {
		// O(n)
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}

	}

	public void test3(int[] numbers) {
		// O(n)
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}

	}

	public void test4(int[] numbers) {
		// O(n^2)
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.println(numbers[j]);

			}

		}

	}
	
	// O (2^n) + Exponential 

}
