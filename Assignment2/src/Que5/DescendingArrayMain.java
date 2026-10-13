package Que5;

import java.util.Scanner;

import Que3.LinearQueue;

class DescendingArray {
	private int top;
	private int[] stack;
	private final int size;

	public DescendingArray(int size) {
		stack = new int[size];
		top = size;
		this.size = size;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			stack[--top] = value;
		}
	}

	public int pop() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			temp = stack[top];
			top++;
		}
		return temp;
	}

	public int peek() {
		int temp = -1;
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			temp = stack[top];
		}
		return temp;
	}

	public boolean isEmpty() {
		return top == size;
	}

	public boolean isFull() {
		return top == 0;
	}
}

public class DescendingArrayMain {
	public static void main(String[] args) {
		DescendingArray da = new DescendingArray(2);

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1.Push\n2.Pop\n3.Peek\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value to input");
				int input = sc.nextInt();
				da.push(input);
				break;
			case 2:
				System.out.println(da.pop());
				break;
			case 3:
				System.out.println(da.peek());
				break;
			default:
				System.out.println("Invalid input");
				break;
			}

		} while (choice != 0);
	}
	
}
