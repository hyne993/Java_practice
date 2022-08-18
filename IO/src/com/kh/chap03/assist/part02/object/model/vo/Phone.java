package com.kh.chap03.assist.part02.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // 직렬화 선언
	
	// 필드부
	private String name;
	private int price;
	
	// 생성자부
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// 메소드부
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
}
