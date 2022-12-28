package com.peerbits.java8features.javatechie.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("India");
		arrayList.add("USA");
		arrayList.add("Australia");
		arrayList.add("Dubai");
		arrayList.add("Turkey");
		
		for (String str : arrayList) {
			System.out.println(str);
		}
		
		System.out.println("-------------------");
		arrayList.stream().forEach(element->{
			System.out.println(element);
		});
		
		System.out.println("---------HashMap ------Example");
		var hashMap = new HashMap<String,Integer>();
		hashMap.put("lenovo", 20000);
		hashMap.put("Dell", 8000);
		hashMap.put("Apple", 7000);
		hashMap.put("Samsung", 3000);
		
		hashMap.forEach((key,value)->{
			System.out.println(key+"-->"+value);
		});
		System.out.println("----------Filter Example");
		
		arrayList.stream().filter(t ->t.equals("Dubai")).forEach(System.out::println);
		
	}
}
