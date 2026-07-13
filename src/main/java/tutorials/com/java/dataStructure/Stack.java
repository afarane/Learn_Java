package com.java.dataStructure;

public class Stack {

	int[] stack = new int[5];
	int top = 0;

	public void push(int data) {

		if (top == 5) {
			System.out.println("Stack is Full");
		} else {

			stack[top] = data;
			top++;
		}

	}

	public int pop() {
		int data = 0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			
		}else {
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
