package com.kunal.recursion;


class StringTest
{
	public void skip(String processed,String unprocessed) {     // baccdad
		if(unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}
		char currChar = unprocessed.charAt(0);
		if(currChar!='a') {
			processed=processed+currChar;
			skip(processed, unprocessed.substring(1));
		}
		else {
			skip(processed, unprocessed.substring(1));
		}
	}
	
	public String skipString(String unprocessed) {    // baccdad
		if(unprocessed.length()==0 || unprocessed.isEmpty())
		{
			return "";
		}
		char currChar = unprocessed.charAt(0);
		if(currChar=='a')
		{
			return skipString(unprocessed.substring(1));
		}
		else {
			return currChar+skipString(unprocessed.substring(1));
		}
	}
}
public class AceOfString {
	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.skip("", "baccda");
		System.out.println(st.skipString("baccda"));
	}
}
