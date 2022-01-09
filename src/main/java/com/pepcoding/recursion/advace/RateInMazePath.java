package com.pepcoding.recursion.advace;

import java.util.ArrayList;
import java.util.Scanner;

class MazeRunner{
	public void findPathInMaze(int arr[][], int x,int y,ArrayList<String> pathList)
	{
		int n = arr.length;
//		System.out.println("length:"+n);
		
		if(x>n-1 || y > n-1 || arr[x][y]==0)
		{
			return;
		}
		else if (x==2 && y==2) {
			System.out.println(pathList);
			return;
		}
		
		pathList.add("D");
		findPathInMaze(arr, ++x, y, pathList);
		pathList.remove(pathList.lastIndexOf("D")); 
		
		pathList.add("R");
		findPathInMaze(arr, x, ++y, pathList);
		pathList.remove(pathList.lastIndexOf("R"));
	}
}
public class RateInMazePath {
	public static void main(String[] args) {
		
		System.out.println("Enter value of n for (nxn) matrix");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][]=new int[n][n];
		
		System.out.println("Fill elements in matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		MazeRunner mazeRunner = new MazeRunner();
		
		mazeRunner.findPathInMaze(arr, 0, 0, new ArrayList<String>());
		
		
		
	}
}
