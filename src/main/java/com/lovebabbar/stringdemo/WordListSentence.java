package com.lovebabbar.stringdemo;

class WordSentence
{
	public void dfsTraversal(String a[][], boolean[][] visited, int i, int j, String pathSoFar,int prevIth,int prevJth) {
		if (i < 0 || j < 0 || i >= a.length || j >= a.length || a[i][j].isEmpty() || visited[i][j] == true) {
			return;
		}

		String tempPath = pathSoFar +" "+ a[i][j];
		if(i==a.length-1)
		{
			System.out.println(tempPath.trim());
		}

		visited[i][j] = true;
		
		prevIth=i;
		prevJth=j;

		int row = i + 1;
		int col = j;
		dfsTraversal(a, visited, row, col, tempPath, prevIth, prevJth);

		String str = pathSoFar;
		
		row=i;
		col=j-1;

		dfsTraversal(a, visited, row, col, pathSoFar, prevIth, prevJth);

		row = i;
		col = j + 1;
		dfsTraversal(a, visited, row, col, str, prevIth, prevJth);
		
		visited[i][j]=false;

//		System.out.println(a[row][col]);
	}
}

public class WordListSentence {
	public static void main(String[] args) {
		String a[][] = { { "you", "we",""}, { "have", "are","" }, { "sleep", "eat", "drink" } };
		
		boolean b[][]= new boolean[3][3];
		
		WordSentence wd = new WordSentence();
		wd.dfsTraversal(a, b, 0, 0, "" ,0,0);
		
		
		
	}
}
