package com.java.dataStructure;

public class DStack {

	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;

	public void push(int data) {
		
		if (size() == capacity)
			expand();
		stack[top] = data;
		top++;

	}

	private void expand() {
		int length = size();
		int[] newStack = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity = capacity*2;
		
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty");

		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}

		return data;

	}

	public int peak() {
		int data;
		data = stack[top - 1];
		System.out.println(data);
		return data;

	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}

	}

}
