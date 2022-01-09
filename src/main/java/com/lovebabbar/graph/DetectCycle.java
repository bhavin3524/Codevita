package com.lovebabbar.graph;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class GraphImpl{
	HashMap<Integer, TreeSet<Integer>> graphMap;
	HashMap<Integer, Boolean> visitedMap;

	public GraphImpl(int v) {
		graphMap=new HashMap<>(v);
		visitedMap = new HashMap<>();
	}
	
	public void addEdge(int source,int destination) {
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
	
	public void detectCycle(int source)
	{
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		visitedMap.put(source, true);
		
		while(!stack.isEmpty()) {
			Integer currentNode = stack.pop();
			
			TreeSet<Integer> neighbors = graphMap.get(currentNode);
			
			neighbors.forEach(neighbor->{
				if (!visitedMap.containsKey(neighbor) || visitedMap.get(neighbor) == false) {
					stack.push(neighbor);
					visitedMap.put(neighbor, true);
				}
				else {
					 
				}
			});
			
			
			
		}
	}
	
	public void printGraph() {
		graphMap.forEach((node,neighbors)->{
			System.out.println(node+"----"+neighbors);
		});
	}
	
}
public class DetectCycle {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();
		
		GraphImpl graph = new GraphImpl(vertices);
		
		for(int i=0;i<edges;i++) {
			graph.addEdge(scanner.nextInt(), scanner.nextInt());
		}
		
		graph.printGraph();
		
	}

}
