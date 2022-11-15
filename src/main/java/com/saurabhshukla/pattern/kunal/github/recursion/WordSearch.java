package com.kunal.github.recursion;

import java.util.Scanner;

public class WordSearch {

	public void searchWord(String arr[][], int row, int col, String pathSoFar, boolean[][] visited, String str) {

		if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || visited[row][col] == true) {
//			System.out.println(pathSoFar+arr[row][col]);
			return;
		}

		if (row == arr.length && col == arr[0].length) {
			System.out.println(pathSoFar+arr[row][col]);
			return;
		}

		if (pathSoFar.equals(str)) {
			System.out.println("ans:--------------------------------------->"+pathSoFar);
		}

		visited[row][col] = true;
		pathSoFar = pathSoFar + arr[row][col];
		System.out.println(pathSoFar);
		searchWord(arr, row, col + 1, pathSoFar, visited, str);
		searchWord(arr, row + 1, col, pathSoFar, visited, str);
		searchWord(arr, row, col - 1, pathSoFar, visited, str);
		searchWord(arr, row - 1, col, pathSoFar, visited, str);
		visited[row][col] = false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WordSearch ws = new WordSearch();

		System.out.println("Enter value of n and m");
		int n = sc.nextInt();
		int m = sc.nextInt();

		String arr[][] = new String[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.next();
			}
		}

		System.out.println("------");
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		String str = "ABCG";

		boolean visitedArray[][] = new boolean[n][m];
		
//		Collections.fill(Arrays.asList(visitedArray), false);

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				ws.searchWord(arr, i, j, "", visitedArray, str);
//				for(int k=0;k<visitedArray.length;k++)
//				{
//					for(int l=0;l<visitedArray[0].length;l++) {
//						visitedArray[k][l]=false;
//					}
//				}
			}
			System.out.println();
		}

	}
}
