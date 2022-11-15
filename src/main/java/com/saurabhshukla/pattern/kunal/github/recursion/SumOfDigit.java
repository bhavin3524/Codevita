package com.saurabhshukla.pattern.kunal.github.recursion;

class Digit
{
	public int sumOfDigit(int n)
	{
		if(n==0)
		{
			return n;
		}
		int r=n%10;
		int ans=sumOfDigit(n/10);
		return r+ans;
	}
}
public class SumOfDigit {
	public static void main(String[] args) {
		Digit digit = new Digit();
		
		System.out.println(digit.sumOfDigit(5678));
		
	}
}
