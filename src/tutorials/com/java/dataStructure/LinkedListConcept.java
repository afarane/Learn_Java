package com.java.dataStructure;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListConcept {
	
	
	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		list.addFirst(5);
		list.removeLast();
		
		System.out.println(list.indexOf(20));
		
		var arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		
	}


}
