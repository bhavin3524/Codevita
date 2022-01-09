package com.kunal.github.recursion;

import java.util.Arrays;

class Example
{
	
	public void printMinAndMax(int arr[],int max,int min) {
		if(arr.length==0)
		{
			System.out.println("Min:"+min+"\n Max:"+max);
			return;
		}	
		if(arr[0]<min)
		{
			min=arr[0];
		}
		if (arr[0]>max) {
			max=arr[0];
		}
		int a[] = Arrays.copyOfRange(arr, 1, arr.length);
		printMinAndMax(a, max, min);
		
	}
}

public class MinAndMax {
	public static void main(String[] args) {
		Example example = new Example();
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int arr[]= {66,55,44,33,22,11,12,15,25};
		example.printMinAndMax(arr, max, min);
	}
}
