package com.saurabhshukla.pattern.kunal.recursion.pattern;


class Stair
{
	public void printStair(int n,String stairPath)
	{
		if (n < 0) {
			return;
		}
		if (n == 0) {
			System.out.println(stairPath);
			return;
		}

		int k = n - 1;
		String currPath = " " + stairPath + " " + k;

		printStair(k, currPath);

		int l = n - 2;

		String currPath2 = " " + stairPath + " " + l;
		printStair(l, currPath2);

		int m = n - 3;
		String currPath3 = " " + stairPath + " " + m;
		printStair(m, currPath3);

	}
}
public class PrintStairPathUsingRecursion {
	public static void main(String[] args) {
			Stair stair = new Stair();
			stair.printStair(4, "");
	}
}
