package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

import com.sortingdemo.util.MyUtils;

public class SortingDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(13);
		arrayList.add(54);
		arrayList.add(27);
		arrayList.add(11);
		arrayList.add(23);
		arrayList.add(34);
		arrayList.add(45);
		arrayList.add(32);
		
		Collections.sort(arrayList);
//		System.out.println(arrayList);
		MyUtils.iterateList(arrayList);
		
	}
}
