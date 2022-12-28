package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class GraphImpl
{
	public void addEdge(int source,int destination,TreeMap<Integer, TreeSet<Integer>> graphMap)
	{
		if(!graphMap.containsKey(source))
		{
			TreeSet<Integer> neighbor = new TreeSet<>();
			neighbor.add(destination);
			graphMap.put(source, neighbor);
		}
		else {
			TreeSet<Integer> neighbors = graphMap.get(source);
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
	}
	
	public void printAllPathsFromSourceToDestination(TreeMap<Integer, TreeSet<Integer>> graphMap,
			HashMap<Integer, Boolean> isVisited, int source, int destination, String pathsofar,int previous) {
		
		if(source==destination)
		{
			pathsofar=pathsofar+source;
			System.out.println(pathsofar);
			return;
		}
		
		isVisited.put(source, true);
		
		TreeSet<Integer> neighbors = graphMap.get(source);
		
		String path=pathsofar+source;
		
		neighbors.forEach((neighbor) -> {

			if (isVisited.containsKey(neighbor) == false || isVisited.get(source) == false) {
				printAllPathsFromSourceToDestination(graphMap, isVisited, neighbor, destination, path, source);
			}
//			isVisited.put(source, false);

		});
		
		
		
	}
	
	public void printGraph(TreeMap<Integer, TreeSet<Integer>> graphMap)
	{
		graphMap.forEach((source,neighbors)->{
			System.out.println("source:"+source+"   neighbors:"+neighbors);
		});
	}
}
public class PrintAllPaths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter vertices and edges");
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		TreeMap<Integer, TreeSet<Integer>> graphMap = new TreeMap<>();
		
		GraphImpl graph = new GraphImpl();
		for(int i=0;i<edges;i++)
		{
			int source=sc.nextInt();
			int destination=sc.nextInt();
//			int weight = sc.nextInt();
			graph.addEdge(source, destination,  graphMap);
			graph.addEdge(destination, source, graphMap);
		}
		
		graph.printGraph(graphMap);
		
		int previous=Integer.MIN_VALUE;
		graph.printAllPathsFromSourceToDestination(graphMap,new HashMap<>(), 0, 6, "",previous);
//		System.out.println(graphMap);
//		graphMap.forEach((key,value)->{
//			System.out.println(key+"---"+value);
//		});
	}
}
