package com.peerbits.java8features.parallel;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringPermutation {
	
	public static Set<String> getAllPermutations(String str) {
		Set<String> permutation = new LinkedHashSet<>();

		if (str.length() == 0||str==null) {
			permutation.add("");
			return permutation;
		}

		char first = str.charAt(0);

		Set<String> words = getAllPermutations(str.substring(1));

		words.forEach(word -> {
			for (int i = 0; i <= word.length(); i++) {
				String prefix = word.substring(0, i);
				String suffix = word.substring(i);
				permutation.add(prefix + first + suffix);
			}
		});
		return permutation;
	}
	
	public static void main(String[] args) {
//		printAllPermutation("", "abc");
		Set<String> allPermutations = getAllPermutations("abc");
		
		System.out.println(allPermutations.toString());
		
		
	}

}
