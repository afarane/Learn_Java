package com.java.basic;
import java.text.NumberFormat;

public class _04_NumberFormat {

	public static void main(String[] args) {
		
		// Post Increment
		int i = 4;
		int a = i++;
		System.out.println(a + ":" + i);
		
		// Pre Increment
		int j = 4;
		int b = ++j;
		System.out.println(b + ":" + j);
		
	
		String result =  NumberFormat.getCurrencyInstance().format(1005.897);
		System.out.println(result);
		
		String result_percent = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result_percent);
		
		
	}

}
