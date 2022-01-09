package com.kunal.github.recursion;

import java.util.Arrays;

class BinaryExample
{
	public int binarySearch(int arr[],int target)
	{
		int mid = arr.length / 2;
		
		if(arr.length==0) {
			return -1;
		}
		else if (target == arr[mid]) {
			return mid;
		} else if (target < arr[mid]) {
			return binarySearch(Arrays.copyOfRange(arr, 0, mid), target);
		} else if (target > arr[mid]) {
			return binarySearch(Arrays.copyOfRange(arr, mid, arr.length), target);
		} else {
			return -1;
		}
	}
}
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 11, 13, 15, 16, 18, 22, 23 };
		
		BinaryExample binaryExample = new BinaryExample();
		System.out.println(binaryExample.binarySearch(arr, 15));
		
//		System.out.println(5/2);
		
		
	}
}
