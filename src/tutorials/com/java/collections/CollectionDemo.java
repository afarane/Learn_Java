package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {


		Comparator<String> strCom = new Comparator<String>() {

			public int compare(String s1, String s2) {
				if (s1.length() > s2.length())
					return 1;
				else
					return -1;
			}

		};

		List<String> str = new ArrayList<String>();
		str.add("Abhijeet");
		str.add("John");
		str.add("Vivek");

		Collections.sort(str, strCom);
		System.out.println(str);

		// Int Comparison
		Comparator<Integer> com = new Comparator<Integer>() {

			public int compare(Integer i, Integer j) {
				if (i % 10 > j % 10)
					return 1;
				else
					return -1;
			}

		};
		List<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(62);
		nums1.add(54);
		nums1.add(49);
		nums1.add(65);

		Collections.sort(nums1, com);
		System.out.println(nums1);

		// Set HashSet ? TreeSet for ordered list
		Set<Integer> nums2 = new TreeSet<Integer>();
		nums2.add(62);
		nums2.add(54);
		nums2.add(4);
		nums2.add(6);

		Iterator<Integer> it = nums2.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
