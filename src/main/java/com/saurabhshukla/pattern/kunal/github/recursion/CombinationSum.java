package com.saurabhshukla.pattern.kunal.github.recursion;

import java.util.ArrayList;
import java.util.List;

class SubArrayTArgetSum
{
	public List<List<Integer>> subArraySum(ArrayList<Integer> sumList,int arr[],int target)
	{
		for(int i=0;i<arr.length;i++) {
			sumList.add(arr[i]);
		}
		return new ArrayList<>();
	}
}

public class CombinationSum {
	public static void main(String[] args) {
		SubArrayTArgetSum subArrayTArgetSum = new SubArrayTArgetSum();
		
	}
}
