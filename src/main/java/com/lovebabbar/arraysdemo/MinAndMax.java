package com.lovebabbar.arraysdemo;

import java.util.Arrays;
import java.util.Collections;

class MinAndMaxElementInArray
{
	
	private static int minValue=Integer.MAX_VALUE;
	private static int maxValue=Integer.MIN_VALUE;
	public void printMinMax(int a[])
	{
		
		if(a.length==0)
		{
			System.out.println("min:"+minValue+"  "+"max:"+maxValue);
			return;
		}
		if(a[0]<minValue)
		{
			minValue=a[0];
		}
		if(a[0]>maxValue)
		{
			maxValue=a[0];
		}
		printMinMax(Arrays.copyOfRange(a, 1, a.length));
	}
	
//	efficient approach
	public void printMaxMin(Integer a[])
	{
		System.out.println(Collections.min(Arrays.asList(a)));
		System.out.println(Collections.max(Arrays.asList(a)));
	}
}

public class MinAndMax {
	public static void main(String[] args) {
		MinAndMaxElementInArray arrTest = new MinAndMaxElementInArray();
		int a[]= {88,44,33,22,55,66};
		arrTest.printMinMax(a);
		
		Integer b[]= {88,44,33,22,55,66};
		
		arrTest.printMaxMin(b);

	}
}
