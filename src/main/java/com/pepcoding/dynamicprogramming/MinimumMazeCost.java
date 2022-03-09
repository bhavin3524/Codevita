package com.pepcoding.dynamicprogramming;

import java.util.Arrays;

class MazeCost
{
	public void minimumMazeCost(int a[][],boolean b[][],int i,int j)
	{
		if(i<0 || j <0)
		{
			return;
		}
		
		minimumMazeCost(a, b, i, j);
	}
}
public class MinimumMazeCost {
	public static void main(String[] args) {
		int[][] a = { 	{ 2, 8, 4, 1, 6, 4, 2 }, 
						{ 6, 0, 9, 5, 3, 8, 5 }, 
						{ 1, 4, 3, 4, 0, 6, 5 },
						{ 6, 4, 7, 2, 4, 6, 1 }, 
						{ 1, 0, 3, 7, 1, 2, 7 }, 
						{ 1, 5, 3, 2, 3, 0, 9 }, 
						{ 2, 2, 5, 1, 9, 8, 0 } 
					};
		boolean b[][] = new boolean[a.length][a.length];
					
					for(int i=0;i<b.length;i++)
					{
						Arrays.fill(b[i], false);
					}
					
					
		}
}
