package com.challenge.stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StackImpl {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String strs[] = line.split(" ");
			Stack stack = new Stack(strs.length);
			for (String s : strs) {
				stack.push(Integer.parseInt(s));
			}
			int n = 1;
			while (!stack.isEmpty()) {
				long number = stack.pop();
				if (n++ % 2 != 0) {
					System.out.print(number);
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}

class Stack {
	public Stack(int size) {
		this.size = size;
		array = new long[size];
		top = -1;
	}

	private int size;
	private long[] array;
	private int top;

	public void push(long number) {
		array[++top] = number;
	}

	public long pop() {
		return array[top--];
	}

	public long peek() {
		return array[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

}