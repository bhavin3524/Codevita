package com.saurabhshukla.pattern.kunal.recursion;

public class NumbersExample {
	public static void main(String[] args) {
//		write a function to print first five numbers
		int returnFromOne = print1(1);
		System.out.println("FromOne"+returnFromOne);
	}
	
	public static int print1(int n) {
		System.out.println(n);
		int returnFromTwo = print2(n+1);
		
		return returnFromTwo;
	}
	
	public static int print2(int n) {
		System.out.println(n);
		int returnFromThree = print3(n+1);
		return returnFromThree;
	}
	
	public static int print3(int n) {
		System.out.println(n);
		int returnFromFour = print4(n+1);
		return returnFromFour;
	}
	
	public static int print4(int n) { 
		System.out.println(n);
		int returnFrom5=print5(n+1);	
		return returnFrom5;
	}
	
	public static int print5(int n) {
		if(n==5) {
			return 5;
		}
		return 5;
	}
}
