package com.kh.practice.example;

import java.util.Scanner;

public class CastingPractice {
	
	
	public void method1() {
		
		// Ű����� ���� �ϳ��� �Է¹޾� �� ���ڿ� �� ������ �����ڵ� ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		String str = sc.nextLine();
		
		char ch = str.charAt(0);
		
		int num = ch;
		
		System.out.printf("%c Unicode : %d\n", ch, num);
		
	}
	
	
	public void method2() {
		
		// �Ǽ������� ����, ����, ���� �� ������ ������ �Է¹޾� ������ ��� ���ϱ�
		// �� ��, ������ ����� ���������� ó��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		sc.nextLine();
		
		int total = (int)(kor + eng + math);
		int average = (int)((kor + eng + math) / 3);
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
	}
	
	
	public void method3() {
		
		// ���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����(+, -, *, /)��
		// ����ȯ�� �̿��Ͽ� �ּ��� ���� ���� ���� ���� �������� �ڵ� �ۼ�
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int) dNum); // 2
		
		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		
		System.out.println((double)iNum1 /( double)iNum2); // 2.5
		System.out.println(dNum); // 2.5
		
		System.out.println((int)fNum); // 3
		System.out.println(iNum1 / (int)fNum); //3
		
		System.out.println(iNum1 / fNum); // 3.3333333
		System.out.println((double)iNum1 / fNum); // 3.333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch + iNum1); // 75
		System.out.println((char)(ch + iNum1)); // 'K'
		
	}
	
	
}
