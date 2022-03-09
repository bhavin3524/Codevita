package com.pepcoding.dynamicprogramming;


class StringDistance
{
	public int editStringDistance(String str1,String str2,int i,int j,int count)
	{
		if(str1.equals(str2))
		{
			System.out.println(count);
			return count;
		}
		
		if(i>str1.length() || j>str2.length())
		{
//			System.out.println(count);
			return count;
		}
		
		int k=i;
		int n=j;
		String s="";
		if(str1.charAt(i)==str2.charAt(j))
		{
			k++;
			n++;
			s=str2;
//			count++;
		}									// for replacing the character
		else if (str1.charAt(i)!=str2.charAt(j)) {
			 s=str2.substring(0, j)+str1.charAt(i)+str2.substring(j+1);
			 k++;
			 n++;
			 count++;
		}
		
		int r1=editStringDistance(str1, s, k, n, count);      // for replace the character
		
		String s2="";
		if(str1.charAt(i)!=str2.charAt(j))
		{
			s2=str2.substring(0,j)+str1.charAt(i)+str2.substring(j+1);
			k++;
			n++;
			count++;
		}
		int r2=editStringDistance(str1, s2, i, j, count);  		//  for insert the character
		
		
		String s3="";
		if(str1.charAt(i)!=str2.charAt(j))
		{
			s3=str2.subSequence(0, j)+str2.substring(j+1);
			count++;
		}
		
		int r3=editStringDistance(str1, s3, k, n, count);		// for delete the character
		
		int min = 0;
		if (r1 < r2 && r1 < r3) {
			min = r1;
		} else if (r2 < r1 && r2 < r3) {
			min = r2;
		} else if (r3 < r1 && r3 < r2) {
			min = r3;
		}
		return min;
		
	}
}
public class EditStringDistance {
	public static void main(String[] args) {
		String str1="ahellobye";
		String str2="amezooe";
		
		StringDistance sd = new StringDistance();
		sd.editStringDistance(str1, str2, 0, 0, 0);
		
	}
}
