package com.java8.gennieswami;

//	Lambda expressions

class Example {
	public void method1() {
		System.out.println("inside method1...");
	}

	public int addition(int a, int b) {
		return (a + b);
	}
	
	(int a,int b)->{
		return a-b;
	}
}

public class Test4 {
	public static void main(String[] args) {

		Example ex = new Example();
		
//		ex.()->{
//			System.out::println
//		}
		
	}
}

//	How to optimize lambda expressions

/**
 * --------Lambda expressions
 * 
 * 1.It is anonymous function -that means that doesn't have any name,no access
 * modifier,no return type
 * 
 */

//	There are certain protocols for lambda expressions


//	Type inference


