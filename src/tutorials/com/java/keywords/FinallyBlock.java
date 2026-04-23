package com.java.keywords;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class FinallyBlock {

	public static void main(String[] args) {
		test1();
		test2();

	}
	
	public static void test1() {
		
		try {
			System.out.println("In test1 try block");
			int a = 10/0;
			System.out.println(a);
			//throw new ArrayIndexOutOfBoundsException();
			// throw new RuntimeException("Runtime Exception");
			
			
		}catch(Exception e) {
			System.out.println("In test1 catch block : " + e.getMessage());
		}finally {
			System.out.println("In test1 finally block");
		}
	}
	
	public static void test2() {
		
		try {
			System.out.println("In test2 try block");
			int a = 10/2;
			System.out.println(a);
			
			
		}catch(ArithmeticException e) {
			System.out.println("In test2 catch block : " + e.getMessage());
		}finally {
			System.out.println("In test2 finally block");
		}
	}

}
