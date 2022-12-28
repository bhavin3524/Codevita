package com.peerbits.java8features.javatechie.funinterface.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo /* implements Predicate<Integer> */{

//	@Override
//	public boolean test(Integer t) {
//		// TODO Auto-generated method stub
//		if(t%2==0)
//		{
//			return true;
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
//		Predicate<Integer> predicateDemo = new PredicateDemo();
//		
//		System.out.println(predicateDemo.test(4));

//		using lambda expressions

		Predicate<Integer> predicate = (num) -> {
			if (num % 2 == 0) {
				return true;
			}
			return false;
		};

		boolean result = predicate.test(32);
		System.out.println(result);
		
//		----------another predicate Example
		List<Integer> list = List.of(11, 12, 13, 14, 15, 45, 46);
		list.stream().filter((num) -> {
			if (num % 2 == 2) {
				return true;
			}
			return false;
		}).forEach(System.out::println);
		
	}

}
