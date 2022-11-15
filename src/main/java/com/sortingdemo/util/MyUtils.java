package com.sortingdemo.util;

import java.util.ArrayList;

public class MyUtils {
    public static <T> void iterateList(ArrayList<T> list) {
        list.forEach(e -> {
            System.out.println(e + " ");
        });
    }
}
