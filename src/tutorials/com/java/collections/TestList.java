package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(14);
		values.add(1,55);

		Iterator it = values.iterator();
		
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
