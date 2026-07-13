package LeetCode;

import java.util.Arrays;

public class Leetcode_350 {
	/*
	 * Given two integer arrays nums1 and nums2, return an array of their
	 * intersection. Each element in the result must appear as many times as it
	 * shows in both arrays and you may return the result in any order.
	 */

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		intersection(nums1, nums2);

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int[] ans = new int[nums1.length];

		int i = 0;
		int j = 0;

		int k = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] > nums2[j]) {
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				ans[k] = nums1[i];
				i++;
				j++;
				k++;
			}

		}

		Arrays.copyOfRange(ans, 0, k);

		return ans;

	}

}
