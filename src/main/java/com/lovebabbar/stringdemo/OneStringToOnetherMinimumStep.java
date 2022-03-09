package com.lovebabbar.stringdemo;


class Transform
{
	public void transFormString(String ans,String str,int i,int count)
	{
		if (str.equals(ans)) {
			System.out.println("minimum step:" + count);
			return;
		}
		
		if (str.charAt(i) != ans.charAt(i)) {
			char curChar = str.charAt(i);
			int j = i;
			String rem = curChar + str.substring(0, i) + str.substring(i + 1);
			count++;
			transFormString(ans, rem, j, count);
		} else {
			int j = i - 1;
			transFormString(ans, str, j, count);
		}

	}
}
public class OneStringToOnetherMinimumStep {
	public static void main(String[] args) {
		Transform t = new Transform();
		
//		String str="EACBD";
//		String ans="EABCD";
		
//		String str1="abd";
//		String str2="bad";
		
		String str1 = "GeeksForGeeks";
		String str2 = "ForGeeksGeeks";
		
		t.transFormString(str2, str1, str1.length() - 1, 0);
	}
}
