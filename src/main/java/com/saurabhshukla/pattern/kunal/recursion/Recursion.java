package com.saurabhshukla.pattern.kunal.recursion;

public class Recursion {
	public static void main(String[] args) {
//		write a function that print Hello world
		message1();
	}
	
	public static void message1() {
		System.out.println("Hello world");
		message2();
	}
	public static void message2() {
		System.out.println("Hello world");
		message3();
	}
	public static void message3() {
		System.out.println("Hello world");
		message4();
	}
	public static void message4() {
		System.out.println("Hello world");
		message5();
	}
	public static void message5() {
		System.out.println("Hello world");
		message6();
	}
	public static void message6() {
		System.out.println("Hello world");
	}
	
	
	
}
