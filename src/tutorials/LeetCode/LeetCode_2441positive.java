package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_2441positive {

	public static void main(String[] args) {
	 // https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
		
		int[] nums = {-1,10,6,7,-7,1};
		
		findMaxK(nums);

	}
	
	public static int findMaxK(int[] nums) {

		int ans = -1;
		Set<Integer> mySet = new HashSet<>();

        for (int i : nums){
            if (mySet.contains(-i)){
            	ans = Math.max(ans, Math.abs(i));
               
            }else {
            	mySet.add(i);
            }
        }
        
        System.out.println(ans);
		return ans;
 
    }

}
