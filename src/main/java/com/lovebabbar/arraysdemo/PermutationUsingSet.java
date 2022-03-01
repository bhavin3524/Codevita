package com.lovebabbar.arraysdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationUsingSet {
	public static Set<String> getPermutation(String str) {

	    // create a set to avoid duplicate permutation
	    Set<String> permutations = new LinkedHashSet<String>();

	    // check if string is null
	    if (str == null) {
	      return null;
	    } else if (str.length() == 0) {
	      // terminating condition for recursion
	      permutations.add("");
	      return permutations;
	    }

	    // get the first character
	    char first = str.charAt(0);

	    // get the remaining substring
	    String sub = str.substring(1);

	    // make recursive call to getPermutation()
	    Set<String> words = getPermutation(sub);

	    // access each element from words
	    for (String strNew : words) {
	      for (int i = 0;i<=strNew.length();i++){

	        // insert the permutation to the set
	        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
	        System.out.println(permutations);
	      }
	    }
	    System.out.println("======");
	    return permutations;
	  }

	  public static void main(String[] args) {

	    // create an object of scanner class
//	    Scanner input = new Scanner(System.in);
//
//	    // take input from users
//	    System.out.print("Enter the string: ");
//	    String data = input.nextLine();
	    String data="ABC";
//	    System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
	    getPermutation(data);
	    }
}