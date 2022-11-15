package com.kunal.recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayRecursion {

	public static boolean arrayIsSortedOrNot(int arr[], int idx) {

		if (idx == arr.length - 1) {
			return true;
		}
		if (arr[idx] <= arr[idx + 1]) {

			return arrayIsSortedOrNot(arr, ++idx);
		}
		return false;
	}
	
	public static int iThElement(int arr[], int idx, int element) {
		if (idx == arr.length) {
			return -1;
		}
		if (arr[idx] == element) {
			System.out.println("match");
			return idx;
		} else {
			idx++;
			return iThElement(arr, idx, element);
		}

	}

//	Recursion by returning  a list
	static ArrayList<Integer> list = new ArrayList<>();

	public static void findAllIndex(int arr[], int target, int index) {
		
		if(index==arr.length) {
			return ;
		}
		
		if (arr[index] == target) {
			list.add(index);
		}
		
		findAllIndex(arr, target, ++index);
	}
	

	public static void main(String[] args) {
//		int a[] = { 3, 5, 6, 7, 88, 9 };
//		System.out.println(arrayIsSortedOrNot(a, 0));

//		int b[] = { 3, 4, 5, 6, 7, 8, 77 };
//		System.out.println(iThElement(b, 0, 5));
		int c[] = { 22, 33, 44, 55, 66, 44, 11, 44, 54, 44, 88, 66, 44 };
		findAllIndex(c, 44, 0);

		System.out.println(list);
	}
}
