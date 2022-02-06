package com.pepcoding.graphindepth;

class CountIsland
{
	public int countNumberOfIsland(int a[][], boolean b[][], int n, int m,int countPair) {
		if (n < 0 || m < 0 || n > a.length - 1 || m > a.length - 1 || a[n][m] == 1 || b[n][m]==true) {
			return 0;
		}

//		int count=0;
//		count=countPair+1;		
		
		b[n][m]=true;
		
		int row = n;
		int col = m + 1;
		countNumberOfIsland(a, b, row, col,countPair);

		
//		count=countPair+1;		
		row = n + 1;
		col = m;
		countNumberOfIsland(a, b, row, col,countPair);

		
//		count=countPair+1;
		row = n;
		col = m - 1;
		countNumberOfIsland(a, b, row, col,countPair);

		
//		count=countPair+1;
		row = n - 1;
		col = m;
		countNumberOfIsland(a, b, row, col,countPair);
		
		return 1;

	}
}

public class CountNumberOfIsland {
	public static void main(String[] args) {
		
		
		int a[][]= {
				{0,0,1,1,1,1,1,1},
				{0,0,1,1,0,0,1,1},
				{1,1,1,1,1,1,1,0},
				{1,1,0,0,0,1,1,0},
				{1,0,1,1,0,1,1,0},
				{1,0,1,1,0,1,1,0},
				{1,0,1,1,1,1,1,0},
				{1,1,1,1,1,1,1,0}
				};
		
		boolean b[][]=new boolean[8][8];
		
		CountIsland ci = new CountIsland();
		int countPair=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) 
			{
				if(b[i][j]==false)
				{
					int finalcount=ci.countNumberOfIsland(a, b, i, j, countPair);
					countPair=countPair+finalcount;
				}
			}
		}
		
		System.out.println(countPair);
		
		
		
		
	}
}
