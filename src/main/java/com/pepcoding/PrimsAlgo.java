package com.pepcoding;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

class	MinimumSpanningTree
{
	HashMap<Integer, TreeMap<Integer,Integer>> graphMap;
	HashMap<Integer, Boolean> treeMap;
	
	
	public MinimumSpanningTree(int v) {
		graphMap = new HashMap<>(v);
		treeMap = new HashMap<>(v);
	}

	
	public void addEdge(int source, int destination, int weight) {
		
		
		if (!graphMap.containsKey(source)) {
			TreeMap<Integer, Integer> destinationWithWeights = new TreeMap<>();
			destinationWithWeights.put(destination, weight);
			graphMap.put(source, destinationWithWeights);
		} else {
			TreeMap<Integer, Integer> destWithWeights = graphMap.get(source);
			destWithWeights.put(destination, weight);
			graphMap.put(source, destWithWeights);
		}
	}
	
	public void primsAlgo() {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		
		
	}
	
	public void printGraph() {
		graphMap.forEach((neighbor, destWithWeights) -> {
			destWithWeights.forEach((dest, weight) -> {
				System.out.println(neighbor + "-->" + dest + "   weight:" + weight);
			});
		});
	}
	
	
}
public class PrimsAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of vertices and edges respectively");
		int v = sc.nextInt();
		int e = sc.nextInt();
		MinimumSpanningTree mst = new MinimumSpanningTree(v);
		
		System.out.println("Enter " + e + " edges respectively");
		while (e-- > 0) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int weight = sc.nextInt();

			mst.addEdge(source, destination, weight);
			mst.addEdge(destination, source, weight);
		}
		
		mst.printGraph();
	}
}
