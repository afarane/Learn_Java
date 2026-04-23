package com.java.dataStructure;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		
		int[] numbers = {10,20,30};
		System.out.println(Arrays.toString(numbers));
		
		
		Array nums = new Array(3);
		nums.insert(10);
		nums.insert(30);
		nums.insert(30);
		nums.insert(40);
		nums.insert(50);
		System.out.println(nums.indexOf(10));
		nums.print();
		System.out.println("---------");
		nums.removeAt(2);
		nums.print();

	
	

	}
	
	

}
