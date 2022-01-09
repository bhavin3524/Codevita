package com.anuj;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class DfsTest
{
	HashMap<Integer, Set<Integer>> grapMap = new HashMap<Integer, Set<Integer>>();
	HashMap<Integer, Boolean> hashMap=new HashMap<>();
	
	
	public void DFS(int source)
	{
		System.out.println(source);
		Set<Integer> set = grapMap.get(source);
		
		hashMap.put(source, true);
		set.forEach(neighbors -> {
			if (hashMap.containsKey(neighbors) == false || hashMap.get(neighbors) == false) {
				hashMap.put(neighbors, true);
				DFS(neighbors);
			}
		});
	}
	public void addEdge(int source, int destination) {
		if (!grapMap.containsKey(source)) {
			Set<Integer> treeSet = new TreeSet<>();
			treeSet.add(destination);
			grapMap.put(source, treeSet);
		} else {
			Set<Integer> set = grapMap.get(source);
			set.add(destination);
			grapMap.put(source, set);
		}
	}

	public void printGraph() {
		grapMap.forEach((node, neighbors) -> {
			System.out.println(node + "--->" + neighbors);
		});
	}

}

public class DFS {
	

	public static void main(String[] args) {
		
		System.out.println("Enter Number of vertices and edges");
		Scanner sc = new Scanner(System.in);
		
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		DfsTest dfsTest = new DfsTest();
		System.out.println("Enter "+ edges + " edges");

		for (int i = 0; i < edges; i++) {
			dfsTest.addEdge(sc.nextInt(), sc.nextInt());
		}
		
		dfsTest.printGraph();
		System.out.println("DFS:");
		dfsTest.DFS(2);
	}
}
