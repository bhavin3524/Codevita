package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.xml.transform.Source;

class MultiSolverGraphImpl
{
	public void addEdge(int source,int destination,int weight,HashMap<Integer, TreeMap<Integer,Integer>> graphMap,HashMap<Integer, Boolean> visitedMap)
	{
		if(!graphMap.containsKey(source)) {
			TreeMap<Integer, Integer> treeMap = new TreeMap<>();
			treeMap.put(destination, weight);
			graphMap.put(source, treeMap);
		}
		else {
			TreeMap<Integer, Integer> treeMap = graphMap.get(source);
			treeMap.put(destination, weight);
			graphMap.put(source, treeMap);
		}
	}
	
	public void printGraph(HashMap<Integer, TreeMap<Integer,Integer>> graphMap) {
		graphMap.forEach((source,destinationNode)->{
			System.out.println(source+"--"+destinationNode);
//			destinationNode.forEach((destination,weight)->{q
//				System.out.println(source+"---"+destination+"---"+weight);
//			});
		});
	}
	
	
	private static String minimumPath="";
	private static String maximumPath="";
	private static int maximumDistance=Integer.MIN_VALUE;
	private static int minimumDistance=Integer.MAX_VALUE;
	
	public void printSmallestAndLargestPath(int source, int destination, HashMap<Integer, TreeMap<Integer,Integer>> graphMap,
			HashMap<Integer, Boolean> visitedMap, String pathSoFar, int distance) {
		if(source==destination) {
			
			System.out.println(pathSoFar+destination);
			
			if(distance>maximumDistance)
			{
				maximumPath=pathSoFar+distance;
				maximumDistance=distance;
			}
			
			if(distance<minimumDistance) {
				minimumPath=pathSoFar+distance;
				minimumDistance=distance;
			}
//			copyq --start-server show
			return;
		}
		
		visitedMap.put(source, true);
		
		String str=pathSoFar+source;
		
		TreeMap<Integer, Integer> neighbors = graphMap.get(source);
		
		neighbors.forEach((dst,wt)->{
			if(visitedMap.get(dst)==false)
			{
				int currentDistance=distance+wt;
				printSmallestAndLargestPath(dst, destination, graphMap, visitedMap, str, currentDistance);
			}
			visitedMap.put(source, false);
		});
		
		
		
	}

	public static String getMinimumPath() {
		return minimumPath;
	}

	public static void setMinimumPath(String minimumPath) {
		MultiSolverGraphImpl.minimumPath = minimumPath;
	}

	public static String getMaximumPath() {
		return maximumPath;
	}

	public static void setMaximumPath(String maximumPath) {
		MultiSolverGraphImpl.maximumPath = maximumPath;
	}

	public static int getMaximumDistance() {
		return maximumDistance;
	}

	public static void setMaximumDistance(int maximumDistance) {
		MultiSolverGraphImpl.maximumDistance = maximumDistance;
	}

	public static int getMinimumDistance() {
		return minimumDistance;
	}

	public static void setMinimumDistance(int minimumDistance) {
		MultiSolverGraphImpl.minimumDistance = minimumDistance;
	}	
}

public class MultiSolverGraph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vertices and edges:");
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		MultiSolverGraphImpl mg = new MultiSolverGraphImpl();
		
		HashMap<Integer, TreeMap<Integer,Integer>> graphMap = new HashMap<>();
		System.out.println("Enter source:,destination: and weight: respectively");
		HashMap<Integer, Boolean> visitedMap = new HashMap<>();
		for(int i=0;i<edges;i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int weight = sc.nextInt();
			
			mg.addEdge(source, destination, weight, graphMap, visitedMap);
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
//		mg.printGraph(graphMap);
		mg.printSmallestAndLargestPath(0, 6, graphMap, visitedMap, "", 0);
		
		System.out.println("minimum path is :"+mg.getMinimumPath() +  " @ "+mg.getMinimumDistance());
		System.out.println("maximum path is :"+mg.getMaximumPath() + " @ "+mg.getMaximumDistance());
		
	}
}
