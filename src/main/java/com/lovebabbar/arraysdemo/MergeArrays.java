package com.lovebabbar.arraysdemo;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int a[]= {4,6,7,8};
		int b[]= {1,3,5,9,12,14};
		
		int c[]=new int[a.length+b.length];
		
		int i=0;
		int j=0;
		
		int k=0;		
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
			k++;
		}		
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}		
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		
		
		System.out.println(Arrays.toString(c));
	}
}
