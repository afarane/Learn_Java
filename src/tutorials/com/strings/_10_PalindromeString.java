package com.strings;

public class _10_PalindromeString {

	public static void main(String[] args) {

		String str = "ABCBA";

		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {

		if (str == null || str.length() == 0) {
			return true;
		}

		str = str.toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {

			char s = str.charAt(i);
			char e = str.charAt(str.length() - 1 - i);

			if (s != e) {
				return false;
			}

		}
		return true;
		
		
		

	}
	
	

}
