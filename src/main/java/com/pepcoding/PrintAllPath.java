package com.pepcoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class Graph{
	HashMap<Integer, TreeSet<Integer>> graphMap;
	HashMap<Integer, Boolean> trueMap;

	public Graph(int v) {
		super();
		graphMap = new HashMap<>(v);
		trueMap=new HashMap<>();
	}
	
	
	public void printAllpaths(int source,int destination,ArrayList<Integer> path)
	{
		path.add(source);
		if(source==destination) {
			System.out.println(path);
			return;
		}
		trueMap.put(source, true);
		TreeSet<Integer> neighbors = graphMap.get(source);
		neighbors.forEach(node -> {
			if (trueMap.containsKey(node) == false || trueMap.get(node) == false) {
				printAllpaths(node, destination, path);
				path.remove(node);
			}
		});
		trueMap.put(source, false);
	}
	
	public void addEdge(int source,int destination)
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
	
	public void printGraph()
	{
		System.out.println("\n"+"--print graph--");
		graphMap.forEach((node,neighbors)->{
			System.out.println(node+"--->"+neighbors);
		});
	}
	
}
public class PrintAllPath {
	public static void main(String[] args) {
		System.out.println("Enter vertices and Edges");
		Scanner sc = new Scanner(System.in);
		
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		Graph graph = new Graph(vertices);
		
		System.out.println("Enter "+edges+" edges");
		
		for(int i=0;i<edges;i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
			graph.addEdge(destination, source);
		}
		
		graph.printGraph();
		System.out.println("All paths From source to destination:");
		
		System.out.println("Enter source:");
		int source = sc.nextInt();
		System.out.println("Enter destination:");
		int destination = sc.nextInt();
		graph.printAllpaths(source, destination, new ArrayList<>());
		
	}
}
