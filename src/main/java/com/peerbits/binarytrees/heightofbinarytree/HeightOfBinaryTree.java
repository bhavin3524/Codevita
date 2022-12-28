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
	
	
	int rightHeight=0;

	public BinaryTree() {
	}

	public BinaryTree(Node rootNode) {
		this.rootNode = rootNode;
	}

	int getHeightOfBinaryTree(Node node, int height) {
		if (node == null || (node.getLeftNode() == null && node.getRightNode() == null)) {
			return height;
		}

//		if (node.getLeftNode() != null) {
			height = height + 1;
			int leftResult = getHeightOfBinaryTree(node.getLeftNode(), height);
//		}

//		if (node.getRightNode() != null) {
			height = height - 1;
			int rightResult = getHeightOfBinaryTree(node.getRightNode(), height);
			height=height+1;
//		}

		return (leftResult > rightResult) ? leftResult : rightResult;
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

	public void setTREE_MAX_HEIGHT(int TREE_MAX_HEIGHT) {
		TREE_MAX_HEIGHT = TREE_MAX_HEIGHT;
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
		binaryTree.getRootNode().getLeftNode().getRightNode().setLeftNode(new Node(8));
		binaryTree.getRootNode().getLeftNode().getRightNode().getLeftNode().setLeftNode(new Node(11));
		binaryTree.getRootNode().getLeftNode().getRightNode().getLeftNode().getLeftNode().setLeftNode(new Node(12));
		binaryTree.getRootNode().getLeftNode().getRightNode().getLeftNode().getLeftNode().getLeftNode().setLeftNode(null);;
		binaryTree.getRootNode().getLeftNode().getRightNode().setRightNode(new Node(9));
		binaryTree.getRootNode().getRightNode().setLeftNode(new Node(6));
		binaryTree.getRootNode().getRightNode().setRightNode(new Node(7));
		binaryTree.getRootNode().getRightNode().getLeftNode().setRightNode(new Node(10));

		System.out.println("=======Height of binary tree ====");
		System.out.println(binaryTree.getHeightOfBinaryTree(binaryTree.getRootNode(), 1));

	}
}
