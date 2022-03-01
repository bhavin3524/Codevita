package com.lovebabbar.arraysdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class IntervalsDemo
{
	public boolean isSorted(ArrayList<Integer> list)
	{
//		System.out.println(list);
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)>list.get(i+1))
			{
				return false;
			}
		}
		return true;
	}
	
	public void interval(int [][]ans,int [][]intervals)
	{
		if(intervals.length<=1)
		{
			return;
		}
		
		int[] a = intervals[0];
		int[] b = intervals[1];
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		for(int j=0;j<b.length;j++)
		{
			list.add(b[j]);
		}
		
		boolean bool = isSorted(list);
		
		if(bool==false)
		{
			Integer max = Collections.max(list);
			Integer min = Collections.min(list);
			
			int c[]=new int[a.length];
			c[0]=min;
			c[1]=max;
			
			System.out.println(Arrays.toString(c));
		}
		
		int[][] subInterval = Arrays.copyOfRange(intervals, 1, intervals.length);
		
		interval(ans,subInterval);
	}
}

public class MergeIntervals {
	public static void main(String[] args) {
		int [][]intervals= {{1,3},{2,6},{8,10},{15,18}};
		
//		int b[][]={{1,4},{4,5}};
		
		int c[][]= {{1,4},{2,6},{5,7},{8,9}};
		
		IntervalsDemo id = new IntervalsDemo();
//		id.interval(intervals, intervals);
//		id.interval(b, b);
		id.interval(c, c);
		
	}
}
