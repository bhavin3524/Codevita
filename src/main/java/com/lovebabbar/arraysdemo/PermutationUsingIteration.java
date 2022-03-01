package com.lovebabbar.arraysdemo;

import java.util.ArrayList;

class StringPerm
{
	public void printPermutation(String str) {
		if(str==null || str.isEmpty()) {
			return;
		}

//		create a empty ArrayList to store partial permutations
		ArrayList<String> list = new ArrayList<>();

		list.add(str.charAt(0) + "");

		for (int i = 1; i < str.length(); i++) {
			for (int j = list.size() - 1; j >= 0; j--) {
				
//				remove the current partial permutation from the arrayList
				String s = list.remove(j);
				
				for(int k=0;k<=s.length();k++) {
					
					list.add(s.substring(0,k)+str.charAt(i)+s.substring(k));
					
				}
				
			}
		}
		
		System.out.println(list);
	}
}

public class PermutationUsingIteration {
	public static void main(String[] args) {
		
		StringPerm stringPerm = new StringPerm();
		stringPerm.printPermutation("abc");
		
	}
}
