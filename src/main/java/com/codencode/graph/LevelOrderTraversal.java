package com.codencode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class LevelOrderTest {
    public Queue<Node> levelOrderTraversal(Node root, Queue<Node> queue) {
        while (!queue.isEmpty()) {

            Node node = queue.poll();
            System.out.println(node.getNo());
            if (node.getLeft() != null) {
                Node leftNode = node.getLeft();
                queue.add(leftNode);
            }

            if (node.getRight() != null) {
                Node rightNode = node.getRight();
                queue.add(rightNode);
            }


        }
        return queue;
    }

    public void levelOrderUsingDFS(Node node, int level, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        while (result.size() <= level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.getNo());

        levelOrderUsingDFS(node.getLeft(), ++level, result);

        levelOrderUsingDFS(node.getRight(), ++level, result);
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();


            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node != null) {
                    level.add(node.getNo());

                    if (node.getLeft() != null) queue.add(node.getLeft());
                    if (node.getRight() != null) queue.add(node.getRight());
                }
            }

            result.add(level);
        }

        return result;
    }

}

    class Node {
        private Integer no;
        private Node left;
        private Node right;


        public Node(int no, Node left, Node right) {
            this.no = no;
            this.left = left;
            this.right = right;
        }

        public Integer getNo() {
            return this.no;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
            return this.right;
        }
    }

    public class LevelOrderTraversal {
        public static void main(String[] args) {


            Node n6 = new Node(6, null, null);
            Node n7 = new Node(7, null, null);
            Node n8 = new Node(8, null, null);

            // Intermediate nodes
            Node n4 = new Node(4, null, null);
            Node n5 = new Node(5, n7, n8);
            Node n2 = new Node(2, n4, n5);
            Node n3 = new Node(3, n6, null);

            // Root node
            Node root = new Node(1, n2, n3);

            LevelOrderTest levelOrderTest = new LevelOrderTest();
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

//        levelOrderTest.levelOrderTraversal(root, queue);
            List<List<Integer>> result = new ArrayList<>();

//            levelOrderTest.levelOrderUsingDFS(root, 0, result);

            levelOrderTest.levelOrder(root);

        }
    }

