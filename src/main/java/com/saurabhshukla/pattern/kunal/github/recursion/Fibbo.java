package com.saurabhshukla.pattern.kunal.github.recursion;


class FibboNumber
{
	public int printFibo(int n)
	{
		if (n <= 1) {
			return n;
		}
		int left = printFibo(n - 1);
		int right = printFibo(n - 2);
		
		int ans=left + right;
		
		System.out.print(ans + "	"	);
		return ans;
	}
}
public class Fibbo {
	public static void main(String[] args) {
		FibboNumber fibboNumber = new FibboNumber();
		
		System.out.println(fibboNumber.printFibo(7));
	}
}
