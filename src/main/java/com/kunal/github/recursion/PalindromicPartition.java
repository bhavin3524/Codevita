package com.kunal.github.recursion;

class Palindromic
{
	public void palindromicPartition(String ans,String str) {
		
		if(str.length()==0) {
			return;
		}
		for(int i=0;i<str.length();i++) {
			ans=ans+str.charAt(i);
			String revString = reverseString(ans);
			if(ans.equals(revString))
			{
				System.out.println(revString);
			}  
		}
		palindromicPartition("", str.substring(1));
	}
	
	public String reverseString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
}
public class PalindromicPartition {
	public static void main(String[] args) {
		Palindromic palindromic = new Palindromic();
		palindromic.palindromicPartition("","geeks");
	}
}
