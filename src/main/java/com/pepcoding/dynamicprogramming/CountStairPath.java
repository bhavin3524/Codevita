package com.pepcoding.dynamicprogramming;

import java.util.TreeMap;

class CountStair
{
	public int countStair(int n,TreeMap<Integer, Integer> countMap)
	{
		if(n<0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		
		if(countMap.containsKey(n))
		{
			Integer r = countMap.get(n);
			return r;
		}
		
		int a=countStair(n-1,countMap);
		
		int b=countStair(n-2,countMap);
		
		int c=countStair(n-3,countMap);
		
		int result=a+b+c;
		
		countMap.put(n, result);
		
		return result;
	}
}
public class CountStairPath {
	public static void main(String[] args) {
		CountStair cs = new CountStair();
		int ans = cs.countStair(4, new TreeMap<>());
		
		System.out.println(ans);
		
	}
}
