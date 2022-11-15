package com.saurabhshukla.pattern.kunal.recursion;

public class DigitSum {
	public static void main(String[] args) {
		System.out.println(sum(1234));
		System.out.println(1234/10);
		System.out.println(1234%10);
	}
	
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		int ans=(n % 10) + sum(n / 10);
		return ans;
	}
}
