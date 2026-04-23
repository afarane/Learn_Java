package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class A04_Java_Anagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function

		if (a.length() != b.length()) {
			return false;
		} else {

			char[] arr = a.toLowerCase().toCharArray();
			char[] brr = b.toLowerCase().toCharArray();

			java.util.Arrays.sort(arr);
			java.util.Arrays.sort(brr);

			return Arrays.equals(arr, brr);
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
