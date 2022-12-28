package com.peerbits.java8features.javatechie.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}



public class BookSrevice {

	public List<Book> getBookList() {
		BookDao bookDao = new BookDao();
		List<Book> bookList = bookDao.getBookList();

//		Collections.sort(bookList, new MyComparator());
		Collections.sort(bookList, new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				// TODO Auto-generated method stub
				return b1.getName().compareTo(b2.getName());
			}

		});
		
		

		return bookList;
	}

	public static void main(String[] args) {
		BookSrevice bookSrevice = new BookSrevice();
//		System.out.println(bookSrevice.getBookList());
		
		bookSrevice.getBookList().forEach(book->{
			System.out.println(book);
		});
		
	}
}
