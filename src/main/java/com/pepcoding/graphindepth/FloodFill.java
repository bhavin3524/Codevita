package com.pepcoding.graphindepth;


class FloodFillTest
{
	private static final int y=5;
	private static final int z=6;
	
	public void floodFillGraph(int a[][],boolean  b[][],String path,int n,int m)
	{
		if(n<0  || m<0 || n>=a.length || m>=a[0].length || a[n][m]==1 || b[n][m]==true)
		{
			return;
		}
		
		if(n==y && m==z)
		{
			System.out.println(path);
		}
			
//		System.out.println(path+"---->"+n + m);
		
		b[n][m]=true;
		
		String currPath=path+"R";
		int row=n;
		int col=m+1;
		floodFillGraph(a, b, currPath, row, col);
		
		
		currPath=path+"D";
		row=n+1;
		col=m;
		floodFillGraph(a, b, currPath, row, col);

		
		currPath=path+"L";
		row=n;
		col=m-1;
		floodFillGraph(a, b, currPath, row, col);

		
		currPath=path+"U";
		row=n-1;
		col=m;
		floodFillGraph(a, b, currPath, row, col);
		
		b[n][m]=false;

		
	}
}
public class FloodFill {
	public static void main(String[] args) {
		FloodFillTest fTest = new FloodFillTest();
		int a[][]= {
				{0,1,0,0,0,0,0},
				{0,1,0,1,1,1,0},
				{0,0,0,0,0,0,0},
				{1,0,1,1,0,1,1},
				{1,0,1,1,0,1,1},
				{1,0,0,0,0,0,0},
				};
		System.out.println("Running");
		boolean b[][]=new boolean[6][7];
//		fTest.floodFillGraph();
		fTest.floodFillGraph(a, b, "", 0, 0);
		
		
		
		
	}
}
