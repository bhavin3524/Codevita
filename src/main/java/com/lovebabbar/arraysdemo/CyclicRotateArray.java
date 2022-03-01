package com.lovebabbar.arraysdemo;

import java.util.Arrays;

class EfficientCyclicRotate
{
	public void rotateArray(int a[],int n)
	{
		if(n==0) {
			return;
		}
		int b[]=new int[a.length];
		 int[] subArr = Arrays.copyOfRange(a, 1, a.length);
		 for(int i=0;i<subArr.length;i++)
		 {
			 b[i]=subArr[i];
		 }
		b[b.length-1]=a[0];
		System.out.println(Arrays.toString(b));
		rotateArray(b,--n);
	}
}

public class CyclicRotateArray {
	public static void main(String[] args) {
		int a[]= {11,12,13,14,16,22};
		
		
//		for(int i=0;i<=a.length;i++)
//		{
//			int[] b = cyclicRotate(a);	
//			for(int j=0;j<a.length;j++)
//			{
//				a[j]=b[j];
//			}
//			
//			System.out.println(Arrays.toString(a));
//		}
		
		EfficientCyclicRotate ef = new EfficientCyclicRotate();
		ef.rotateArray(a, a.length);
	}
	public static int[] cyclicRotate(int a[])
	{
		int b[]=new int[a.length];
		for(int i=1;i<a.length;i++)
		{
			b[i-1]=a[i];
		}
		b[b.length-1]=a[0];
		
//		System.out.println(Arrays.toString(b));
		return b;
	}
}
