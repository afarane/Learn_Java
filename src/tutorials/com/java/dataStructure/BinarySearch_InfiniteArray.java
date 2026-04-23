package com.java.dataStructure;

public class BinarySearch_InfiniteArray {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 7, 8, 9 };
		int target = 7; // or 8 or 9

		System.out.println(ans(arr, target));
	}

	static int ans(int[] arr, int target) {

		int start = 0;
		int end = 1;

		while (target > arr[end]) {
			int newStart = end + 1;
			end = end + (end - start + 1) * 2;

			start = newStart;

		}

		return binSearch(arr, target, start, end);

	}

	static int binSearch(int[] arr, int target, int start, int end) {

//		int Start = 0;
//		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;

			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}
}
