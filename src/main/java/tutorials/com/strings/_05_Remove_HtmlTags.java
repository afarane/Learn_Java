package com.strings;


public class _05_Remove_HtmlTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String html = "<ht><a> Hello World </a><h2>";
		
		
			System.out.println(html.replaceAll("\\<.*?>",""));
			


	}
	

}
