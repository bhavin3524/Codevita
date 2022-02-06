package com.pepcoding.graphindepth;

class PrintPathMaze
{
	private boolean tempMaze[][];
	
	
	
	public PrintPathMaze() {
		tempMaze=new boolean[4][4];
	}



	public void printPathInMaze(int [][]maze,int n,int m,String path,int y,int z)
	{
		if (n < 0 || m < 0 || n > maze.length - 1 || m > maze.length - 1 || n > maze.length - 1 || maze[n][m] == 0
				|| tempMaze[n][m] == true) {
			return;
		}
		if(n==y && m==z)
		{
			System.out.println(path);
		}
		
		tempMaze[n][m]=true;
		
		int col=m+1;
		int row=n;
		String currPath=path+"R";
		printPathInMaze(maze, row, col, currPath, y, z);
//		tempMaze[n][m]=false;
		
		col=m;
		row=n+1;
		currPath=path+"D";
		printPathInMaze(maze, row, col, currPath, y, z);
//		tempMaze[n][m]=false;
		
		col=m-1;
		row=n;
		currPath=path+"L";
		printPathInMaze(maze, row, col, currPath, y, z);
//		tempMaze[n][m]=false;
		
		col=m;
		row=n-1;
		currPath=path+"U";
		printPathInMaze(maze, row, col, currPath, y, z);
		tempMaze[n][m]=false;
	}
	
	
}


public class RatInMaze {
	public static void main(String[] args) {
		int maze[][]=
			       { {1, 0, 0, 0},
			         {1, 1, 0, 1}, 
			         {1, 1, 0, 0},
			         {0, 1, 1, 1} };
		
		PrintPathMaze p = new PrintPathMaze();
		p.printPathInMaze(maze, 0, 0, "", 3, 3);
		
	}
}
