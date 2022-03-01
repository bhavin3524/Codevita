package com.lovebabbar.arraysdemo;

import java.util.LinkedHashSet;
import java.util.Set;

class UnionInterSection
{
	public void union(int a[],int b[])
	{
		Set<Integer> unionSet=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			unionSet.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			unionSet.add(b[i]);
		}
		
		System.out.println("\n"+unionSet);
	}
	
	public void intersection(int a[],int b[])
	{
		for(int i=0;i<b.length;i++) {
			if(isElementExistInSecondArray(a, b, b[i]))
				System.out.print(b[i]+"   ");
		}
	}
	
	
	public boolean isElementExistInSecondArray(int a[],int b[],int element)
	{
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				return true;
			}
		}
		return false;
	}
}
public class UnionAndInterSection {
	public static void main(String[] args) {
		UnionInterSection u = new UnionInterSection();
		
		int a[]= {12,13,14,17};
		int b[]= {13,17,12,19};
		
		UnionInterSection interSection = new UnionInterSection();
		interSection.intersection(a, b);
		interSection.union(a, b);
		
	}
}
