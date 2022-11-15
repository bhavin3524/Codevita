package com.kunal.github.recursion;

import java.util.HashMap;

class Parantheses
{
	
	public void checkParanthesesOrder(String ans,String str,HashMap<Character, Character> oppositeParantheses)
	{
		if(str.length()==0)
		{
			System.out.println("Yes");
			return ;
		}
		if(str.charAt(0)=='}' || str.charAt(0) == ')' || str.charAt(0)==']')
		{
			if(ans.charAt(ans.length()-1)!=oppositeParantheses.get(str.charAt(0)))
			{
				System.out.println("No");
				return;
			}
			checkParanthesesOrder(ans.substring(0,ans.length()-1),str.substring(1),oppositeParantheses);
		}
		else if (str.charAt(0) == '{' || str.charAt(0) == '(' || str.charAt(0) == '[') {
			char firstCharOfString = str.charAt(0);
			ans=ans+firstCharOfString;
			checkParanthesesOrder(ans, str.substring(1),oppositeParantheses);
		}
		
	}
}
public class ParanthesesOrder {
	public static void main(String[] args) {
	
		Parantheses parantheses = new Parantheses();
		HashMap<Character, Character> oppositeParantheses;
		oppositeParantheses=new HashMap<>();
		oppositeParantheses.put('}','{');
		oppositeParantheses.put(')','(');
		oppositeParantheses.put(']','[');
		parantheses.checkParanthesesOrder("","[()]",oppositeParantheses);
	}
}
