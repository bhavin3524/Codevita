package com.codencode.graph;

    class TransformStringTest
    {
        public int transformStringTest(String str2, String str1, int min)
        {

            //  A = "CBD", B = "BCD"
            if(str2.length() != str1.length())
            {
                return -1;
            }
            if(str2.isEmpty() || str1.isEmpty())
            {
                return min;
            }
            String s1 = str1;

            String s2 = str2;

            if((s1.charAt(0)+"").equals(s2.charAt(0) + ""))
            {
                s1 = s1.substring(1);
                s2 = s2.substring(1);
            }else
            {
                int idx = s2.indexOf((s1.charAt(0)));
                String ch = s2.charAt(idx) + "";

                String prefix = s2.substring(0, idx);
                String postfix = s2.substring(idx+1);

                s2 = ch+prefix+postfix;
                min++;

            }

            return transformStringTest(s1, s2, min);
        }
    }
    public class StringTransformation
    {
        public static void main(String args[])
        {
            // A = "EACBD", B = "EABCD"
            TransformStringTest transformStringTest = new TransformStringTest();
            System.out.println(transformStringTest.transformStringTest("EABCD", "EACBD", 0));
        }
    }
