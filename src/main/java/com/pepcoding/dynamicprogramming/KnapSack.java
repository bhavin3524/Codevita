package com.pepcoding.dynamicprogramming;

import java.util.Arrays;
import java.util.LinkedHashMap;

class Bag
{
	public void addElement(int ans[],int b[],LinkedHashMap<Integer, Integer> linkedMap,int target)
	{
		
		if(b.length==0)
		{
			for(int i=0;i<ans.length;i++)
			{
				System.out.println(ans[i] + "----" + linkedMap.get(ans[i]));
			}
			
			System.out.println("==================================================");
//			System.out.println(Arrays.toString(ans));
			return;
		}
		
		int[] a = Arrays.copyOf(ans, ans.length+1);
		a[a.length-1]=b[0];
		
		int[] d = Arrays.copyOfRange(b, 1, b.length);
		
		addElement(a, d, linkedMap, target);
		
		int[] v = Arrays.copyOf(ans, ans.length);
		
		int[] n = Arrays.copyOfRange(b, 1, b.length);
		
		addElement(v, n, linkedMap, target);
		
		
	}
}
public class KnapSack {
	public static void main(String[] args) {
		
		int a[]= {15,14,10,45,30};
		
		int b[]= {2,5,1,3,4};
		
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
		for(int i=0;i<a.length;i++)
		{
			linkedHashMap.put(b[i], a[i]);
		}
		
		Bag bag = new Bag();
		int c[]=new int[0];
		bag.addElement(c, b, linkedHashMap, 0);
		
	}
}
