package com.pepcoding.graphindepth;

import java.util.*;

class BFSTest {

    public void addEdge(int source, int destination, TreeMap<Integer, TreeSet<Integer>> graphMap) {
        if (!graphMap.containsKey(source)) {
            TreeSet<Integer> neiborsNode = new TreeSet<>();
            neiborsNode.add(destination);
            graphMap.put(source, neiborsNode);
        } else {
            TreeSet<Integer> neighborsNode = graphMap.get(source);
            neighborsNode.add(destination);
            graphMap.put(source, neighborsNode);
        }

    }

    public void bfsTraversal(int source, TreeMap<Integer, TreeSet<Integer>> graphMap, HashMap<Integer, Boolean> visitedMap) {

        visitedMap.put(source, true);
        Queue<Integer> queueList = new LinkedList<>();

        queueList.add(source);

        while (queueList.isEmpty() == false) {
            Integer currNode = queueList.poll();
//			queueList.remove();

            System.out.println(currNode);

            TreeSet<Integer> neighborsNode;

            neighborsNode = graphMap.get(currNode);

            neighborsNode.forEach((nodeElement) -> {

                if (visitedMap.get(nodeElement) == false) {
//					System.out.println();

                    visitedMap.put(nodeElement, true);
                    queueList.add(nodeElement);
                }
            });
        }


    }
}

public class BfsByAnuj {
    public static void main(String[] args) {
        System.out.println("Enter no.of vertices and edges");
        Scanner sc = new Scanner(System.in);
        BFSTest bfsTest = new BFSTest();
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        TreeMap<Integer, TreeSet<Integer>> graphMap = new TreeMap<>();
        HashMap<Integer, Boolean> visitedMap = new HashMap<Integer, Boolean>();

        while (edges-- > 0) {
            int source = sc.nextInt();
            int destination = sc.nextInt();

            bfsTest.addEdge(source, destination, graphMap);
            bfsTest.addEdge(destination, source, graphMap);

            visitedMap.put(source, false);
            visitedMap.put(destination, false);
        }

        bfsTest.bfsTraversal(0, graphMap, visitedMap);
    }
}
