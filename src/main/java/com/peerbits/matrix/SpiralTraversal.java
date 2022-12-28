package com.peerbits.matrix;

//	For now i'm assuming n*n matrix
class SpiralMatrix {

	public void spiralTraverse(int[][] matrix, boolean temp[][], int r, int c, int i) {

		if (r > matrix.length - 1 || r < 0 || c > matrix.length - 1 || c < 0 || temp[r][c] == true) {
			return;
		}
		
		temp[r][c]=true;
		
		System.out.println(matrix[r][c]+" ");
		int col = c + 1;
		int row = r;
		spiralTraverse(matrix, temp, row, col, i);

		col = c;
		row = r + 1;
		spiralTraverse(matrix, temp, row, col, i);

		col = c - 1;
		row = r;
		spiralTraverse(matrix, temp, row, col, i);

		col = c;
		row = r - 1;
		spiralTraverse(matrix, temp, row, col, i);
	}

	public void printMatrix(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}

public class SpiralTraversal {

	public static void main(String[] args) {
		SpiralMatrix spiralMatrix = new SpiralMatrix();

		int a[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		spiralMatrix.printMatrix(a);

		boolean temp[][] = new boolean[a.length][a.length];

		spiralMatrix.spiralTraverse(a, temp, 0, 0, 0);

	}

}
