 package com.strings;

import java.util.Scanner;
import java.util.Stack;

public class _03_ReverseString {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		String s = "I am Abhijeet Farane 123";

		System.out.println("Original String : " + s);
		revStringForLoop(s);
		revString_StringBuilder(s);
		reverseString(s);
		revStringStack(s);

	}

	// Method 1 : Reverse String Using For Loop
	public static void revStringForLoop(String inString) {

		String revString = "";
		int lenString = inString.length();

		for (int i = lenString - 1; i >= 0; i--) {
			revString += inString.charAt(i);
		}

		System.out.println("Reverse String using For Loop : " + revString);

	}

	// Method 2 : Using StringBuilder

	public static void revString_StringBuilder(String inString) {
		StringBuilder sb = new StringBuilder(inString);
		System.out.println("Reverse String using StringBuilder : " + sb.reverse());
	}

	// Method 3 : Reverse Sentence with words as Last In First out
	public static void reverseString(String inString) {
		String[] newString = inString.split("\\s");
		String res = "";

		for (int i = newString.length - 1; i >= 0; i--) {
			res += newString[i] + " ";

		}

		System.out.println("Reverse Sentence with words as Last In First out : " + res.trim());

	}
	


	// Method 4 : Reverse each word in a Sentence in Same Order
	public static void revStringStack(String inString) {

		System.out.print("Reverse Characters in Words but keep word order same Sentence : ");

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < inString.length(); i++) {

			if (inString.charAt(i) != ' ') {
				st.push(inString.charAt(i));
			} else {
				while (st.empty() == false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}

		}

		while (st.empty() == false) {
			System.out.print(st.pop());
		}

		System.out.println();

	}

}
