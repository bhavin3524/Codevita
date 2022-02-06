package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class Hamilton
{
	public void addEdge(int source,int destination,HashMap<Integer, TreeSet<Integer>> graphMap) {
		if(graphMap.containsKey(source)==false) {
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
	
	public void findHamiltonPathAndCycle(HashMap<Integer, TreeSet<Integer>> graphMap,HashMap<Integer, Boolean> visitedMap,int source)
	{
		
		visitedMap.put(source, true);
		
		TreeSet<Integer> neighbors = graphMap.get(source);
		
		
		neighbors.forEach((node)->{
			if(visitedMap.get(node)==false) {
				findHamiltonPathAndCycle(graphMap, visitedMap, node);
			}
			
		});
	}
	
	
}
public class HamiltonPath {
	public static void main(String[] args) {
		System.out.println("Enter vertices and edges");
		
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		HashMap<Integer, TreeSet<Integer>> graphMap = new HashMap<>();
		HashMap<Integer, Boolean> visitedMap = new HashMap<>();
		Hamilton h = new Hamilton();
		
		while (edges-- > 0) {
			int source = sc.nextInt();
			int destination = sc.nextInt();

			h.addEdge(source, destination, graphMap);
			h.addEdge(destination, source, graphMap);
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		
		
	}
}
