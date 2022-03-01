package com.lovebabbar.arraysdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class MinimizeHeights
{
	public  int minimizeHeights(ArrayList<Integer>  ansList,ArrayList<Integer> list,int i,int n,int k)
	{
		System.out.println(i);
		if(i==list.size())
		{
			Integer min = Collections.min(list);
			Integer max = Collections.max(list);
			
//			System.out.println(list);
//			System.out.println(list);
			
			return max-min;
		}
		
//		list=ansList;
		
		int j=i+1;
		
		System.out.println(ansList+":Pre--->ans");
		System.out.println(list+":pre-->list");
		ansList.set(i, ansList.get(i) + k);
		
		int a=minimizeHeights(ansList, list, j, n, k);
		
//		j=i-1;
		i--;
		
		
		System.out.println(ansList+":In--->ans");
		System.out.println(list+":In--->list");
		ansList.set(i, ansList.get(i) - k);
		int b=minimizeHeights(ansList, list, j, n, k);
		
		System.out.println(ansList+":Post--->ans");
		System.out.println(list+":Post--->list");
		if(a<b)
		{
			return a;
		}
		else {
			return b;
		}
	}
}
public class MinimizeTheHeights {
	public static void main(String[] args) {
		Integer arr[]= {1, 5, 8, 10};
//		Integer arr[]={3, 9, 12, 16, 20};
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(8);
		arrayList.add(10);
		MinimizeHeights m = new MinimizeHeights();
		int ans = m.minimizeHeights(arrayList,arrayList, 0, arrayList.size(), 2);

		Integer minimum_difference = Integer.MAX_VALUE;

//		int min = getMinimumDifference(arr, 0, n, k);

		if (ans < minimum_difference) {
			minimum_difference = ans;
		}

		System.out.println(ans);

	}
}
