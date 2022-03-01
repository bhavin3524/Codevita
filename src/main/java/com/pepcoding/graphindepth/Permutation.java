package com.pepcoding.graphindepth;


class PermutationDemo
{
	public void printAllPermutations(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
		}
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str+"--"+i);
			char ch = str.charAt(i);
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			
			String finalStr=left+right;
			printAllPermutations(finalStr, ans+ch);
		}
		
	}
}

public class Permutation {
	public static void main(String[] args) {
		String str="abc";
		PermutationDemo p = new PermutationDemo();
		p.printAllPermutations(str,"");
	}
}
