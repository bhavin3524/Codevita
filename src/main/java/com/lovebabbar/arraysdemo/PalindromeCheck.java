package com.lovebabbar.arraysdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Reverse
{
//	public Boolean reverseString(SString )
	
	
	public Boolean reverseString(String str)
	{
		String temp=str;
		for(int i=0;i<str.length();i++) {
			str=str+str.charAt(i);
		}
		
		if(str.equals(temp))
		{
			return true;
		}
		else {
			return false;
		}
	}
}


public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("start---");
		int N = sc.nextInt();
		
		String str=sc.next();
		
		int S = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
			for(int i=0;i<S;i++) {
				int element = sc.nextInt();
				list.add(element);
			}
		
		Reverse r = new Reverse();
		
		String str="abmadambc";
		int S=3;
		
		list.add(3);
		list.add(4);
		list.add(5);
//		
		System.out.println(list+str);
		int result=0;
//		String str="abcde";
		System.out.println("hello");
//		for(int k=0;k<list.size();k++) {
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<i;j++) {
	//				System.out.println(str.substring(i, j+1));
					String subStr = str.substring(i, j+1);
//					if(subStr.length()==list.get(k) && (r.reverseString(str))) {
						System.out.println(str);
						result++;
//					}
				}
				System.out.println("---");
			}
//		}
		
		System.out.println("ans:"+result);
		
	}
	
	
}
