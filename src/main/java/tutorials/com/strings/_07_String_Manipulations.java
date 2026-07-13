package com.strings;

import java.util.Arrays;

public class _07_String_Manipulations {
	
	public static void main(String[] args) {
		
		String str = "Welcome to the world of programming";
		String str1 = "Hello World";
		String str2 = "Hello world";
		String str3 = "   Hello World    ";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('m'));
		System.out.println(str.indexOf('m',str.indexOf('m')+1));
		System.out.println(str.indexOf("hello")); // Will return -1 if not available
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str.substring(0, 7));
		
		System.out.println(str3.trim());
		System.out.println(str3.replace(" ", ""));
		
		String[] strArray = str.split(" ");
		System.out.println(Arrays.toString(strArray));
		
		
		System.out.println(str1.concat(str));
	}

}
