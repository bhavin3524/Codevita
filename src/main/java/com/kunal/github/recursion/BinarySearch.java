package com.kunal.github.recursion;

class BinaryExample
{
//	try to use two pointer algo
	public int binarySearch(int arr[],int m,int target)
	{
		
		if(target==arr[m]) {
			return m;
		}
		else if(target < arr[m]) {
			int mid=m/2;
			return binarySearch(arr, mid, target);
		}
		else if (target>arr[m]) {
			int mid=(m+arr.length)/2;
			return binarySearch(arr, mid, target);
		}
		return -1;
	}
}
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 11, 13, 15, 16, 18, 22, 23 };

		BinaryExample binaryExample = new BinaryExample();
		System.out.println(binaryExample.binarySearch(arr, arr.length-1, 14));

//		System.out.println(5/2);

	}
}
