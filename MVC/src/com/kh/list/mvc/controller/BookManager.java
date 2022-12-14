package com.kh.list.mvc.controller;

import java.util.ArrayList;

import com.kh.list.mvc.model.vo.Book;

public class BookManager {
	
	ArrayList<Book> bookList = new ArrayList<>();
	
	public void insertBook(Book book) {
		
		int lastNo = 0;
		
		try {
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
		} catch(ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
		} 
		
		book.setbNo(lastNo);
		bookList.add(book);
	}
	
	
	public int deleteBook(int bNo) {
		
		int result = 0; 
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getbNo() == bNo) {
				bookList.remove(i--);
				result++;
			}
		}
		
		return result;
	}
	
	
	public ArrayList<Book> searchBook(String title){
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(Book b : bookList) {
			if(b.getTitle().equals(title)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}
	
	
	public ArrayList<Book> selectList(){
		
		return bookList;
	}
	
}
