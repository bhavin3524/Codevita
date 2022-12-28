package com.saurabhshukla.pattern.kunal.recursion;

public class Nto1 {

	public static void fun(int n) {
		if (n == 0) {
			return;
		}
		fun(n - 1);
		System.out.println(n);
	}
	
	public static int Factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * Factorial(n - 1);
	}
	
	public static int sumOfN(int n) {
		if (n == 1) {
			return n;
		}
		return n + sumOfN(n - 1);
	}

	public static void main(String[] args) {
		fun(6);
		System.out.println("Factorial of 6:"+Factorial(6));
		System.out.println("Sum Of 6:"+sumOfN(6));
	}
	
}
