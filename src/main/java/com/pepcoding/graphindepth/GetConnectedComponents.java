package com.pepcoding.graphindepth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class GetConnectedImpl
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
	
	public ArrayList<Integer> getConnectedComponents(int source,HashMap<Integer, TreeSet<Integer>> graphMap,HashMap<Integer, Boolean> visitedMap) {
		visitedMap.put(source, true);
		
		ArrayList<Integer> componentList = new ArrayList<>();
		TreeSet<Integer> treeSet = graphMap.get(source);
		
		componentList.add(source);
		treeSet.forEach((node)->{
			if(visitedMap.get(node)==false)
			{
				 ArrayList<Integer> connectedComponents = getConnectedComponents(node, graphMap, visitedMap);
				 componentList.addAll(connectedComponents);
			}
		});
		return componentList;
	}
	
	public void printGraph(HashMap<Integer, TreeSet<Integer>> graphMap) {
		graphMap.forEach((source,destNode)->{
			System.out.println(source+"->>"+destNode);
		});
	}
}

public class GetConnectedComponents {
	public static void main(String[] args) {
//		GetConnectedComponents gc = new GetConnectedComponents();
		GetConnectedImpl gc=new GetConnectedImpl();
		
		System.out.println("Enter vertices and edges:");
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		HashMap<Integer, TreeSet<Integer>> graphMap = new HashMap<>();
		HashMap<Integer, Boolean> visitedMap = new HashMap<>();
		while(e-- > 0)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			gc.addEdge(source, destination,graphMap);
			gc.addEdge(destination, source, graphMap);
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		visitedMap.forEach((K,V)->{
			if(V==false)
			{
				System.out.println(gc.getConnectedComponents(K, graphMap, visitedMap));
			}
		});
		
		
	}
}


//				output
//Enter vertices and edges:
//12 11
//1 4
//1 2
//1 3
//2 3
//3 5
//3 6
//4 5
//7 8
//7 9
//10 11
//10 12

//component list
//[1, 2, 3, 5, 4, 6]
//[7, 8, 9]
//[10, 11, 12]

