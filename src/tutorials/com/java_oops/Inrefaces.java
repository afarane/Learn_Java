package com.java_oops;

interface Abc {

	void show();

}

interface Pqr {

	void show();

}

class AbcImplement implements Abc, Pqr {

	public void show() {
		System.out.println("in AbcImplement Show");

	}

}

public class Inrefaces {

	public static void main(String[] args) {

		AbcImplement impl = new AbcImplement();

		impl.show();

		Abc abc = new Abc() {
			public void show() {

			}
		};

		abc.show();

	}

}
