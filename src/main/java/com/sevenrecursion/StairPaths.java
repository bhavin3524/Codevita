package com.sevenrecursion;

import java.util.ArrayList;

class Stairs
{
	public ArrayList<String> printStairPaths(int n)
	{
		if (n == 0) {
			ArrayList<String> pathSoFar = new ArrayList<>();
			pathSoFar.add("");
			return pathSoFar;
		} else if (n < 0) {
			ArrayList<String> pathSoFar = new ArrayList<>();
			return pathSoFar;
		}
		
		return null;
	}
}
public class StairPaths {
	public static void main(String[] args) {
		
	}
}
