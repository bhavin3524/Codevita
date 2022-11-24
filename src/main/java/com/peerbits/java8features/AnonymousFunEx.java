package com.peerbits.java8features;


/**
 * 
 * before you moreover move on lambda expression you must aware of Functional Interface
 * 
 * Lambda Expression
 *
 * The Expression through which we can represent an Anonymous function
 *
 * Anonymous:nameless/Unknown
 *
 * Anonymous Function:A method who don't have any name or access modifier
 * 
 * Lambda Expressions can be applicable on functional interface
 */
public class AnonymousFunEx {

	public void m1()
	{
		System.out.println("normal method ex....");
	}

	()
	{
		System.out.println("Anonymous method example....");
	}

	public static void main(String[] args) {
			AnonymousFunEx anonymousFunEx = new AnonymousFunEx();
			
			anonymousFunEx.m1();
	}
}
