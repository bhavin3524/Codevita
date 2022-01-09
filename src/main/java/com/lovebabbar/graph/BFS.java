package com.lovebabbar.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class Graph
{
	public HashMap<Integer, TreeSet<Integer>> graphMap;  
	
	ArrayList<Boolean> visitedList;
	
	
	public Graph(int v) {
		graphMap = new HashMap<>(v);
		visitedList = new ArrayList<>(v);
		for(int i=0;i<=v;i++)
		{
			visitedList.add(false);
		}
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
	
	public void BFS(int source) {
		System.out.println("BFS:");
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(source);
		
		
		visitedList.set(source, true);
		
		while(!queue.isEmpty()) {
			Integer node = queue.poll();
			
			System.out.println(node+"    ");
			
			TreeSet<Integer> neighbors = graphMap.get(node);
			
			neighbors.forEach(neibor->{
				if(!visitedList.get(neibor)) {
					visitedList.set(neibor, true);
					queue.add(neibor);
				}
			});
		}
	}
	
	public void DFS(int source) {
		System.out.println("DFS:");
		Stack<Integer> stack=new Stack<>();
		
		stack.add(source);
		
		visitedList.set(source, true);
		
		while(!stack.isEmpty()) {
			Integer currentNode = stack.pop();
			
			System.out.println(currentNode + "    ");
			
			TreeSet<Integer> neighbors = graphMap.get(currentNode);
			
			neighbors.forEach((neighbor)->{
				
				if(!visitedList.get(neighbor)) {
					visitedList.set(neighbor, true);
					stack.push(neighbor);
				}
			});
			
		}
	}
	
	public void printGraph() {
		graphMap.forEach((vertex,neighbors)->{
			System.out.println(vertex+"--->"+neighbors);
		});
	}
}
public class BFS {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Number of vertices and edges");
		
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		Graph graph = new Graph(vertices);
		
		System.out.println("Enter " + edges + " edges");
		for(int i=0;i<edges;i++) {
			graph.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		graph.printGraph();
		
		graph.BFS(1);
		graph.DFS(1);
	}
}
