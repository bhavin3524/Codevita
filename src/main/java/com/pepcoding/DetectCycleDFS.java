package com.pepcoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class DetectCycleUsingDFS {
	HashMap<Integer, TreeSet<Integer>> graphHashMap;
	private HashMap<Integer, Boolean> trueMap;
	
	public DetectCycleUsingDFS(int v) {
		graphHashMap = new HashMap<>(v);
		trueMap = new HashMap<Integer,Boolean>();
	}
	
	public void printCycleUsingDFS(int source,int parent,ArrayList<Integer> pathCycleList) {
		trueMap.put(source, true);
		pathCycleList.add(source);
		
		TreeSet<Integer> neighborsSet = graphHashMap.get(source);
		
		
		neighborsSet.forEach((neighbor) -> {
			if (trueMap.containsKey(neighbor) == false || trueMap.get(neighbor) == false) {
				printCycleUsingDFS(neighbor, source, pathCycleList);
				pathCycleList.remove(pathCycleList.size()-1);
			} else if(neighbor!=parent && trueMap.get(neighbor)) {
				pathCycleList.add(neighbor);
				if(pathCycleList.contains(neighbor)) {
					int indexOfFirstOccurence = pathCycleList.indexOf(neighbor);
					System.out.println("path"+pathCycleList.subList(indexOfFirstOccurence,pathCycleList.size()));
				}
				pathCycleList.remove(pathCycleList.size()-1);
			}
		});
		
		trueMap.put(source, false);

	}
	
	public void addEdge(int source,int destination) {
		if(!graphHashMap.containsKey(source)) {
			TreeSet<Integer> neighborsSet= new TreeSet<>();
			neighborsSet.add(destination);
			graphHashMap.put(source, neighborsSet);
		}
		else {
			TreeSet<Integer> neighborSet = graphHashMap.get(source);
			neighborSet.add(destination);
			graphHashMap.put(source, neighborSet);
		}
	}
	
	public void printGraph() {
		graphHashMap.forEach((source,neighborsSet)->{
			System.out.println(source+"--->"+neighborsSet);
		});
	}
}

public class DetectCycleDFS {
	public static void main(String[] args) {
		System.out.println("Enter vertices and edges");
		
		Scanner sc = new Scanner(System.in);
		
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		DetectCycleUsingDFS detectCycleUsingDFS = new DetectCycleUsingDFS(vertices);
		
		System.out.println("Enter "+edges+" edges");
		while (edges-- > 0) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			detectCycleUsingDFS.addEdge(source, destination);
			detectCycleUsingDFS.addEdge(destination, source);
		}
		
		detectCycleUsingDFS.printGraph();
		
		detectCycleUsingDFS.printCycleUsingDFS(0, -1,new ArrayList<>());
	}
}
