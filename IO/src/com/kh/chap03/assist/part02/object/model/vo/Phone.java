package com.kh.chap03.assist.part02.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable { // ����ȭ ����
	
	// �ʵ��
	private String name;
	private int price;
	
	// �����ں�
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// �޼ҵ��
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
