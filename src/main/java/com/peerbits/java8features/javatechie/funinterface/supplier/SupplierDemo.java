package com.peerbits.java8features.javatechie.funinterface.supplier;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo /* implements Supplier<String> */{

//	@Override
//	public String get() {
//		// TODO Auto-generated method stub
//		return "Hello kubecon....";
//	}
	
	public static void main(String[] args) {
//		SupplierDemo supplierDemo = new SupplierDemo();
//		
//		String result = supplierDemo.get();
//		System.out.println(result);

//		lambda Expression approach

		Supplier<String> supplier = () -> {
			return "Hello Supplier";
		};

		System.out.println(supplier.get());

//		another example of supplier lambda
		List<String> arrList = List.of("Java", "Python", "PHP");
		arrList.stream().findAny().orElseGet(() -> "Element Not found");
	}
	

}
