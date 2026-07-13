package com.java.basic;

public class TextBox extends UIControl {

	
	public void render() {
		System.out.println("Render TextBox");
	}
	
	@Override
	public String toString() {
		
		return text;
		
	}

	private String text = "";

	public void setText(String text) {
		this.text = text;
	}

	public void clear() {
		text = "";
	}


}
