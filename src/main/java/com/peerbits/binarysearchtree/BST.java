package com.peerbits.binarysearchtree;

class Node {
    private int data;
    private Node leftNode;
    private Node rightNode;

    Node(int data) {
        this.data = data;
        this.leftNode = this.rightNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRight() {
        return rightNode;
    }

    public void setRight(Node right) {
        this.rightNode = right;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    Node insertKey(Node root, int key) {
//        return a new node if tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.getData()) {
            Node node = insertKey(root.getLeftNode(), key);
            root.setLeftNode(node);
        }
        if (key > root.getData()) {
            Node node = insertKey(root.getRight(), key);
            root.setRight(node);
        }
        return root;
    }
}

public class BST {
    public static void main(String[] args) {

    }
}
