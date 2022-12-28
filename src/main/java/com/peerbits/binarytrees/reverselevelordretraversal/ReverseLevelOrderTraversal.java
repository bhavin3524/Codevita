package com.peerbits.binarytrees.reverselevelordretraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Node
{
	private int data;
	private Node leftNode;
	private Node rightNode;
	
	Node(int data) {
		this.data = data;
		this.leftNode =this.rightNode=null;
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
	Node rootNode;

	public BinaryTree() {
		rootNode = null;
	}

	public void printReverseLevelOrder(Node root) {

		Queue<Node> queueList = new LinkedList<Node>();

		Stack<Node> stack = new Stack<>();

		queueList.add(root);

		while (!queueList.isEmpty()) {
			Node node = queueList.poll();

			stack.push(node);
			
			if (node.getLeftNode() != null) {
				queueList.add(node.getLeftNode());
			}

			if (node.getRightNode() != null) {
				queueList.add(node.getRightNode());
			}
		}
		
		while(!stack.isEmpty())
		{
			Node topElement = stack.pop();
			System.out.print(topElement.getData() +"   ");
		}

	}

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}
}
public class ReverseLevelOrderTraversal {
	public static void main(String[] args) {
			BinaryTree binaryTree = new BinaryTree();
			
			binaryTree.setRootNode(new Node(1));
			binaryTree.getRootNode().setLeftNode(new Node(2));
			binaryTree.getRootNode().setRightNode(new Node(3));
			binaryTree.getRootNode().getLeftNode().setLeftNode(new Node(4));
			binaryTree.getRootNode().getRightNode().setRightNode(new Node(5));

			System.out.println("=======Reverse Level order traversal of binary tree ====");
			binaryTree.printReverseLevelOrder(binaryTree.getRootNode());
	}
}
