package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A05_Java_String_Tokens {

	
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();
	        // Write your code here.	
	        s=s.replaceAll("[^a-z A-Z]"," ");
	        s=s.replaceAll("\\s+"," ");
	        
	        if (s.length() == 0) {
	            System.out.println(0);
	            return;
	        }
	        
	        String[] tokens = s.split("[!,?._'@ ]+");
	        ArrayList<String> sArr = new ArrayList<String>(Arrays.asList(tokens));
	        
	        System.out.println(sArr.size());
	        
	        for( String str : sArr)
	        {
	        	System.out.println(str);
	        }
	    
	        
		
	}
}
