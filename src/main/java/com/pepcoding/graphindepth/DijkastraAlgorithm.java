package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

class Dijkastra
{
	public void addEdge(int source,int destination,int weight,HashMap<Integer, TreeMap<Integer,Integer>> graphMap,PriorityQueue<Pair> pQueue) {
		if(!graphMap.containsKey(source)) {
			TreeMap<Integer, Integer> neighbors = new TreeMap<Integer, Integer>();
			neighbors.put(destination,weight);
			graphMap.put(source, neighbors);
		}
		else {
			TreeMap<Integer, Integer> neighbors = graphMap.get(source);
			neighbors.put(destination, weight);
			graphMap.put(source, neighbors);
		}
	}
	
	public void printSortestPath(int source, int destination,int weight,HashMap<Integer, TreeMap<Integer, Integer>> graphMap,
			HashMap<Integer, Boolean> visitedMap, PriorityQueue<Pair> pQueue) {
		
		visitedMap.put(source, true);
		pQueue.add(new Pair(source,destination,weight,""));
		
		
		
		while(pQueue.size()>0)
		{
			Pair p = pQueue.poll();
			TreeMap<Integer, Integer> neighbors = graphMap.get(p.getSource());
			
			if(p.getSource()==destination)
			{
				System.out.println(p.getPathsoFar()+"--"+p.getWeight());
			}
			neighbors.forEach((neighborNode,wt)->{
				if(visitedMap.get(neighborNode)==false)
				{
					visitedMap.put(neighborNode, true);
					pQueue.add(new Pair(neighborNode, destination, p.getWeight()+wt, p.getPathsoFar()+neighborNode));
				}
			});
		}
	}
}

class Pair implements Comparable<Pair>
{
	int source;
	int destination;
	int weight;
	String pathsoFar;
	
	public Pair(int source, int destination, int weight, String pathsoFar) {
		super();
		this.source = source;
		this.destination = destination;
		this.weight = weight;
		this.pathsoFar = pathsoFar;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getPathsoFar() {
		return pathsoFar;
	}
	public void setPathsoFar(String pathsoFar) {
		this.pathsoFar = pathsoFar;
	}
	@Override
	public String toString() {
		return "Pair [source=" + source + ", destination=" + destination + ", weight=" + weight + ", pathsoFar="
				+ pathsoFar + "]";
	}
	@Override
	public int compareTo(Pair p) {
		return this.getWeight()-p.getWeight();
	}
	
}

public class DijkastraAlgorithm {
	public static void main(String[] args) {
		System.out.println("Enter no.of vertices and edges");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int edges = sc.nextInt();
		
		Dijkastra d = new Dijkastra();
		
		PriorityQueue<Pair> priorityQueue = new PriorityQueue<Pair>();
		HashMap<Integer, TreeMap<Integer,Integer>> graphMap = new HashMap<Integer, TreeMap<Integer,Integer>>();
		HashMap<Integer, Boolean> visitedMap = new HashMap<>();
		while(edges-- > 0) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			int weight = sc.nextInt();
			d.addEdge(source, destination, weight, graphMap,priorityQueue);
			d.addEdge(destination, source, weight, graphMap,priorityQueue);
			
			visitedMap.put(source, false);
			visitedMap.put(destination, false);
		}
		
		Iterator<Pair> itr = priorityQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(priorityQueue.poll());
		}
		
		d.printSortestPath(0, 6, 0, graphMap, visitedMap, priorityQueue);
			
	}
}
