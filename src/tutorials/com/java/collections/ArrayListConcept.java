package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
 
		ArrayList<String> myArrayList = new ArrayList<String>();

		myArrayList.add("Ajay");
		myArrayList.add("Suresh");
		myArrayList.add("Mansi");

		// Using Java 8
		System.out.println("1. ---- forEach ----");
		myArrayList.forEach(names -> {

			System.out.println(names);

		});

		System.out.println("2. ---- Using Iterator ----");
		// Using Iterator

		Iterator<String> it = myArrayList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("3. ---- forEachRemaining Iterator ----");
		it = myArrayList.iterator();
		it.forEachRemaining(itNames -> {

			System.out.println(itNames);

		});
		
		System.out.println("4. ---- forEach Loop ----");
		
		for(String name : myArrayList) {
			System.out.println(name);
		}
		
		System.out.println("5. ---- for Loop ----");
		
		for (int i=0; i < myArrayList.size();i++) {
			System.out.println(myArrayList.get(i));
		}

	}

}
