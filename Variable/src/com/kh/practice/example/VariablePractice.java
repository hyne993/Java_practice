package com.kh.practice.example;

import java.util.Scanner;

public class VariablePractice {

	// �̸�(String), ����(char), ����(int), Ű(double)�� ����ڿ��� �Է¹޾� ������ ���� ������ ��� ����ϱ�
	// ������� : Ű xxx.xx�� xx�� x�� xxx�� �ݰ����ϴ�^^
	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();

		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		sc.nextLine();

		System.out.printf("Ű %.2f�� %d�� %c�� %s�� �ݰ����ϴ�^^", height, age, gender, name);

	}


	// Ű����� ���� �� ���� �Է¹޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���
	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));

	}


	// Ű����� ����, ���� ���� �Ǽ������� �Է¹޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���
	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		double width = sc.nextDouble();
		sc.nextLine();

		System.out.print("���� : ");
		double length = sc.nextDouble();
		sc.nextLine();

		System.out.println("���� : " + (width * length));
		System.out.println("�ѷ� : " + (width + length) * 2);

	}


	// ���� ���ڿ� ���� Ű����� �Է¹޾� ���� ���� �� ���� ����ϱ�
	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);

		System.out.println("ù ��° ���� : " + ch1);
		System.out.println("�� ��° ���� : " + ch2);
		System.out.println("�� ��° ���� : " + ch3);

	}
}

