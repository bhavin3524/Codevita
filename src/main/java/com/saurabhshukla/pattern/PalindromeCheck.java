package com.saurabhshukla.pattern;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str="abcd";

        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                String sub = str.substring(i, j + 1);
                System.out.println(sub);
            }
        }
    }
}
