package com.peerbits.java8features.javatechie.funinterface.consumer;

import java.util.List;
import java.util.function.Consumer;

class ConsumerExample implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}

}

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (a) -> {
			System.out.println(a);
		};

		consumer.accept(34);
		
		List<Integer> arrList = List.of(11,22,33,44,55);
		
		arrList.stream().forEach(consumer);
	}
}
