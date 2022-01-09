package com.pepcoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class ConnectedTest
{
	HashMap<Integer, TreeSet<Integer>> grapMap;
	HashMap<Integer, Boolean> trueMap;
	public ConnectedTest(int v) {
		grapMap= new HashMap<>(v);
		trueMap= new HashMap<>();
		
	}
	
	public void addEdge(int src,int dst) {
		if(!grapMap.containsKey(src))
		{
			TreeSet<Integer> treeSet = new TreeSet<>();
			treeSet.add(dst);
			grapMap.put(src, treeSet);
		}
		else {
			TreeSet<Integer> treeSet = grapMap.get(src);
			treeSet.add(dst);
			grapMap.put(src, treeSet);
		}
	}
	
	public void initializeTrueMap() {
		grapMap.forEach((vertices,neighbors)->{
			trueMap.put(vertices, false);
		});
	}
	
	public void drawTreeAndGenerateComp()
	{
		
		ArrayList<ArrayList<Integer>> comps = new ArrayList<ArrayList<Integer>>();
		trueMap.forEach((node,isVisited)->{
			
			System.out.println("Inner condition:"+trueMap);
			if(isVisited==false)
			{
				ArrayList<Integer> compList = new  ArrayList<>();
				getConnectedComponents(node, compList);
				comps.add(compList);
			}
		});
		
		System.out.println(comps.size()==1);
	}
	
	public void getConnectedComponents(int source,ArrayList<Integer> pathList)
	{
		pathList.add(source);
		
		trueMap.put(source, true);
		
		TreeSet<Integer> treeSet = grapMap.get(source);
		
		treeSet.forEach(destination->{
			if(trueMap.get(destination)==false || trueMap.containsKey(destination)==false) {
				getConnectedComponents(destination, pathList);
			}
		});
	}
	public void printGraph() {
		grapMap.forEach((node,neighbors)->{
			System.out.println(node+"->"+neighbors);
		});
	}
}
public class GetConnnectedComponents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vertices and edges:");
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		
		ConnectedTest connectedComponents = new ConnectedTest(vertices);
		
		System.out.println("Enter "+edges+" eddges");
		
		for(int i=0;i<edges;i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			connectedComponents.addEdge(source, destination);
			connectedComponents.addEdge(destination, source);
		}
		
		connectedComponents.initializeTrueMap();
		
		connectedComponents.printGraph();

		System.out.println(connectedComponents.trueMap);
		
		
		System.out.println("Connected components list:");
		connectedComponents.drawTreeAndGenerateComp();
		
	}
}
