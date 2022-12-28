package com.java8.gennieswami;

//	without lambda expression

interface Phoenix2 {
	void m1();
}

@FunctionalInterface
interface Phoenix {
	public abstract void m1();
}

//class A implements Phoenix {
//
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//
//		System.out.println("Hello m1");
//
//	}
//
//}

public class Jadu {
	public static void main(String[] args) {
//		A a = new A();
//		a.m1();
		
		System.out.println("start");

		Phoenix a = () -> System.out.println("Hello m1 main");

	}
}
