package com.java.collections;

public class Rectangle {

	private int length;
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	int width;
	int Area;

	int calculateArea(int l, int w) {
		Area = l * w;		
		System.out.println("Area is : " + Area);
		
		
		return Area;
	}

}


