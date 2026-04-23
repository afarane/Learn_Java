package com.java.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class A02_Prime_BigInteger {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();
		bufferedReader.close();

		BigInteger n = new BigInteger(s);
		System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

	}
}
