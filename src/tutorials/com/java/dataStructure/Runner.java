package com.java.dataStructure;


public class Runner {

	public static void main(String[] args) {
		
		
		Stack nums = new Stack();
		System.out.println("Empty? = " + nums.isEmpty());
		
		nums.push(15);		
		nums.push(8);		
		System.out.println("Peak ");
		nums.push(10);
		nums.peak();
		nums.pop();
		
		System.out.println("Size is : " + nums.size());
		System.out.println("Empty? = " + nums.isEmpty());
		
		nums.show();
		

//		LinkedList list = new LinkedList();
//		
//		list.insert(18);
//		list.insert(45);
//		list.insert(24);
//		
//		list.show();
		
	}

}
