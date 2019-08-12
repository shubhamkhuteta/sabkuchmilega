package com.cap.ui;

import java.util.*;

import com.cap.services.*;

public class BookUI {
	public static void main(String[] args) throws Exception {
		int bookId=0;
		String title="";
		float price;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id : ");
		bookId=sc.nextInt();
		System.out.println("Enter book title : ");
		title=sc.next();
		System.out.println("Enter book price : ");
		price=sc.nextFloat();
		
		BookService bookService=new BookService();
		int result=bookService.addBook(bookId, title, price);
		
		System.out.println("Inserted Rocord : "+result);
		sc.close();
	}
}
