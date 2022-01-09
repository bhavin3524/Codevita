package com.lovebabbar.graph;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class Topological
{
	HashMap<Integer, TreeSet<Integer>> graphMap=new HashMap<>();
	
	
	
	public Topological(int vertices) {
		graphMap = new HashMap<>(vertices);
	}

	public void addEdge(int src, int dst) {
		if (!graphMap.containsKey(src)) {
			TreeSet<Integer> treeSet = new TreeSet<>();
			treeSet.add(dst);
			graphMap.put(src, treeSet);
		} else {
			TreeSet<Integer> treeSet = graphMap.get(src);
			treeSet.add(dst);
			graphMap.put(src, treeSet);
		}
	}
	
	public void printGraph() {
		graphMap.forEach((node, neighbors) -> {
			System.out.println(node + "--->" + neighbors);
		});
	}
	
	HashMap<Integer, Integer> inDegree=new HashMap<>();
	
	public void topologicalSort() {
		graphMap.forEach((node, neighbors) -> {
			inDegree.put(node, 0);
			graphMap.forEach((key, value) -> {
				if (value.contains(node)) {
					Integer count = inDegree.get(node);
					count++;
					inDegree.put(node, count);
				}
			});
		});
		
		
		inDegree.forEach((node, countInDegree) -> {
			System.out.println(node + "--" + countInDegree);
		});
		
		
		inDegree.forEach((node, inDegree) -> {
			if (inDegree == 0) {
				System.out.println(node);
				TreeSet<Integer> treeSet = graphMap.get(node);
				treeSet.forEach(element -> {
					changeInDegreeValue(element);
				});
				graphMap.remove(node);
			}
		});
		
	}
	
	public void changeInDegreeValue(int element)
	{
		Integer countValue = inDegree.get(element);
		countValue--;
		inDegree.put(element, countValue);
	}
	
	
//	public void topologicalSortUtil(int v, HashMap<Integer, Boolean> visitedMap, Stack<Integer> stack) {
//		visitedMap.put(v, true);
//		
//		
//	}
//	
//	public void topologicalSort(int vertices) {
//		Stack<Integer> stack = new Stack<>();
//		
//		HashMap<Integer, Boolean> visitedMap = new HashMap<>();
//		
//		for(int i=0;i<vertices;i++) {
//			if(!visitedMap.containsKey(i) || false==visitedMap.get(i)) {
//				
//			}
//		}
//	}
	
}
public class TopologicalSort {

	public static void main(String[] args) {
		System.out.println("Add number of vertices and edges");
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
		int edges = sc.nextInt();

		Topological topological = new Topological(vertices);
		
		System.out.println("Enter "+edges + " edges");
		for (int i = 0; i < edges; i++) {
			topological.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		topological.printGraph();

		topological.topologicalSort();
		
	}
}
