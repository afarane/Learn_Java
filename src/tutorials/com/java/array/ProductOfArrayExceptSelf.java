package com.java.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		productOfArrayElements();
		leftRighMethod();

	}

	// Approach 1 : Prod is Divide by Current
	public static void productOfArrayElements() {

		int[] input = new int[] { 3, 1, 6, 4 };
		int[] output = new int[input.length];

		int prod = 1;
		for (int i = 0; i < input.length; i++) {

			prod = (prod * input[i]);

		}

		for (int j = 0; j < input.length; j++) {
			output[j] = prod / input[j];
		}
		System.out.println(Arrays.toString(output));

	}

	public static void leftRighMethod() {
		int[] input = new int[] { 3, 1, 6, 4 };

		int N = input.length;

		int[] leftProducts = new int[N];
		int[] rightProducts = new int[N];

		int[] output = new int[N];

		leftProducts[0] = 1;
		rightProducts[N - 1] = 1;

		for (int i = 1; i < N; i++) {
			leftProducts[i] = leftProducts[i - 1] * input[i - 1];
		}

		for (int i = N - 2; i >= 0; i--) {
			rightProducts[i] = rightProducts[i+1]* input[i+1];

		}
		
		for(int i = 0; i <N; i++) {
			output[i] = leftProducts[i]  * rightProducts[i];
		}
		
		System.out.println(Arrays.toString(leftProducts));
		System.out.println(Arrays.toString(rightProducts));
		System.out.println(Arrays.toString(output));

	}

}
