package com.kh.field.example.model.vo;

public class Circle {
	
	// ����� �޼ҵ�� �⺻ �����ڸ� ���� CircleŸ���� ��ü�� ������ �� ���� �ѷ�, ���� �� ���
	// incrementRadius() �޼ҵ带 ���� �������� 1 ������Ų ��, �ٽ� ���� �ѷ�, ���̰� ���
	
	public static final double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius += 1;
	}
	
	public void getAreaOfCircle() {
		System.out.println("���� ���� : " + radius * radius * PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println("���� �ѷ� : " + 2 * radius * PI);
	}
	
	
}
