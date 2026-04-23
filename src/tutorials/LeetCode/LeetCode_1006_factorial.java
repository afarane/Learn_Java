package LeetCode;

public class LeetCode_1006_factorial {

	// https://leetcode.com/problems/clumsy-factorial/description/

	/*
	 * We make a clumsy factorial using the integers in decreasing order by swapping
	 * out the multiply operations for a fixed rotation of operations with multiply
	 * '*', divide '/', add '+', and subtract '-' in this order.
	 * 
	 * For example, clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
	 */

	public static void main(String[] args) {

		System.out.println(clumsy(10));

	}

	 public static int clumsy(int N) {

			if (N == 0)
				return 0;
			if (N == 1)
				return 1;
			if (N == 2)
				return 2;
			if (N == 3)
				return 6;
			return N * (N-1) / (N-2) + chain(N-3);
		
		}
		
		public static int chain(int N) {
			if (N == 0)
				return 0;
			if (N == 1)
				return 1;
			if (N == 2)
				return 1;
			if (N == 3)
				return 1;
			return N-(N-1) * (N-2)/(N-3) + chain(N-4);
			
		}

}
