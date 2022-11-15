package com.peerbits.binarytrees.levelordertraversal;

import java.util.LinkedList;
import java.util.Queue;

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

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

}

class BinaryTree {
//	root of the binary tree
	private Node rootNode;

	public BinaryTree() {
		rootNode = null;
	}

	public void printLevelOrder() {
		Queue<Node> queueList = new LinkedList<Node>();

		queueList.add(rootNode);

		while (!queueList.isEmpty()) {
//			Poll the removes present head

			Node tempNode = queueList.poll();
			System.out.print(tempNode.getData()+" ");

			if (tempNode.getLeftNode() != null) {
				queueList.add(tempNode.getLeftNode());
			}

			if (tempNode.getRightNode() != null) {
				queueList.add(tempNode.getRightNode());
			}
		}
	}

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}
}

public class LevelOrderTraversal {
	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRootNode(new Node(1));
		binaryTree.getRootNode().setLeftNode(new Node(2));
		binaryTree.getRootNode().setRightNode(new Node(3));
		binaryTree.getRootNode().getLeftNode().setLeftNode(new Node(4));
		binaryTree.getRootNode().getRightNode().setRightNode(new Node(5));

		System.out.println("=======Level order traversal of binary tree ====");
		binaryTree.printLevelOrder();
	}
}
