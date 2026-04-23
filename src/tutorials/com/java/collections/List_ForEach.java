package com.java.collections;

import java.util.List;
import java.util.Arrays;

public class List_ForEach {

	public static void main(String[] args) {

		int sum = 0;
		List<Integer> nums = Arrays.asList(4, 5, 7, 2);

		nums.forEach(n -> System.out.println(n));

		for (int n : nums) {
			if (n % 2 == 0) {
				n = n * 2;
				sum = sum + n;
			}
		}

		System.out.println(sum);

	}

}
