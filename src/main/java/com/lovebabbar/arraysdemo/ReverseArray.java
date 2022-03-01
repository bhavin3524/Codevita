package com.lovebabbar.arraysdemo;

import java.util.ArrayList;
import java.util.Arrays;

class ReverseArrayDemo
{
//	int n=0;
	public ArrayList<Integer> reverseArrayDemo(int a[])
	{
		if (a.length == 1) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(a[0]);
			return arrayList;
		}
//		System.out.println(n);
//		n++;
		ArrayList<Integer> finalList = reverseArrayDemo(Arrays.copyOfRange(a, 1, a.length));
		finalList.add(a[0]);

		return finalList;
	}
	
	
//	efficiant approach
	
	
	
	public int [] efficiantApproach(int a[])
	{
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++)
		{
			if(i<j)
			{
				a[i]=a[j]-a[i];
				a[j]=a[j]-a[i];
				a[i]=a[i]+a[j];
				j--;
			}
		}
		return a;
	}
	
}
public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {11,12,13,23,67,45,32};
		
		ReverseArrayDemo rd = new ReverseArrayDemo();
		
		
		System.out.println(rd.reverseArrayDemo(a));
		
		System.out.println(Arrays.toString(rd.efficiantApproach(a)));
		
	}
}
