package com.java.array;

import java.util.Arrays;
import java.util.Comparator;

public class Array_SortAlphaNum_Num {

	public static void main(String[] args) {

		String[] arr = { "ABC_2", "ABC_11", "ABC_1", "ABC_12", "ABC_22", "ABC_5", "ABC_3", "ABC_21" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
