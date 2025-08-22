package com.lovebabbar.de;

import java.util.ArrayList;
import java.util.List;

class SubsetArrayTest {
    public List<String> getAllSubset(String str) {
        List<String> subsetList = new ArrayList<>();

        subsetList.add("@");     // power set always starts with empty set
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int currentSize = subsetList.size(); // Get the current size of the list. We will add new subsets based on these existing ones.

            for (int j = 0; j < currentSize; j++) {
                String currentSubset = subsetList.get(j);

                String newSubset = currentSubset + ch;

                subsetList.add(newSubset);
            }

        }
        return subsetList;
    }
}

public class SubsetArrExample {
    public static void main(String[] args) {
        SubsetArrayTest subsetArrayTest = new SubsetArrayTest();
        String str = "abcd";

        List<String> subsetList = subsetArrayTest.getAllSubset(str);
        subsetList
                .forEach(System.out::println);

    }
}
