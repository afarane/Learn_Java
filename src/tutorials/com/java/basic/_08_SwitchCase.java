package com.java.basic;

public class _08_SwitchCase {

	public static void main(String[] args) {

		String role = "admin";

		switch (role) {

		case "admin":
			System.out.println("You're an admin");
			break;
		case "moderator":
			System.out.println("You're a moderator");
			break;
		default:
			System.out.println("You're a guest");

		}

		char myChar = 'O';

		switch (myChar) {
		case 'A':
			System.out.println(myChar + " is a Vowel");
			break;
		case 'E':
			System.out.println(myChar + " is a Vowel");
			break;
		case 'I':
			System.out.println(myChar + " is a Vowel");
			break;
		case 'O':
			System.out.println(myChar + " is a Vowel");
			break;
		case 'U':
			System.out.println(myChar + " is a Vowel");
			break;
		default:
			System.out.println(myChar + " is Not a Vowel");
			break;
		}

		

	}

}
