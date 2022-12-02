package com.peerbits.java8features.javatechie.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("PHP");
		arrayList.add("Python");
		arrayList.add("Node js");

		arrayList.stream().filter((language) -> {
			if (language.contains("Java")) {
				return true;
			}
			return false;
		}).forEach(System.out::println);
		
		Map<String, Integer> hashMap = new HashMap<>();

		hashMap.put("Java", 4000);
		hashMap.put("Node js", 8000);
		hashMap.put("Python", 2140);
		hashMap.put("C++", 2980);
		
		hashMap.entrySet().stream().forEach(System.out::println);
		
//		let's take an example of filter method
		arrayList.stream().forEach(null);
		
	}
}
