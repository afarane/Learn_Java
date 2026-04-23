package com.java.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _04_Remove_Num_FromArray {

	public static void main(String[] args) {
		
		
		int[] nums = { 22, 44, 55, 44, 88, 99 };
		System.out.println(Arrays.toString(nums));
		
		List<Integer> myNums = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		int numToDelete = sc.nextInt();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != numToDelete) {
				myNums.add(nums[i]);

			}
			
		}

		System.out.println(Arrays.toString(myNums.toArray()));

	}

}
