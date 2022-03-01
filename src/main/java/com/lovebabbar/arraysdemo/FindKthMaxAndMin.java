package com.lovebabbar.arraysdemo;

import java.util.PriorityQueue;

class KthMAxMin
{
	public void printKthMaxAndMin(int a[],PriorityQueue<Integer> pQueue,int k)
	{
		for(int i=0;i<a.length;i++)
		{
			pQueue.add(a[i]);
		}
		
		for(int i=k;i<a.length;i++) {
			if(pQueue.peek()<a[i])
			{
				pQueue.poll();
				pQueue.add(a[i]);
			}
		}
		
		System.out.println(pQueue.peek());
		
	}
}
public class FindKthMaxAndMin {
	public static void main(String[] args) {
		KthMAxMin k = new KthMAxMin();
		
		int a[]= {44,33,22,23,34,67,65,88,55};
		
		int kth=3;
		
		k.printKthMaxAndMin(a, new PriorityQueue<>(),kth);
//		2721/27663/71031
	}
}
