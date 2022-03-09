package com.pepcoding.dynamicprogramming;


class Mine
{
	public void goldMine(int a[][])
	{
		
	}
}
public class GoldMine {
	public static void main(String[] args) {
		Mine mine = new Mine();
		int a[][] = { { 0, 1, 4, 2, 8, 2 }, 
					  { 4, 3, 6, 5, 0, 4 }, 
					  { 1, 2, 4, 1, 4, 6 }, 
					  { 2, 0, 7, 3, 2, 2 },
					  { 3, 1, 5, 9, 2, 4 }, 
					  { 2, 7, 0, 8, 5, 1 } 
					  
		};
		
		int b[][] = new int[a[0].length][a.length];

		for (int j = a.length - 1; j >= 0; j--) {
			for (int i = a.length - 1; i >= 0; i--) {
				if (j == a[0].length - 1) {
					b[i][j] = a[i][j];
				} else if (i == 0) {
					b[i][j] = a[i][j] + Math.max(b[i][j + 1], b[i + 1][j + 1]);
				} else if (i == a.length - 1) {
					b[i][j] = a[i][j] + Math.max(b[i][j + 1], b[i - 1][j + 1]);
				} else {
					b[i][j] = a[i][j] + Math.max(b[i][j + 1], Math.max(b[i + 1][j + 1], b[i - 1][j + 1]));
				}
			}
		}
		
		int max=b[0][0];
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i][0]>max)
			{
				max=b[i][0];
			}
		}

	}
}
