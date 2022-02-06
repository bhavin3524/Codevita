package com.pepcoding.graphindepth;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class DetectCycleInDirectedGraph
{
	
	
	public void addEdge(int source,int destination,TreeMap<Integer, TreeSet<Integer>> graphMap) {
		if(graphMap.containsKey(source)==false)
		{
			TreeSet<Integer> vertex = new TreeSet<Integer>();
			vertex.add(destination);
			graphMap.put(source, vertex);
		}
		else
		{
			TreeSet<Integer> neighbors = graphMap.get(source);
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
	}
	
	public void detectCycleUsingDFS(int source,TreeMap<Integer, TreeSet<Integer>> graphMap,TreeMap<Integer, Boolean> visitedMap,String path)
	{		
		
		
		visitedMap.put(source, true);
		
		String currPath=path+source;
		
		TreeSet<Integer> neighbors = graphMap.get(source);
		
		neighbors.forEach((node)->{
			if(visitedMap.get(node)==false)
			{
				detectCycleUsingDFS(node, graphMap, visitedMap, currPath);
			}
			if(visitedMap.get(node)==true)
			{
				System.out.println(currPath+node);
			}
		});
	}
}
public class DetectCycleInDirected {
	public static void main(String[] args) {
		System.out.println("Enter no.of vertices and edges:");
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		
		
		
		DetectCycleInDirectedGraph dGraph=new DetectCycleInDirectedGraph();
		
		TreeMap<Integer, TreeSet<Integer>> graphMap = new TreeMap<Integer, TreeSet<Integer>>();
		TreeMap<Integer, Boolean> visitedMap = new TreeMap<Integer, Boolean>();
		
		
		while(edges -- >0)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			dGraph.addEdge(source, destination, graphMap);
			
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		dGraph.detectCycleUsingDFS(0, graphMap, visitedMap,"");
	}
}
