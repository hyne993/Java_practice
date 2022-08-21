package com.kh.list.mvc.model.vo;

public class Book {
	
	// �ʵ��
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	// �����ں�
	public Book() {
		
	}
	
	public Book(String title, int category, String author) {
		this.title = title;
		this.category = category;
		this.author = author;
	}
	
	// �޼ҵ��
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
		case 1 : newCategory = "�ι�"; break;
		case 2 : newCategory = "�ڿ�����"; break;
		case 3 : newCategory = "�Ƿ�"; break;
		case 4 : newCategory = "��Ÿ"; break;
		}
		
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + newCategory + ", author=" + author + "]";
	}
}
