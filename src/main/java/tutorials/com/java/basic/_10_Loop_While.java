package com.java.basic;

import java.util.Scanner;

public class _10_Loop_While {

	public static void main(String[] args) {
		int x = 1;

		while (x <= 5) {
			System.out.println(x);
			x++;

		}

		Scanner sc = new Scanner(System.in);
		String input = "";

		while (true) {
			System.out.print("Input: ");
			input = sc.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				break;
			

		}

	}

}
