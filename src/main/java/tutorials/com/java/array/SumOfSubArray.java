package com.java.array;

import java.util.ArrayList;

public class SumOfSubArray {

	public static void main(String[] args) {

		int[] muyArr = { 1, 2, 3, 7, 5 };
		System.out.println(subarraySum(muyArr, 5, 12));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
	// Function to find a continuous sub-array which adds up to a given number.

	{
		ArrayList<Integer> a = new ArrayList<Integer>();

		int currSum;
		for (int i = 0; i < n; i++) {
			currSum = arr[i];

			for (int j = i + 1; j < n; j++) {

				if (currSum == s) {
					a.add(i);
					a.add(j);
					return a;

				}
				if (currSum > s) {
					break;
				}

				currSum += arr[j];

			}

		}

		a.add(-1);
		return a;
	}

}
