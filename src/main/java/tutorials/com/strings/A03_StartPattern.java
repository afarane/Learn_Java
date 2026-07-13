package com.strings;

import java.util.Iterator;

public class A03_StartPattern {

	public static void main(String[] args) {

		pattern1(5);
		System.out.println("          ");
		pattern2(5);
		System.out.println("          ");
		pattern3(5);
		System.out.println("          ");
		pattern4(5);
		System.out.println("          ");
		pattern5(5);
	}

	static void pattern1(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void pattern2(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = n; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {

		for (int row = 0; row < 2 * n; row++) {

			int totalColInRow = row > n ? 2 * n - row : row;

			for (int col = 0; col < totalColInRow; col++) {
				System.out.print("* ");
			}

			if (row > n) {

			}
			System.out.println();
		}
	}

}
