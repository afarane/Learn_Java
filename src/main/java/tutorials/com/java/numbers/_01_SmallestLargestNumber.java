package com.java.numbers;

import java.util.Arrays;

public class _01_SmallestLargestNumber {

	public static void main(String[] args) {

		int numbers[] = {-20, 10, 20, -4, 100 };

		int largestNumber = numbers[0];
		int smallestNumber = numbers[0];
		int max = 0;
		int min = 0;

		for (int i = 1; i < numbers.length; i++) {
			max = Math.max(numbers[i - 1], numbers[i]);
			min = Math.min(numbers[i - 1], numbers[i]);

			if (numbers[i] > largestNumber) {
				largestNumber = numbers[i];
			} else if (numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}

		System.out.println(max);
		System.out.println(min);

		System.out.println(" Array is : " + Arrays.toString(numbers));
		System.out.println(" Largest Number is : " + largestNumber);
		System.out.println(" Smallest Number is : " + smallestNumber);

	}

}
