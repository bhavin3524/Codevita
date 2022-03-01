package com.lovebabbar.stringdemo;

import java.util.HashSet;
import java.util.Set;

class EasyPermutation
{
	public Set<String> printAllPermutation(String str)
	{
		HashSet<String> hashSet = new HashSet<>();
		if(str==null || str.isEmpty() || str.length()==0)
		{
			hashSet.add("");
			return hashSet;
		}
		
		char firstChar = str.charAt(0);
		String remainingString = str.substring(1);
		
		Set<String> wordSet = printAllPermutation(remainingString);
		
		wordSet.forEach((word)->{
			for(int i=0;i<=word.length();i++) {
				
				String permuChar = permuChar(word, firstChar, i);
				
				hashSet.add(permuChar);
			}
		});
		
		return hashSet;
	}
	
	public String permuChar(String str,char firstChar,int j)
	{
		String first = str.substring(0,j);
		String last = str.substring(j);
		
		return first + firstChar + last;
	}
}

public class AnotherPermutation {
	public static void main(String[] args) {
		EasyPermutation ePermutations = new EasyPermutation();
		Set<String> permutations = ePermutations.printAllPermutation("abc");
		System.out.println(permutations);
	}
}
