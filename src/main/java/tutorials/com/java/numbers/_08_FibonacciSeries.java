package com.java.numbers;

public class _08_FibonacciSeries {

	// Fibonacci Series : 1,1,2,3,5,8,13,21,34,55,89
	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 1;
		c = 0;

		System.out.print("1,1");
		while (c <= 100) {

			c = a + b;
			if (c >= 100)
				break;
			else
				System.out.print(",");

			System.out.print(c);
			a = b;
			b = c;
		}

//		System.out.println(fibo(8));

	}

//	static int fibo(int n) {
//
//		if (n < 2) {
//
//			return n;
//		}
//
//		return fibo(n - 1) + fibo(n - 2);
//
//	}

}
