package com.peerbits.java8features.parallel;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Permu {

	private static Set<String> printAllPermutation(String str, String result, int i, Set<String> permutationSet) {

		if (i == str.length() || str.isEmpty()) {
			return permutationSet;
		}
		permutationSet.add(str);

		printAllPermutation(str.substring(1) + str.charAt(0), result, ++i, permutationSet);

		for (int j = 0; j < str.length(); j++) {
			for (int k = j + 1; k < str.length(); k++) {
				String temp = str.substring(0, k);
				String suffix = str.substring(k + 1);
				str.charAt(k);

				str = str.charAt(k) + temp + suffix;
				if (!permutationSet.contains(str)) {
					permutationSet.add(str);
				}
			}
		}
		return permutationSet;
	}

	public static void main(String[] args) {

//		System.out.println(hashSet);
		Set<String> resultSet = printAllPermutation("ABC","",0,new TreeSet<>());
		System.out.println(resultSet);
		System.out.println(resultSet.size());

	}

}
