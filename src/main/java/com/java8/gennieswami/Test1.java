package com.java8.gennieswami;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        System.out.println(numbers);
        
//        filter arraylist elements which are greater than 20
        
        List<Integer> filteredElements = 
        		numbers.stream().filter(element->element>20 && element<45).collect(Collectors.toList());
        
        System.out.println(filteredElements);
        
//        ====================write a program to take a list where we are adding 5 to each element
        
//        when we want to modify existing data we generally used .map method
        List<Integer> list2 = numbers.stream().map(element  -> element+5 ).collect(Collectors.toList());
        
        System.out.println(list2);
        
//        Terminal Operations
        Stream<Integer> stream = Stream.of(1,2,3,44,5,6,-44);
        
//        Object[] arrayObj = stream.toArray();
        
		/*
		 * for(int i=0;i<arrayObj.length;i++) { System.out.println(arrayObj[i]); }
		 */
        
//		===============
        
        System.out.println("______________________________________");
        
//        ===============(2)count element
        
        
        List<String> brandList = List.of("lenovo","laptop","dell","apple");
//        System.out.println(brandList.stream().count());
        brandList.stream().forEach(System.out::println);
        
//        ============3.min() and max() functions.
        Optional<Integer> min = stream.min(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(min.get());
        
//        ===============anymatch operation()
//        brandList.stream().anyMatch(element->element.equalsIgnoreCase(""))
        boolean bool = numbers.stream().anyMatch(element -> element == 30);

        System.out.println(bool);
    }
}
//Java 8 new features

/**
 * 1.Lamda expressions
 * 2.Functional interfaces
 * 3.Default methods
 * 4.Predicates
 * 5.Function
 * 6.Stream API
 * 7.Double colon operator
 *
 *
 *
 * 1.what is the difference between stream and java.io
 *  -> when we want to process object from the collection then we should go for stream
 *
 * 2.what is the difference in collection and stream
 * ->when we want to rep group of  individual object as a single entity then we should go
 * for collection
 *
 * we can process a object in 2 step.
 *
 * (1) configuration-
 *          (a).filter - to filter object on the basis of boolean condition[T/F]
 *          (b).map - if we want to make a new object for every present in collection
 *
 * (2) Processing-
 *
 *
 *  -------------STREAM TERMINAL OPERATIONS -------------
 *
 *          (f)-anyMatch()
 *          (g)-allMatch()
 *          (k)-collect()
 *          (a)-count()
 *          (i)-findAny()
 *          (j)-findFirst()
 *          (e)-forEach()
 *          (c)-max()
 *          (b)-min()
 *          (d)-toArray()
 *          (h)-noneMatch()
 *
 *
 *
 *
 *
 *
 */

