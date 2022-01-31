package com.kunal.github.recursion;

class ReverseStringExample
{
	public String reverseString(String ans,String str,int idx)
	{
		if (idx == str.length()) {
			return "";
		}
		String returnAns = reverseString(ans, str, ++idx);
		ans = returnAns + str.charAt(idx - 1);
		return ans;
	}
}

public class ReverseString {
	public static void main(String[] args) {
		ReverseStringExample reverseStringExample = new ReverseStringExample();
		
		System.out.println(reverseStringExample.reverseString("", "abcd", 0));
	}
}
