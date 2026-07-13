package com.java.enums;


enum Status{
	Running,Failed,Pending, Success;
}

public class demoEnum {

	public static void main(String[] args) {
	
		Status[] ss = Status.values();
		
		for(Status s : ss) {
			System.out.println(s + " : " + s.ordinal());
		}
		
		Status s = Status.Pending;
		System.out.println(s.getClass().getSuperclass());
		switch(s) {
		case Running:
			System.out.println("Running");
			break;
		case Failed:
			System.out.println("Failed");
			break;
		case Pending:
			System.out.println("Pending");
			break;
			
		default:
			System.out.println("Done");
			break;
		}

	}

}
