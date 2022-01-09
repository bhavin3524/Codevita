package com.collectionsexample;

import java.util.Arrays;
import java.util.Collections;

public class CountFrequency {
	public static void main(String[] args) {
		String str = "checkfrequency";

		for (int i = 0; i < str.length(); i++) {
			System.out.println(
					 Collections.frequency(Arrays.asList(str), str.charAt(i)));
		}
	}
}
