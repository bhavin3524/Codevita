package com.lovebabbar.arraysdemo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class LargestSum
{
	public void calculateSubArraySum(int a[])
	{
		int maxSum=Integer.MIN_VALUE;
		for(int k=0;k<a.length;k++)
		{
			for(int i=k;i<a.length;i++)
			{
				int currSum=0;
				for(int j=k;j<i;j++)
				{
					currSum=currSum+a[j];
//					System.out.print(a[j]+"   ");
					if(currSum>=maxSum)
					{
						maxSum=currSum;
						System.out.println("maximum sum is:"+maxSum);
					}
				}
//				System.out.print("--->"+currSum);
//				System.out.println();
			}
//			System.out.println("-----");
		}
	}
}


class SubArraySumUsingRecursion
{
	public void printSubArray(int a[],LinkedHashMap<String, Integer> sumMap)
	{
		if(a.length==0)
		{
			return;
		}
		System.out.println(Arrays.toString(a));
		printSubArray(Arrays.copyOfRange(a, 1, a.length), sumMap);
//		for(int i=a.length-1;i>0;i--) {
//			int sum=0;
//			int[] subarray = Arrays.copyOfRange(a, i, a.length);
//			
//			for(int j=0;j<subarray.length;j++) {
//				sum=sum+subarray[j];
//			}
//			
//			sumMap.put(Arrays.toString(subarray),sum);
//			System.out.println(Arrays.toString(subarray)+"---"+sum);
//		}
	}
	
	public void subArraySum(int a[],LinkedHashMap<String, Integer> sumMap)
	{
		if(a.length==0)
		{
			sumMap.put("", 0);
			return;
		}
		subArraySum(Arrays.copyOfRange(a, 1, a.length),sumMap);
		
		printSubArray(a,sumMap);
		System.out.println("++++++++++++");
		
	}
}

public class LargestSumSubArray {
	public static void main(String[] args) {
//		int a[]= {2,-4,6,22,-6,7};
		int a[]= {11,12,13,14,15,16};
		
		LargestSum lSum = new LargestSum();
		SubArraySumUsingRecursion sSum = new SubArraySumUsingRecursion();
		System.out.println("this is bhavin vishnubhai panchal");
		
//		lSum.calculateSubArraySum(a);
//		TreeMap<String, Integer> treeMap = new TreeMap<>();
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		sSum.subArraySum(a,linkedHashMap);
//		System.out.println(treeMap);
		linkedHashMap.forEach((key,value)->{
			System.out.println(key+">"+value);
		});
		
	}
}
