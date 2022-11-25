package com.peerbits.java8features.javatechie.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBookList() {
		List<Book> arrayList = new ArrayList<>();

		arrayList.add(new Book(123, "Fire of wings", 440));
		arrayList.add(new Book(444, "APJ abdul kalam biography", 77));
		arrayList.add(new Book(234, "Safari magazine", 89));
		arrayList.add(new Book(478, "Wolvarin x man", 897));
		arrayList.add(new Book(345, "Fifty shades", 875));
		arrayList.add(new Book(78, "Babar hazam bio", 245));

		return arrayList;
	}

}
