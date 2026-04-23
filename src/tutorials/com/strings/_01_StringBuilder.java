package com.strings;

public class _01_StringBuilder {

	public static void main(String[] args) {
	
		
		StringBuilder sb = new StringBuilder("Hello");

		
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0, 'B');
		
		sb.insert(0, 'S');
		
		sb.delete(0, 1);
		
		System.out.println(sb);
		
	

	}

}
