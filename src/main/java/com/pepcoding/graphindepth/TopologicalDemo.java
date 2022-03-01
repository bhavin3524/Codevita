package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class Topological
{
	public void addEdge(int source,int destination,HashMap<Integer, TreeSet<Integer>> graphMap)
	{
		if(!graphMap.containsKey(source)) {
			TreeSet<Integer> neighbors = new TreeSet<>();
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
		else {
			TreeSet<Integer> neighbors = graphMap.get(source);
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
	}
	
}
public class TopologicalDemo {
	public static void main(String[] args) {
		System.out.println("Enter no.of vertices and edges");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Topological t = new Topological();
		
		HashMap<Integer, TreeSet<Integer>> graphMap = new HashMap<>();
		TreeMap<Integer, Boolean> visitedMap = new TreeMap<>();
		while(e-- >0) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			t.addEdge(source, destination, graphMap);
			t.addEdge(destination, source, graphMap);
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		
		
	}
}
