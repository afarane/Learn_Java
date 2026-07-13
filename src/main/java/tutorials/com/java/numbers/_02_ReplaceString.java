package com.java.numbers;

public class _02_ReplaceString {
	
	public static void main(String[] args) {
		
		String myString = "$First #Number 0123";
		
		myString = myString.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(myString);
		
	}

}
