package com.pepcoding.graphindepth;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


class WiredConnection{
	public void addEdge(int source,int destination,HashMap<Integer, TreeSet<Integer>> graphMap)
	{
		if(graphMap.containsKey(source)==false)
		{
			TreeSet<Integer> neighbors = new TreeSet<Integer>();
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
		else {
			TreeSet<Integer> neighbors = graphMap.get(source);
			neighbors.add(destination);
			graphMap.put(source, neighbors);
		}
		
	}
	
	public void detectCycle(int source,HashMap<Integer, TreeSet<Integer>> graphMap,HashMap<Integer, Boolean> visitedMap)
	{
		
	}
	
}
public class MakingWiredConnection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of vertices and edges ");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		while(e-- >0) {
			
		}
	}
}


//		leetcode solutions

//class Graph
//{
//   public void addEdge(int source,int destination,HashMap<Integer,TreeSet<Integer>> graphMap)
//   {
//       if(graphMap.contains(source)==false)
//       {
//           TreeSet<Integer> neighbors=new TreeSet<Integer>();
//            neighbors.add(destination);
//            graphMap.put(source,neighbors);
//       }
//       else
//       {
//            TreeSet<Integer> neighbors=graphMap.get(source);
//            neighbors.add(destination);
//            graphMap.put(source,destination);
//       }
//   }
//    public ArrayList<Integer> getConnectedComponents(HashMap<Integer,TreeSet<Integer>>                              graphMap,HashMap<Integer,Boolean>visitedMap,int source)
//    {        
//        visitedMap.put(source)=true;
//        ArrayList<Integer> finalList=new ArrayList<Integer>();
//        TreeSet<Integer>  neighbors=graphMap.get(source);
//        neighbors.forEach(node->{
//            if(visitedMap.get(node)==false)
//            {
//                finalList=getConnectedComponents(graphMap,visitedMap,node);
//            }
//        });
//        ArrayList<Integer> componentList=new ArrayList();
//        componentList.add(source);
//        componentList.addAll(finalList);
//    }
//}
//class Solution {
//    public int makeConnected(int n, int[][] connections) {
//        Graph g=new Graph();
//        HashMap<Integer,TreeSet<Integer>> graphMap=new HashMap<Integer,TreeSet<Integer>>();
//        HashMap<Integer,Boolean> visitedmMap=new HashMap<>();
//        ArrayList<ArrayList<Integer>> componentList=new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            visitedMap.put(i,false);
//        }
//        for(int i=0;i<connections.length;i++)
//        {
//            g.addEdge(connections[i][0],connections[i][1],graphMap);
//            g.addEdge(connections[i][1],connections[i][0],graphMap);
//        }
//        visitedMap.forEach((vertex,isVisited)->{
//            if(isVisited==false)
//            {
//                ArrayList<Integer> finalList=g.getConnectedComponents(graphMap,visitedMap,key);   
//                componentList.add(finalList);
//            }
//        });
//        System.out.println(componentList);
//        return 2;
//    }
//}
//
