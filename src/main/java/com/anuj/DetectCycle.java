package com.anuj;

import java.util.*;

class DirectedGraph {
    HashMap<Integer, TreeSet<Integer>> graphMap;
    HashMap<Integer, Boolean> trueMap;

    public DirectedGraph(int v) {
        graphMap = new HashMap<>();
        trueMap = new HashMap<>();
    }

    public List<Integer> detectCycleUsingDFS(int source, ArrayList<Integer> cycleList) {
        cycleList.add(source);
        trueMap.put(source, true);
        TreeSet<Integer> treeSet = graphMap.get(source);

        treeSet.forEach(element -> {
            if ((trueMap.containsKey(element) == false || trueMap.get(element) == false)
                    && cycleList.contains(element) == false) {

                detectCycleUsingDFS(element, cycleList);
            } else {
                int index = cycleList.indexOf(element);
                cycleList.subList(index, cycleList.size());
            }
        });
        return cycleList;
    }

    public void addEdge(int source, int destination) {
        if (!graphMap.containsKey(source)) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(destination);
            graphMap.put(source, treeSet);
        } else {
            TreeSet<Integer> treeSet = graphMap.get(source);
            treeSet.add(destination);
            graphMap.put(source, treeSet);
        }
    }

    public void printGraph() {
        graphMap.forEach((source, destination) -> {
            System.out.println(source + "---" + destination);
        });
    }
}

public class DetectCycle {
    public static void main(String[] args) {
        System.out.println("Enter No. of vertices and edges");
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        DirectedGraph directedGraph = new DirectedGraph(vertices);
        System.out.println("Enter " + edges + " edges");

        for (int i = 0; i < edges; i++) {
            directedGraph.addEdge(sc.nextInt(), sc.nextInt());
        }

        System.out.println(directedGraph.detectCycleUsingDFS(2, new ArrayList<>()));
    }
}
