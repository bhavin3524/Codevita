package com.pepcoding.dynamicprogramming;

import java.util.Arrays;

class PepcodingTargetSubSet
{
	public void targetSubSet(int ans[],int arr[],int target)
	{
		if(arr.length==0)
		{
			int sum=0;
			for(int i=0;i<ans.length;i++)
			{
				sum=sum+ans[i];
			}
			if(sum==target)
			{
				System.out.println(Arrays.toString(ans)+"--->"+sum);
			}
			return;
		}
		
		int[] a = Arrays.copyOf(ans, ans.length+1);
		a[ans.length]=arr[0];
		
		int[] b = Arrays.copyOfRange(arr, 1, arr.length);
		
		targetSubSet(a, b, target);
		
		int[] c = Arrays.copyOf(ans, ans.length);
		
		int[] d = Arrays.copyOfRange(arr, 1, arr.length);
		
		targetSubSet(c, d, target);
	}
}
public class TargetSubset {
	public static void main(String[] args) {
		int a[]= {4,2,7,1,3};
		
		PepcodingTargetSubSet pSet = new PepcodingTargetSubSet();
		int b[]=new int[0];
		pSet.targetSubSet(b, a, 10);
		
		
		
	}
}
