package com.arraysortingalgo;

import java.util.Arrays;

public class MergeSort {
	
	
	
	public static int[] mergeSort(int arr[])
	{
		
		
		if(arr.length==1) {
			return arr;
		}
		
		int mid=arr.length/2;
		
		int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		

		int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		int[] ans = mergeTwoArrays(left,right);
		return ans;
	}
	
	public static int[] mergeTwoArrays(int first[],int second[])
	{
		int ans[]=new int[first.length+second.length];
		
		int i=0,j=0,k=0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j])
			{
				ans[k]=first[i];
				i++;
			}
			else {
				ans[k]=second[j];
				j++;
			}
			k++;
		}
		
//		it may be possible that one of the arrays is not complete
//		copy the remaining elements
		while(i<first.length)
		{
			ans[k]=first[i];
			i++;
			k++;
		}
		
		while(j<second.length)
		{
			ans[k]=second[j];
			j++;
			k++;
		}
		
		return ans;
	}
	
	
	public static void printArray(int a[])
	{
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"---");
		}
		
	}
	public static void main(String[] args) {
		int a[]= {7,4,66,55,33,99,43,32,77};
		System.out.println("Given  Array:");
		printArray(a);
		
//		sortArray(a, 0, a.length-1);
		System.out.println("\n"+"Sorted Array:");
		printArray(mergeSort(a));
		
//		printArray(a);
		
	}
}
