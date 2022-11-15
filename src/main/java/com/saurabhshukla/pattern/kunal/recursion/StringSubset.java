package com.kunal.recursion;


class SubSetTest{
	
	public void printAllSubSequence(String processed,String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		printAllSubSequence(processed+unprocessed.charAt(0), unprocessed.substring(1));
		
		printAllSubSequence(processed, unprocessed.substring(1));
		
	}
	
}
public class StringSubset {
	public static void main(String[] args) {
		SubSetTest subSetTest = new SubSetTest();
		
		subSetTest.printAllSubSequence("", "abc");
	}
}
