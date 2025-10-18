package com.cheetsheet;

import java.util.ArrayList;
import java.util.List;

public class PermutationExample {

    public static void main(String[] args) {

        permutationList("", "ABC");
//        System.out.println(permutaionList);
    }

    public static void permutationList(String result, String str) {
        if (str.isEmpty()) {
//            permutaionList.add(result);
            return;
        }

        for (int i = 0; i <= result.length(); i++) {
            permutationList(result.substring(0, i) + str.charAt(0) + result.substring(i), str.substring(1));
        }

    }
}
