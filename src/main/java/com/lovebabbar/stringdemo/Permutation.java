package com.lovebabbar.stringdemo;


class PermuDemo
{
	public void printPermu(String p,String up) {
		if (up.isBlank() || up.length() <= 0) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());

			printPermu(f + ch + s, up.substring(1));
		}
	}
}
public class Permutation {
	public static void main(String[] args) {
		PermuDemo p = new PermuDemo();
		p.printPermu("", "abc");
		
//		String str="abhishek";
		
//		System.out.println(str.substring(1,1));
		
		
	}
}
