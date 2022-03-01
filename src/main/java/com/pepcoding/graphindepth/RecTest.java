package com.pepcoding.graphindepth;


class Example
{
	public void printOutput(int n)
	{
		if(n==0)
		{
			return;
		}
		
		System.out.println("Pre"+n);
		printOutput(n-1);
		System.out.println("In"+n);
		printOutput(n-1);
		System.out.println("Post"+n);
	}
}
public class RecTest {
	public static void main(String[] args) {
		Example e = new Example();
		e.printOutput(4);
		
		System.out.println("");
	}
}
