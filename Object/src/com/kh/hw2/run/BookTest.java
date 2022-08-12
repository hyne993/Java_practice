package com.kh.hw2.run;

import com.kh.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		// 기본 생성자, 매개변수 생성자를 이용해 2개의 객체 생성 후 출력확인
		Book b1 = new Book();
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		
		System.out.println("=================================");
		
		// setter 메소드를 이용해 첫번째 객체값 수정 후 출력
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(b1.information());

		System.out.println("=================================");
		
		// getter 메소드를 이용해 할인율을 적용한 책 가격 출력
		System.out.println("도서명 = " + b1.getTitle());
		System.out.println("할인된 가격 = " + (int)(b1.getPrice() * (1 - b1.getDiscountRate())) + "원");
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " + (int)(b2.getPrice() * (1 - b2.getDiscountRate())) + "원");
	}

}
