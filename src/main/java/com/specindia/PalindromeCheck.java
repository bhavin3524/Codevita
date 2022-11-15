package com.specindia;

import java.util.HashMap;

public class PalindromeCheck {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
////        String str = sc.next();
//
//        int S=sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<S;i++)
//        {
//            int e = sc.nextInt();
//
//            list.add(e);
//        }
//        System.out.println(list);

//        list.forEach();
        String str="abcd";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                System.out.println(sub);
            }
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
    }
}
