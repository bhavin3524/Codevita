package com.peerbits.matrix;

import java.util.PriorityQueue;

class Median {
	public int medianOfMatrix(int[][] mat) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				priorityQueue.add(mat[i][j]);
			}
		}
		int result = 0;
		
		int queueSize=priorityQueue.size();

		for (int i = 0; i < (queueSize / 2); i++) {
			priorityQueue.poll();
		}

		if (queueSize % 2 != 0) {
			 result = priorityQueue.poll();
		} else {
			int a = priorityQueue.poll();
			int b = priorityQueue.poll();
			result = (a + b) / 2;
		}
		return result;
	}
}
public class MedianOfRowWiseSortedMatrix {
	public static void main(String[] args) {
		
		int[][] mat= {
				{1,3,5},
				{2,6,9},
				{3,6,9}
		};
		
		Median median = new Median();
		int result = median.medianOfMatrix(mat);
		
		System.out.println(result);
		
		
		
	}
}
