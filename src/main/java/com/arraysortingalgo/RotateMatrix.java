package com.arraysortingalgo;


class Rotate
{
	private static final int y=2;
	private static final int z=1;
	
	public void rotateMatrix(String a[][],boolean b[][],int n,int m)
	{
		
		if(n<0 || m<0 || n>=a.length || m>=a.length || b[n][m]==true) {
			return;
		}
		
		b[n][m]=true;

		System.out.print(a[n][m]+"  ");
		
		int row=n;
		int col=m+1;
		
		rotateMatrix(a, b, row, col);
		
		row=n+1;
		col=m;
		rotateMatrix(a, b, row, col);
		
		row=n;
		col=m-1;
		rotateMatrix(a, b, row, col);
		
		row=n-1;
		col=m;
		row = setRowAndColumn(row,col,b,a);
		rotateMatrix(a, b, row, col);
	}

	private int setRowAndColumn(int row, int col, boolean[][] b,String [][]a) {
		int r=0;
		while(row>0 && b[row][col]==false)
		{
			
				System.out.print(a[row][col]+"  ");
				r=row;
				row=row-1;
			
		}
		return r;
	}
}
public class RotateMatrix {
	public static void main(String[] args) {
		Rotate r = new Rotate();
		String a[][]= {
				{"a","b","c","d","u"},
				{"e","f","g","h","v"},
				{"i","j","k","l","w"},
				{"m","n","o","p","x"},
				{"q","r","s","t","y"}
		};
		boolean b[][]=new boolean[a.length][a.length];
		r.rotateMatrix(a, b, 0, 0);
	}
}
