package com.kh.hw2.run;

import com.kh.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		// �⺻ ������, �Ű����� �����ڸ� �̿��� 2���� ��ü ���� �� ���Ȯ��
		Book b1 = new Book();
		Book b2 = new Book("�ڹ�������", 20000, 0.2, "����");
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		
		System.out.println("=================================");
		
		// setter �޼ҵ带 �̿��� ù��° ��ü�� ���� �� ���
		b1.setTitle("C���");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("ȫ�浿");
		
		System.out.println("������ ��� Ȯ��");
		System.out.println(b1.information());

		System.out.println("=================================");
		
		// getter �޼ҵ带 �̿��� �������� ������ å ���� ���
		System.out.println("������ = " + b1.getTitle());
		System.out.println("���ε� ���� = " + (int)(b1.getPrice() * (1 - b1.getDiscountRate())) + "��");
		System.out.println("������ = " + b2.getTitle());
		System.out.println("���ε� ���� = " + (int)(b2.getPrice() * (1 - b2.getDiscountRate())) + "��");
	}

}