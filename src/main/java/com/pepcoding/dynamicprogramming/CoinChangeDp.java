package com.pepcoding.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class Coin
{
	public void coinSolution(int target,int ans[],int arr[],LinkedHashSet<ArrayList<Integer>> sortedSet)
	{
		if(checkSum(ans)==target)
		{
			ArrayList<Integer> arrayList = new ArrayList<>();
			Arrays.sort(ans);
			for(int i=0;i<ans.length;i++)
			{
				arrayList.add(ans[i]);
			}
			
			sortedSet.add(arrayList);
			return;
		}
		
		if(arr.length==0)
		{
			return;
		}
		
		if(checkSum(ans)>target)
		{
			return;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int tempAns[]=Arrays.copyOf(ans, ans.length+1);
			tempAns[tempAns.length-1]=arr[i];
			
			int tempArr[]=Arrays.copyOfRange(arr, 0, arr.length);
			
			coinSolution(target, tempAns, tempArr,sortedSet);
			
		}
	}
	
	private int checkSum(int arr[])
	{
		int currSum=0;
		for(int i=0;i<arr.length;i++)
		{
			currSum=currSum+arr[i];
		}
		return currSum;
	}
}
public class CoinChangeDp {
	public static void main(String[] args) {
		Coin c = new Coin();
		int a[]=new int[0];
		int b[]= {2,5,3,6};
		
		LinkedHashSet<ArrayList<Integer>> ansSet=new LinkedHashSet<ArrayList<Integer>>();
			
			c.coinSolution(10, a, b,ansSet);
			
			ansSet.forEach((element)->{
				System.out.println(element);
			});
	}
}
