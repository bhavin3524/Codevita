package com.lovebabbar.stringdemo;

import java.util.TreeMap;

class Split
{
	public void splitString(String ans,String str,TreeMap<String, Integer> sumMap)
	{
		if(str.length()==0 || str.isEmpty())
		{
//			System.out.println(ans);
			return;
		}
		
		String sub = str.substring(1);
		String tempAns = ans + str.charAt(0) + "";

		System.out.println(sub);
		int sum=0;
		
		for (int i = 0; i < sub.length(); i++) {
			String t = sub.charAt(i) + "";
			int s = 0;
			if (t.equals("0")) {
//				t = "-1";
				s=-1;
			} else {
//				t = "1";
				s=1;
			}
//			s = Integer.parseInt(t);
			sum = sum + s;
		}
		sumMap.put(sub, sum);

		splitString(tempAns, sub, sumMap);
	}
}

public class SplitStringDemo {
	public static void main(String[] args) {
		String str = "0100110101";
		Split s = new Split();
		TreeMap<String, Integer> sumMap = new TreeMap<>();
		s.splitString("", str, sumMap);
//		System.out.println(sumMap);
//		int count=0;
		sumMap.forEach((key,value)->{
			if(value==0)
			{
				System.out.println(key);
//				count=count+1;
			}
		});
	}
}
