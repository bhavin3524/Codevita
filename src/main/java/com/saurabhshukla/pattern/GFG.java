/*package whatever //do not write package name here */

package com.saurabhshukla.pattern;
import java.util.*;
class Example
{
    public void printTriangleSum(ArrayList<Integer> list)
    {
        if(list.size()==0)
        {
            return;
        }
        ArrayList<Integer> sumList=new ArrayList<Integer>();
        for(int i=0;i<list.size()-1;i++)
        {
            int a=list.get(i);
            int b=list.get(i+1);
            int sum=(a+b);
            sumList.add(sum);
        }
        printTriangleSum(sumList);
        System.out.println(list);
    }
    
    
}


public class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		Example e=new Example();
		ArrayList<Integer> list=new ArrayList<Integer>(5);
		list.add(1);
			list.add(2);
				list.add(3);
					list.add(4);
						list.add(5);
		e.printTriangleSum(list);
	}
}