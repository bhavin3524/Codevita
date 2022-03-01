package com.lovebabbar.stringdemo;

import java.util.ArrayList;
import java.util.TreeMap;

class LongestSubSequence
{
	public ArrayList<String> repeatingSubSequence(String ans,String str) {
		
		if(str.length()==0 || str.isEmpty()) {
//			System.out.println(ans);
//			treeMap.put(ans, ans.length());
			ArrayList<String> list=new ArrayList<>();
			list.add(ans);
			return list;
		}
		
		String tempAns=""+ans;
		String tempString=str.substring(1, str.length());
		
		ArrayList<String> left = repeatingSubSequence(tempAns, tempString);
		
		String tempAns2=ans+str.charAt(0);
		String tempSub=str.substring(1,str.length());
		
		ArrayList<String> right = repeatingSubSequence(tempAns2, tempSub);
		
		left.addAll(right);
		
		return left;
		
	}
}

public class LongestRepeatingSubSequence {
	public static void main(String[] args) {
		LongestSubSequence ls = new LongestSubSequence();
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
		ArrayList<String> first = ls.repeatingSubSequence("", "axxxybc");
		ArrayList<String> second = ls.repeatingSubSequence("", "aabcbc");
		
		if(first.size()>second.size()) {
			first.forEach(element->{
				if(second.contains(element))
				{
					System.out.println(element);
				}
			});
		}
	}
}
