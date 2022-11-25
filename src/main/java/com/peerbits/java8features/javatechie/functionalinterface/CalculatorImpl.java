package com.peerbits.java8features.javatechie.functionalinterface;


interface Calculator
{
//	void switchOn();
	
//	void addition(int a,int b);
	
	int multiplication(int a,int b,int c);
}


//	In Lambda Expressions You don't need to implement interface as well.
public class CalculatorImpl /* implements Calculator */{

// ================Normal approach	
//	@Override
//	public void switchOn() {
//		System.out.println("pls switch on Fan");
//	}
	
	
//	===============Lambda approach
//	()         ->            {body}
	
	
	public static void main(String[] args) {

//		Calculator calculator = () -> {
//			System.out.println("Switch on Fan ....");
//		};
//		
//		calculator.switchOn();
		
//		----------------
		
//		Calculator calculator = (a, b) -> {
//			System.out.println(12 + 13);
//		};
//		
//		calculator.addition(12, 13);
		
		Calculator calculator = (a, b, c) -> {
			return a * b * c;
		};

		int result = calculator.multiplication(3, 4, 5);
		System.out.println(result);
		
	}
	
	
	
}
