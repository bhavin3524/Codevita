package com.kunal.recursion;

class Example
{												//abc
	public void printAllPermutationOfString(String perm, String str) {
		if (str.length() == 0) {
			System.out.println(perm);
			return;
		}

		char ch = str.charAt(0);
		for (int i = 0; i <= perm.length(); i++) {
			String f = perm.substring(0, i);
			String s = perm.substring(i, perm.length());
			printAllPermutationOfString(f + ch + s, str.substring(1));
		}
	}
}

public class PermutationTest {
	public static void main(String[] args) {
		Example example = new Example();
		example.printAllPermutationOfString("", "abc");
		String string="abcd";
		System.out.println("\n"+string.substring(0,0));
	}
}
