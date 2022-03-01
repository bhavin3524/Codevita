package com.prepcoding;

class Example
{
	public void puzz(int n) {
		if (n == 0) {
			return;
		}
		System.out.println("Pre:" + n);
		puzz(n - 1);
		System.out.println("In:" + n);
		puzz(n - 1);
		System.out.println("Post:" + n);
	}
}
public class RecursionTest {
	public static void main(String[] args) {
		Example example = new Example();
		example.puzz(3);

	}
}
