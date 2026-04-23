package hackerrank.java.basic;
// Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

// Solution 1 : For loop

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_of_File {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Option 1
		for (int i = 1; sc.hasNext(); i++) {

			System.out.println(i + " " + sc.nextLine());

		}

		// Option 2
		int i = 1;
		while (sc.hasNext()) {
			System.out.println(i + " " + sc.nextLine());
			i++;
		}

	}
}
