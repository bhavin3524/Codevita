package com.pepcoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class GraphTest
{
	HashMap<Integer, TreeMap<Integer, Integer>> graphMap;
	HashMap<Integer, Boolean> trueMap;

	public GraphTest(int v) {
		graphMap = new HashMap<>(v);
		trueMap = new HashMap<>();
	} 
	
	public ArrayList<Integer> sortestPathList=new ArrayList<Integer>();
	public int sortestPath = Integer.MAX_VALUE;
	public ArrayList<Integer> longestPathList =new ArrayList<Integer>();
	public int longestPath = Integer.MIN_VALUE;
	 
	
	public void multiPath(int source,int destination,ArrayList<Integer> path,int weight)
	{
		path.add(source);
		if(source==destination)
		{
			System.out.println(path);
			if(weight<sortestPath)
			{
				sortestPathList.clear();
				sortestPath=weight;
				sortestPathList.addAll(path);
			}
			if(weight>longestPath)
			{
				longestPathList.clear();
				longestPath=weight;
 				longestPathList.addAll(path);
			}
			return;
		}
		
		trueMap.put(source, true);
		TreeMap<Integer, Integer> neighbors = graphMap.get(source);
		
		neighbors.forEach((dst,wt)->{
			if(trueMap.containsKey(dst)==false || trueMap.get(dst)==false)
			{
				wt=wt+weight;
				multiPath(dst, destination, path, wt);
				path.remove(dst);
			}
		});
		trueMap.put(source, false);
	}

	public void addEdge(int source, int destination, int weight) {
		if (!graphMap.containsKey(source)) {
			TreeMap<Integer, Integer> treeMap = new TreeMap<>();
			treeMap.put(destination, weight);
			graphMap.put(source, treeMap);
		} else {
			TreeMap<Integer, Integer> treeMap = graphMap.get(source);
			treeMap.put(destination, weight);
			graphMap.put(source, treeMap);
		}
	}
	
	public void printGraph() {
		graphMap.forEach((nodes, neighbors) -> {
			System.out.println(nodes + "---->" + neighbors);
		});
	}
}
public class Multipath {
	public static void main(String[] args) {
		System.out.println("Enter vertices and edges:");
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		GraphTest graphTest = new GraphTest(v);

		System.out.println("Enter " + e + " edges with weights respectively:");

		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int weight = sc.nextInt();

			graphTest.addEdge(source, destination, weight);
			graphTest.addEdge(destination, source, weight);
		}
		
		graphTest.printGraph();
		
		graphTest.multiPath(0, 6, new ArrayList<>(), 0);
		
		System.out.println("Sortest path:");
		System.out.println(graphTest.sortestPathList+"--->"+graphTest.sortestPath);
		
		System.out.println("Longest path:");
		System.out.println(graphTest.longestPathList+"--->"+graphTest.longestPath);
		
		
		
	}
	
	
//	output
	
//	Enter vertices and edges:
//		7 8
//		Enter 8 edges with weights respectively:
//
//		0 1 10
//		0 3 20
//		1 2 40
//		2 3 30
//		3 4
//		50
//		4 5 80
//		4 6 60
//		5 6 70
//		0---->{1=10, 3=20}
//		1---->{0=10, 2=40}
//		2---->{1=40, 3=30}
//		3---->{0=20, 2=30, 4=50}
//		4---->{3=50, 5=80, 6=60}
//		5---->{4=80, 6=70}
//		6---->{4=60, 5=70}
//		[0, 1, 2, 3, 4, 5, 6]
//		[0, 1, 2, 3, 4, 6]
//		[0, 3, 4, 5, 6]
//		[0, 3, 4, 6]
//		Sortest path:
//		[0, 3, 4, 6]--->130
//		Longest path:
//		[0, 1, 2, 3, 4, 5, 6]--->280

	
}
