package com.java8.gennieswami;

import java.util.function.Function;

//	write a function for return String length
public class Test3 {
	public static void main(String[] args) {
//		Function<T, R> function

		String str = "abhishek";
		Function<String, Integer> strLength = s -> s.length();
		
		System.out.println(strLength.apply(str));
		System.out.println(strLength.apply("PANCHAL"));
	}

//	-----------Function interface

	/**
	 * 1. function is exactly same as predicates except that function can return any
	 * type of result but function should (can) return only one value and that value
	 * can be any type as per our requirement 
	 * 
	 * 
	 * 2. Function interface present in
	 * java.util.function package.
	 * 
	 * 3. Functional interface contains only one method. apply() method.
	 * 
	 * 4.Difference between predicate and function 
	 * 
	 * 
	 * syntax : ------
	 * 
	 * interface function(T,R) { public R apply(T t); }
	 * 
	 */

}
