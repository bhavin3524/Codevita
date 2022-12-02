package com.peerbits.binarytrees.heightofbinarytree;


class ZigZagTest {
	public void printZigZagPattern(int n) {
		if (n <= 0) {
			return;
		}
		System.out.println("pre:" + n);
		printZigZagPattern(n - 1);
		System.out.println("In:" + n);
		printZigZagPattern(n - 1);
		System.out.println("Post:" + n);
	}
}

public class ZigZag {
	public static void main(String[] args) {
		ZigZagTest zigZagTest = new ZigZagTest();
		zigZagTest.printZigZagPattern(3);
	}
}
