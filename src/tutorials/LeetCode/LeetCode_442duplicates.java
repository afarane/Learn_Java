package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_442duplicates {

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-all-duplicates-in-an-array/

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDuplicates(nums);

	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;

			if (nums[index] < 0) {

				ans.add(index + 1);
			}
			nums[index] = -nums[index];

		}
		return ans;

	}

}
