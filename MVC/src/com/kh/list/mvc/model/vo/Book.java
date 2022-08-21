package com.kh.list.mvc.model.vo;

public class Book {
	
	// 필드부
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	// 생성자부
	public Book() {
		
	}
	
	public Book(String title, int category, String author) {
		this.title = title;
		this.category = category;
		this.author = author;
	}
	
	// 메소드부
	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		
		String newCategory = "";
		
		switch(category) {
		case 1 : newCategory = "인문"; break;
		case 2 : newCategory = "자연과학"; break;
		case 3 : newCategory = "의료"; break;
		case 4 : newCategory = "기타"; break;
		}
		
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + newCategory + ", author=" + author + "]";
	}
}
