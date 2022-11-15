package com.peerbits.binarytrees;

class Node {
	int data;
	Node leftNode;
	Node rightNode;

	public Node(int data) {
		this.data = data;
		this.leftNode = this.rightNode = null;
	}
}

class BinaryTree {
//	root of the binary tree
	Node rootNode;

	public BinaryTree() {
		rootNode = null;
	}

	public void printLevelOrder() {

	}

	public int getHeightOfTree(Node root) {
		if (root == null) {
			return 0;
		} else {
//			compute height of each subtree

			return 0;
		}
	}

}

public class LevelOrderTraversal {
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.rootNode = new Node(1);
		binaryTree.rootNode.leftNode = new Node(2);
		binaryTree.rootNode.rightNode = new Node(3);
		binaryTree.rootNode.leftNode.leftNode = new Node(4);
		binaryTree.rootNode.rightNode.rightNode = new Node(5);
		
		

	}
}
