package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class HashPath
{
	public void addEdge(int source,int destination,HashMap<Integer, TreeSet<Integer>> graphMap)
	{
		if(!graphMap.containsKey(source)) {
			TreeSet<Integer> treeSet = new TreeSet<>();
			treeSet.add(destination);
			graphMap.put(source, treeSet);
		}
		else {
			TreeSet<Integer> treeSet = graphMap.get(source);
			treeSet.add(destination);
			graphMap.put(source, treeSet);
		}
	}

	public void checkPathIsExistUsingDFS(int source, int destination, HashMap<Integer, TreeSet<Integer>> graphMap,
			HashMap<Integer, Boolean> visitedMap,String pathsoFar) {
		
		if(source==destination)
		{
			System.out.println("path is exists---"+pathsoFar+destination);
			return;
		}
		
		visitedMap.put(source, true);
		
		String stillPath=pathsoFar+source;
		
		TreeSet<Integer> neighbors = graphMap.get(source);
		
		neighbors.forEach((node)->{
			if(visitedMap.get(node)==false)
			{
				checkPathIsExistUsingDFS(node, destination, graphMap, visitedMap,stillPath);
				visitedMap.put(node, false);
			}
		});
	}
}
public class GraphHashPath {
	public static void main(String[] args) {
		System.out.println("Enter vertices and edges");
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		HashPath hashPath = new HashPath();
		
		HashMap<Integer, TreeSet<Integer>> graphMap = new HashMap<>();
		HashMap<Integer, Boolean> visitedMap = new HashMap<>();
		
		for (int i = 0; i < edges; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			hashPath.addEdge(source, destination, graphMap);
			hashPath.addEdge(destination, source, graphMap);
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		
		
//		System.out.println(graphMap);
		graphMap.forEach((node, neighbors) -> {
			System.out.println(node + "---" + neighbors);
		});
		
		hashPath.checkPathIsExistUsingDFS(0, 6, graphMap, visitedMap,"");
	}
}
