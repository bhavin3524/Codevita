package com.kunal.recursion.pattern;

import java.util.ArrayList;

class Combination
{
	public void printCombinationSum(int currSum,ArrayList<Integer> ansList,ArrayList<Integer> arrList,int target)
	{
		if(currSum == target)
		{
			System.out.println(ansList);
			return ;
		}
		
		if(currSum>target)
		{
			return;
		}
		
		for (int k = 0; k < arrList.size(); k++) {
			ArrayList<Integer> list1 = new ArrayList<>();
			list1.addAll(ansList);
			list1.add(arrList.get(k));

			int sum = 0;

			for (int i = 0; i < list1.size(); i++) {
				sum = sum + list1.get(i);
			}
			printCombinationSum(sum, list1, arrList, target);
		}
		
	}
}
public class CombinationSumRepeat {
	public static void main(String[] args) {
		Combination c = new Combination();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);

		c.printCombinationSum(0, new ArrayList<>(), arrayList, 8);
	}
}
