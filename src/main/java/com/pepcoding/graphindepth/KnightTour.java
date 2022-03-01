package com.pepcoding.graphindepth;


class Tour
{
	static final int y=5;
	static final int z=0;
	public void knightTour(int a[][],boolean b[][],int n,int m,int move,String path)
	{
		if(n<0 || m<0 || n>=a.length  || m>=a.length || b[n][m]==true) {
			return;
		}
		
		if(n==y && m==z)
		{
			System.out.println(path);
		}
		
		int row=n-2;
		int col=m+1;
		b[n][m]=true;
		String firstPath=path+"UUR ";
		knightTour(a, b, row, col, move, firstPath);
		
		row=n-1;
		col=m+2;
		String secondPath=path+"RRL ";
		knightTour(a, b, row, col, move, secondPath);

		row=n-1;
		col=m+2;
		String thirdPath=path+"RRR ";
		knightTour(a, b, row, col, move, thirdPath);

		row=n+1;
		col=m+2;
		String fourthPath=path+"DDL ";
		knightTour(a, b, row, col, move, fourthPath);

		row=n+2;
		col=m+1;
		String fifthPath=path+"DDR ";
		knightTour(a, b, row, col, move, fifthPath);

		row=n+2;
		col=m-1;
		String sixthPath=path+"LLL ";
		knightTour(a, b, row, col, move, sixthPath);

		row=n+1;
		col=m-2;
		String seventhPath=path+"LLR ";
		knightTour(a, b, row, col, move, seventhPath);

		row=n-2;
		col=m-1;
		String eighthPath=path+"UUL ";
		knightTour(a, b, row, col, move, eighthPath);

		
		
	}
}
public class KnightTour {
	public static void main(String[] args) {
		
		int a[][]= {{1},
				{2}};
	}
}
