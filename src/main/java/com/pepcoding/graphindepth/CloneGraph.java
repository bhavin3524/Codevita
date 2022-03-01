package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


class CloneGraphTest
{
	
	public HashMap<Integer, TreeSet<Integer>> cloneGraph(HashMap<Integer, TreeSet<Integer>> graphMap,
			HashMap<Integer, Boolean> visitedMap, HashMap<Integer, TreeSet<Integer>> clonedGraph, int source) {

		visitedMap.put(source, true);
		TreeSet<Integer> neighbors = graphMap.get(source);
		clonedGraph.put(source, neighbors);
		
		
		
		for(Integer node:neighbors) {
			if (visitedMap.get(node) == false) {
				visitedMap.put(node, true);
				clonedGraph = cloneGraph(graphMap, visitedMap,clonedGraph, node);
			}
		}

//		neighbors.forEach((node) -> {
//			if (visitedMap.get(node) == false) {
//				visitedMap.put(node, true);
//				clonedGraph = cloneGraph(graphMap, visitedMap,clonedGraph, node);
//			}
//		});

		return clonedGraph;
		
	}
	
	public void addEdge(int source,int destination,HashMap<Integer, TreeSet<Integer>> graphMap)
	{
		if(graphMap.containsKey(source)==false)
		{
			TreeSet<Integer> neighbors = new TreeSet<Integer>();
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
		else
		{
			TreeSet<Integer> neighbors = graphMap.get(source);
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
		
	}
	
	public void printGraph(HashMap<Integer, TreeSet<Integer>> graphMap)
	{
		graphMap.forEach((source,neighbors)->{
			System.out.println(source+"---"+neighbors);
		});
	}
}
public class CloneGraph {
	public static void main(String[] args) {
		System.out.println("Enter Vertices and Edges");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		
		CloneGraphTest cloneGraph= new CloneGraphTest();
		HashMap<Integer, TreeSet<Integer>> graphMap = new HashMap<Integer, TreeSet<Integer>>();
		HashMap<Integer, Boolean> visitedMap = new HashMap<Integer, Boolean>();
		while(e-- > 0)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			cloneGraph.addEdge(source, destination, graphMap);
			cloneGraph.addEdge(destination, source, graphMap);
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		HashMap<Integer, TreeSet<Integer>> clonedGraph = new HashMap<Integer, TreeSet<Integer>>();
		HashMap<Integer, TreeSet<Integer>> finalGraph = cloneGraph.cloneGraph(graphMap, visitedMap,clonedGraph, 0);
		
		System.out.println("original graph");
		cloneGraph.printGraph(graphMap);
		
		System.out.println("deep copy graph");
		cloneGraph.printGraph(finalGraph);
		
		
		
	}
}
