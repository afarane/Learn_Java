package com.java.collections;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();		
		
		hm.put("CompanyName","ITechOasis");
		hm.put("EmployeeCount","5");
		hm.put("Sector","D");		
		
		System.out.println(hm.get("EmployeeCount"));	

	}
}
