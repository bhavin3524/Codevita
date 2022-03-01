package com.pepcoding.graphindepth;


class PermuExample
{
	public void printAllPermutation(int a[][])
	{
		
	}
}
public class PermutationAbhi {
	
	public static void rotateString(String str,Character ch) {
		Character currChar=str.charAt(0);
		if(currChar==ch)
		{
			return;
		}
		
		System.out.println(str);
		String substring = str.substring(1);
		rotateString(substring+currChar,ch);
	}
	public static void main(String[] args) {
		
		System.out.println("--");
		rotateString("abc", 'a');
		
		
	}
}
