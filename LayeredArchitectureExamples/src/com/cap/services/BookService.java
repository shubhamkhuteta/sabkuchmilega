package com.cap.services;

import com.cap.beans.BookBean;
import com.cap.dao.BookDAO;

public class BookService implements BookServiceI {

	public int addBook(int bookId, String title, float price) throws Exception {
	
		String grade="";
		if(price<=300) {
			grade="C";
		}else if(price <=600) {
			grade = "B";
		}else grade = "A";
		
		BookDAO bookDAO=new BookDAO();
		BookBean bookBean = new BookBean();
		
		bookBean.setBookId(bookId);
		bookBean.setTitle(title);
		bookBean.setPrice(price);
		bookBean.setGrade(grade);
		
		int updateResult=0;
		updateResult = bookDAO.addBook(bookBean);
		
		return updateResult;
	}

}
