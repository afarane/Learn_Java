package com.java.collections;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Hello");
		arrList.add("Abhijeet");

		
		for (String myItem : arrList) {
			System.out.println(myItem);
		}
	}
}
