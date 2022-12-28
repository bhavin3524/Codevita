package com.saurabhshukla.pattern.kunal.github.recursion;

import java.util.Arrays;

class BubbleSort{
	public void bubbleSort(int arr[],int i) {
		
		if(i==arr.length)
		{
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		bubbleSort(arr, ++i);
	}
}

public class RecursiveBubbleSort {
	public static void main(String[] args) {
		int arr[]= {44,33,22,34,55,77,43};
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(arr, 0);
	}
}
