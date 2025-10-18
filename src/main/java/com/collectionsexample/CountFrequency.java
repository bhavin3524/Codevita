package com.collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountFrequency {
	public static void main(String[] args) {
//		String str = "checkfrequency";
//
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(
//					 Collections.frequency(Arrays.asList(str), str.charAt(i)));
//		}

		List<String> employeeList = new ArrayList<>();
		employeeList.add("Abhishek");
		employeeList.add("Vaibhavi");
		employeeList.add("Zoya");
		employeeList.add("Milan");
		employeeList.add("Asha");
		employeeList.add("Dhruv");
		employeeList.add("Vaibhavi");
		employeeList.add("Abhishek");
		employeeList.add("Asha");
		employeeList.add("Pratik");
		employeeList.add("Asha");

		for (String employee : employeeList) {
			int count = Collections.frequency(employeeList, employee);
			System.out.println(employee + " --> " + count);
		}

		String str = "applelaptop";

		char[] chArray = str.toCharArray();


		for (char ch : chArray) {
			int count = Collections.frequency(Arrays.asList(chArray), ch);
			System.out.println(ch + " --> " + count);
		}

	}
}
