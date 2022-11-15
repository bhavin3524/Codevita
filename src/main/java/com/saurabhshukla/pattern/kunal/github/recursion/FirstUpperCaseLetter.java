package com.saurabhshukla.pattern.kunal.github.recursion;



class UpperCase
{
	public int upperCaseString(String str, int idx) {
		if (idx == str.length()) {
			return -1;
		}
		if ((int) str.charAt(idx) >= 65 && str.charAt(idx) <= 90) {
			return idx;
		}
		return upperCaseString(str, ++idx);
	}
}

public class FirstUpperCaseLetter {
	public static void main(String[] args) {
		UpperCase upperCase = new UpperCase();
		System.out.println(upperCase.upperCaseString("abhishek", 0));
	}
}
