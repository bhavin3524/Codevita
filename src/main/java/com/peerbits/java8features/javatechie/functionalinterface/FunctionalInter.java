package com.peerbits.java8features.javatechie.functionalinterface;


/**
 * 
 * @author Bhavin
 *The interface who contains only one abstract method but 
 *can have multiple default and static method is called 
 *functional interface
 */
@FunctionalInterface
public interface FunctionalInter {

	void m1();

	default void m2() {
		System.out.println("Default - method 2");
	}

	default void m3() {
		System.out.println("Default method 3");
	}

	static void m4() {
		System.out.println("static method 4");
	}
	
//	void m5();
}
