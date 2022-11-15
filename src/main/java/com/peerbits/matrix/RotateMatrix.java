package com.peerbits.matrix;

//	as of now i'm assuming n*n matrix
class Matrix
{
	int [][] rotateMatrix(int a[][])
	{
		boolean b[][]=new boolean[a.length][a.length];
		
		System.out.println("----------------------");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				if (b[i][j] == false) {
					int temp1 = a[i][j];
					int temp2 = a[j][a.length - i - 1];

					a[i][j] = temp2;

					a[j][a.length - i - 1] = temp1;

					b[i][j] = true;
					b[j][a.length - i - 1] = true;
				}
			}
		}
		return a;
	}
	
	public void printMatrix(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
public class RotateMatrix {
	public static void main(String[] args) {
		
		int mat[][]= {
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}
		};
		
		Matrix matrix = new Matrix();
		matrix.printMatrix(mat);
		
		int[][] result = matrix.rotateMatrix(mat);
		
		System.out.println("=================================");
		
		matrix.printMatrix(result);
		
		
	}
}
