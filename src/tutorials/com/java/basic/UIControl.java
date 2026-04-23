package com.java.basic;

public abstract class UIControl {
	

//	public UIControl(boolean isEnabled) {
//		this.isEnabled = isEnabled;
////		System.out.println("UIControl");
//		
//	}
	
	public abstract void render();
	
	

	private boolean isEnabled = true;

	public void enable() {
		isEnabled = true;

	}


	public void disable() {
		isEnabled = false;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

}
