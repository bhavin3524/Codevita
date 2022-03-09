package com.pepcoding.dynamicprogramming;

import java.util.TreeMap;

class Fibo
{
	public int printDynamicFibo(int n,TreeMap<Integer, Integer> treeMap)
	{
		if (n <= 1) {
			return n;
		}
		int result = 0;
		if (treeMap.containsKey(n) == false) {

			System.out.println("print" + n);
			int first = printDynamicFibo(n - 1, treeMap);

			int second = printDynamicFibo(n - 2, treeMap);
			result = first + second;
		} else {
			result = treeMap.get(n);
		}
		treeMap.put(n, result);
		
		return result;
	}
}
public class DynamicFibo {
	public static void main(String[] args) {
		Fibo f = new Fibo();
		int ans = f.printDynamicFibo(8, new TreeMap<>());
		System.out.println(ans);
	}
}
