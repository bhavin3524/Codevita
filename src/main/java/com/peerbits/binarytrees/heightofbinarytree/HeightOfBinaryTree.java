package com.peerbits.binarytrees.heightofbinarytree;


class Node {
	private int data;

	private Node leftNode;

	private Node rightNode;

	public Node(int data) {
		this.data = data;
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
	
	private int TREE_MAX_HEIGHT=0;
	
	Node rootNode;
	
	

	public BinaryTree() {
	}

	public BinaryTree(Node rootNode) {
		this.rootNode = rootNode;
	}

	int getHeightOfBinaryTree(Node node, int height) {
		if (node == null || node.getLeftNode() == null || node.getRightNode() == null) {
			return height + 1;
		}
		height = height + 1;
		int leftHeight = getHeightOfBinaryTree(node.getLeftNode(), height);

		height = height - 1;
		int rightHeight = getHeightOfBinaryTree(node.getRightNode(), height);

		return (leftHeight > rightHeight) ? leftHeight : rightHeight;
	}

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public int getTREE_MAX_HEIGHT() {
		return TREE_MAX_HEIGHT;
	}

	public void setTREE_MAX_HEIGHT(int tREE_MAX_HEIGHT) {
		TREE_MAX_HEIGHT = tREE_MAX_HEIGHT;
	}
}

public class HeightOfBinaryTree {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRootNode(new Node(1));
		binaryTree.getRootNode().setLeftNode(new Node(2));
		binaryTree.getRootNode().setRightNode(new Node(3));
		binaryTree.getRootNode().getLeftNode().setLeftNode(new Node(4));
		binaryTree.getRootNode().getLeftNode().setRightNode(new Node(5));
		binaryTree.getRootNode().getLeftNode().getRightNode().setLeftNode(new Node(6));
		binaryTree.getRootNode().setRightNode(new Node(3));

		System.out.println("=======Height of binary tree ====");
		System.out.println(binaryTree.getHeightOfBinaryTree(binaryTree.getRootNode(), 1));

	}
}
