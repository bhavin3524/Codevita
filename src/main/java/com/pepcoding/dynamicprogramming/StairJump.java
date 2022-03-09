package com.pepcoding.dynamicprogramming;


class Jump
{
	public void stairJump(int a[],int j,int target,String path,int idx)
	{
		if(idx==target)
		{
			System.out.println(path+idx);
			return;
		}
		
		if(idx>target)
		{
			return;
		}
		
		int current=a[j];
		
		
		String currPath=""+path+j;
		for(int k=1;k<=current;k++)
		{
			int n=idx+k;
			stairJump(a, n, target,currPath,n);
		}
		
	}
}
public class StairJump {
	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 1, 2, 3, 2 };

		Jump j = new Jump();
		j.stairJump(a, 0, 6,"",0);
	}
}
