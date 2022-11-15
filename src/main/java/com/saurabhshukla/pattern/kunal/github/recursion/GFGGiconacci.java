package com.saurabhshukla.pattern.kunal.github.recursion;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;

class Giconnaci
{
    public int giconnaciNumber(int A,int B,int C,int N)
	{
		if (N == 3) {
			return C;
		} else if (N == 2) {
			return B;
		} else if (N == 1) {
			return A;
		}

		int left = giconnaciNumber(A, B, C, N - 1);
		int mid = giconnaciNumber(A, B, C, N - 2);
		int right = giconnaciNumber(A, B, C, N - 3);
		int ans = left + mid + right;
		return ans;
	}
}

class GFGGiconacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Giconnaci g = new Giconnaci();
		while (t-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int N = sc.nextInt();
			System.out.println(g.giconnaciNumber(A, B, C, N));
		}
	}
}
