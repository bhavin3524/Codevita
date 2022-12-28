package com.java8.gennieswami;

import java.util.List;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {
		System.out.println();
		
		var arrList = List.of(10, 20, 30, 40, 20, 30, 40, 50);
		
//			var str="abhishek";
//			System.out.println(str);
		
		System.out.println(arrList);

		
		Stream<Integer> distinctElementStream = arrList.stream().distinct();
		
		distinctElementStream.forEach(
			System.out::println
		);

		Stream<Integer> arrListStream = arrList.stream();

	}
}

// 	Stream API

/**
 * This is an interface present in java.util.stream*
 * 
 * we can process object in two ways 1.configuration (a) filter (b) map
 * 2.processing
 */

// 	Q1:what is the difference in stream and java.io

//	Q2:what is the difference in collection and stream
