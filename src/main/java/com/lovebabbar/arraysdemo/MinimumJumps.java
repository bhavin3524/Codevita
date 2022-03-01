package com.lovebabbar.arraysdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MinimumArrayJumps
{
	public void createSubArray(List<Integer> subList, ArrayList<Integer> arrList,
			boolean v[], int i, int countSubList, int remainingLength) {
		Integer maxElement = Collections.max(subList);

		int indexOfMaxElement = arrList.indexOf(maxElement);

		int r = arrList.size() - indexOfMaxElement - 1;
		for (int k = 0; k <= indexOfMaxElement; k++) {
			v[k] = true;
		}
		
//		if(r<maxElement)
//		{
//			System.out.println(countSubList);
//			return;
//		}
		List<Integer> finalSubList;

		if (r > maxElement) {
			countSubList++;
			finalSubList = arrList.subList(indexOfMaxElement + 1, maxElement + 1);
		} else {
			countSubList++;
			finalSubList = arrList.subList(indexOfMaxElement + 1, arrList.size());
			System.out.println(countSubList);
			return;
		}
//		countSubList++;

		createSubArray(finalSubList, arrList, v, i, countSubList, remainingLength);
	}
}

public class MinimumJumps {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(5);
		arrayList.add(9);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(0);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(3);
		
//		System.out.println(arrayList.subList(11 ,17));
		
		MinimumArrayJumps arrayJumps = new MinimumArrayJumps();
		boolean v[]=new boolean[arrayList.size()];
		
		int s=arrayList.get(0);
		v[0]=true;
		List<Integer> subList = arrayList.subList(1, arrayList.get(0)+1);
		
		arrayJumps.createSubArray( subList, arrayList, v, 0, 0, 0);
		
		
	}
}
