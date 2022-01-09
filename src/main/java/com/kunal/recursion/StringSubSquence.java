package com.kunal.recursion;

class RecursionTest
{
		public String printAceOfString(String ans,String str) {
			
			if(str.isEmpty()) {
				
				return ans;
			}
			
			char ch = str.charAt(0);
			if(ch=='a')
			{
				return printAceOfString(ans, str.substring(1));
			}
			else {
				return printAceOfString(ans+ch, str.substring(1));
			}
			
		}
		public String printAceOfString(String str) {
				if(str.isEmpty()) {
					return "";
				}
				char ch = str.charAt(0);
				if(ch=='a')
				{
					return printAceOfString(str.substring(1));
				}
				else {
					return ch+printAceOfString(str.substring(1));
				}
			}
		public String skipEntireString(String str) {
			
			if(str.isEmpty()) {
				return "";
			}
			if(str.startsWith("apple")) {
				return skipEntireString(str.substring(5));
			}
			else {
				return str.charAt(0) + skipEntireString(str.substring(1));
			}
		}
		
		public String skipAppNotApple(String str) {
			if(str.isEmpty()) {
				return "";
			}
			if(str.startsWith("app") && !str.startsWith("apple")) {
				return skipAppNotApple(str.substring(3));
			}
			else {
				return str.charAt(0) + skipAppNotApple(str.substring(1));
			}
		}
	}

public class StringSubSquence {
	public static void main(String[] args) {
		RecursionTest recursionTest = new RecursionTest();
//		System.out.println(recursionTest.printAceOfString("", "baccdah"));
//		System.out.println(recursionTest.printAceOfString("baccdah"));
//		System.out.println(recursionTest.skipEntireString("bccappledsam"));
		System.out.println(recursionTest.skipAppNotApple("baccapplfagd"));
	}
}
