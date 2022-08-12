package com.kh.field.example.model.vo;

public class Circle {
	
	// 실행용 메소드로 기본 생성자를 통해 Circle타입의 객체를 생성한 후 원의 둘레, 넓이 값 출력
	// incrementRadius() 메소드를 통해 반지름을 1 증가시킨 후, 다시 원의 둘레, 넓이값 출력
	
	public static final double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius += 1;
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : " + radius * radius * PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + 2 * radius * PI);
	}
	
	
}
