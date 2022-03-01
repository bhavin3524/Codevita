package com.lovebabbar.arraysdemo;

import java.util.ArrayList;
import java.util.Scanner;

class PalindromeDemo
{
	public static int count=0;
	public boolean checkString(String str)
	{
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--) {
			temp = temp+str.charAt(i);
		}
//		System.out.println("temp:"+temp);
		if(str.equals(temp)) {
			return true;
		}
		else {
			return false;
		}
	}
	public void paliCount(String ans,String str,int i,int result)
	{
		if(str.length()<i)
		{
			System.out.println(result);
			return;
		}
		String ansStr=str.substring(0,i);
//		System.out.println(ansStr);
		if(checkString(ansStr))
		{
			System.out.println(ansStr);
//			result+=1;
			count++;
		}
		String subStr=str.substring(1,str.length());
		paliCount(ans, subStr, i,result);
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		PalindromeDemo.count = count;
	}
}
public class PalindromeCount {
	public static void main(String[] args) {
		PalindromeDemo pd = new PalindromeDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("start");
		int N = sc.nextInt();
		String str=sc.next();
		int S=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<S;i++)
		{
			int element = sc.nextInt();
			list.add(element);
		}
		int result=0;
		list.forEach(e->{
			pd.paliCount("", str, e, result);
		});
		System.out.println(result);
		System.out.println("count"+PalindromeDemo.getCount());
	}
}
