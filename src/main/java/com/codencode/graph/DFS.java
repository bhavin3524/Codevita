package com.codencode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Graph
{
	
	
	HashMap<Integer, LinkedList<Integer>> graph;
	
	ArrayList<Boolean> visitedList;
	
	
	public Graph(int v) {
		super();
		// TODO Auto-generated constructor stub
		graph=new HashMap<>(v);
		visitedList=new ArrayList<>(v+1);
		for(int i=0;i<v+1;i++)
		{
			visitedList.add(false);
		}
	}
	public void DFS(int source,int destination,List<Integer> currentPath)
	{
		
		visitedList.set(source, true);
		System.out.println(source);
		
		if(source==destination)
		{
			System.out.println(currentPath);
			return ;
		}
		LinkedList<Integer> neighborList = graph.get(source);
		
		neighborList.forEach(neighbor->{
			if(!visitedList.get(neighbor)) {
				currentPath.add(neighbor);
				DFS(neighbor, destination,currentPath);
				currentPath.remove(neighbor);
			}
		});
	}
	

	public void addEdge(int source,int destination) {
		
		if(!graph.containsKey(source))
		{
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(destination);
			graph.put(source, linkedList);
		}
		else {
			LinkedList<Integer> linkedList = graph.get(source);
			linkedList.add(destination);
			graph.put(source, linkedList);
		}
	}
	
	public void printGraph()
	{
		graph.forEach((source,destination)->{
			System.out.println(source+"--->"+destination);
		});
	}
	
}
public class DFS {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices and edges");
		int vertexes = sc.nextInt();
		int edges = sc.nextInt();
		
		System.out.println("Enter "+edges+" edges");
		Graph g = new Graph(vertexes);
		for(int i=0;i<edges;i++)
		{
			g.addEdge(sc.nextInt(), sc.nextInt());
		}
		g.printGraph();
		System.out.println("Enter source and destination for DFS:");
		g.DFS(sc.nextInt(), sc.nextInt(),new ArrayList<>());
	}
}
