package com.pepcoding.recursion.advace;

import java.util.ArrayList;
import java.util.Scanner;

class Maze{
	
	public void printAllPathsInMaze(int sourceXIdx,int sourceYIdx,int destinationXIdx,int destinationYIdx,ArrayList<String> pathList)
	{
		if ((sourceXIdx > destinationXIdx) || (sourceYIdx > destinationYIdx)) {
			return;
		}

		if ((sourceXIdx == destinationXIdx) && (sourceYIdx == destinationYIdx)) {
			System.out.println(pathList);
			return;
		}

		pathList.add("V");
//		sourceXIdx++;
		printAllPathsInMaze(++sourceXIdx, sourceYIdx, destinationXIdx, destinationYIdx, pathList);
		sourceXIdx--;
		pathList.remove(pathList.size() - 1);

		pathList.add("H");
//		sourceYIdx++;
		printAllPathsInMaze(sourceXIdx, ++sourceYIdx, destinationXIdx, destinationYIdx, pathList);
		sourceYIdx--;
		pathList.remove(pathList.size() - 1);
	}
}

public class RateInMaze {
	public static void main(String[] args) {
		int mazeMatrix[][];

		System.out.println("Enter value of n for (n x n) maze");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		mazeMatrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mazeMatrix[i][j] = 0;
			}
		}
		
		Maze maze = new Maze();
//		maze.printAllPathsInMaze(mazeMatrix, mazeMatrix, null);
		maze.printAllPathsInMaze(0, 0, 2, 2, new ArrayList<String>());
	}
}
