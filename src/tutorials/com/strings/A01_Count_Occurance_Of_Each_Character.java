package com.strings;

import java.util.HashMap;
import java.util.Map;

public class A01_Count_Occurance_Of_Each_Character {

	public static void main(String[] args) {
		String name = "Automation is good";

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char strArr[] = name.toCharArray();

		for (char c : strArr) {

			if (!Character.isSpaceChar(c)) {

				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);
				}
			}
		}

		System.out.println(name + " : " + charMap);

	}

}
