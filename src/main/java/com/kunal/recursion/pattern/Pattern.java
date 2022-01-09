package com.kunal.recursion.pattern;


public class Pattern {
	
	public static void printPattern(int i) {
		if (i == 5) {
			return;
		}

		printPattern(++i);
		for (int j = 0; j < i; j++) {
			System.out.print("*  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		printPattern(0);
	}
	
}
