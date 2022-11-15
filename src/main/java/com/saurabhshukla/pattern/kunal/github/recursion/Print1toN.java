package com.kunal.github.recursion;

class Sequence
{
	public void print1ToN(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);

		print1ToN(n-1);

		System.out.println(n);
	}
}

public class Print1toN {
	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		sequence.print1ToN(5);
	}
}
