package com.strings;

public class _09_SwapStrings {
	
	public static void main(String[] args) {
		
		String a = "Hello";
		
		String b = "World";
		
		System.out.println("Before Swappping");
		System.out.println("a : " + a + " b : " + b);
		
		
		System.out.println("After Swapping");
		String t = "";
		t = a;
		a = b;
		b = t;
		System.out.println("a : " + a + " b : " + b);
		
		// --------- Third Method ---------
		String h = "Hello";
		String w = "World";
		
		System.out.println("Before Swappping");
		System.out.println("h : " + h + " w : " + w);
		
		h = h + w;
		
		w = h.substring(0, h.length()-w.length());
		h = h.substring(w.length());
		
		System.out.println("After Swapping");

		System.out.println("h : " + h + " w : " + w);
				
		
	}

}
