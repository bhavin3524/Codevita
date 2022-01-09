package com.kunal.recursion;


class SubsetExample{
	
	public void subSequence(String ans, String str) {

		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}

		char currentChar = str.charAt(0);

		subSequence(ans + currentChar, str.substring(1));

		subSequence(ans, str.substring(1));

	}
}
public class Subset {
	public static void main(String[] args) {
		SubsetExample sbExample = new SubsetExample();
		sbExample.subSequence("", "abc");
	}
}
