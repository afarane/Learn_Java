package com.java.collections;

public class Arrays {

	public static void main(String[] args) {
		
		  // Array of 4 Elements 
			int[] numArr = { 20, 35, 60, 75 };
			System.out.println(numArr.getClass().getName());
		  System.out.println(numArr[0]);
		  
		  System.out.println("-------------------");
		  
		  for (int tmp1 : numArr) { System.out.println(tmp1); }
		  System.out.println("-------------------");
		  
		  int[] myArr = new int[4]; myArr[0] = 55; myArr[3] = 21;
		  
		  for (int tmp2 : myArr) { System.out.println(tmp2); }
		  
		 

		/*
		 * int[][] myTwoDimArr = new int[2][3];
		 * 
		 * myTwoDimArr[0][1] = 11; myTwoDimArr[1][1] = 21;
		 * 
		 * for (int i = 0 ; i < 2;i++) { for (int j = 0; j <3;j++) {
		 * System.out.println(myTwoDimArr[i][j]); }
		 * 
		 * }
		 */

		/*
		 * for (int[] tmp1 : myTwoDimArr) { for (int tmp2 : tmp1) {
		 * System.out.println(tmp2); }
		 * 
		 * }
		 */

		

	}

}
