package com.java.basic;

public class _09_Loop_For {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		String[] fruits = {"Apple", "Mango","Orange"};
		
		for(int i = 0; i < fruits.length; i++)
			System.out.println(fruits[i]);
			
		System.out.println("-----------");
		
		// For each Loop
		// 1. Forward loop only.
		// 2. No access to index
		for(String fruit : fruits) {
			System.out.println(fruit);
			
		}
		
	
	}

}
