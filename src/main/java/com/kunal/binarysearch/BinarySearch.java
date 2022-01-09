package com.kunal.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {4,6,7,33,44,55,66,67,68,77};
		System.out.println("index of 55 is:"+binarySearch(arr, 77));
	}
	
	static int binarySearch(int arr[],int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
}