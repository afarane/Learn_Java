package com.java.collections;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamAPI {

	public static void main(String[] args) {

		int sum = 0;
		List<Integer> nums = Arrays.asList(4, 5, 7, 2);

//		Stream<Integer> s1 = nums.stream();
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		int result = s3.reduce(0, (c,e) -> c+e);
		
		int res = nums.stream()
						.filter(n -> n%2==0).map(n -> n*2).reduce(0,(c,e) -> c+e);
		
		System.out.println(res);
		
//		s3.forEach(n ->System.out.println(n));

	
	}

}
