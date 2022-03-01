package com.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;

import com.sortingdemo.util.MyUtils;

public class StringSortingDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Alice");
		arrayList.add("Bob");
		arrayList.add("Abhishek");
		arrayList.add("Ricky");
		arrayList.add("Smith");
		arrayList.add("Barbara");
		arrayList.add("John");
		
		
		Collections.sort(arrayList);
//		System.out.println(arrayList);
		MyUtils.iterateList(arrayList);
	}
}
