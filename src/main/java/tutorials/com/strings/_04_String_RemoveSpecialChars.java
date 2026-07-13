package com.strings;

public class _04_String_RemoveSpecialChars {

	public static void main(String[] args) {
		
		
		String s = "@#$$Hello%% Python3&&%%$$";
		
		s = s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);

	}

}
