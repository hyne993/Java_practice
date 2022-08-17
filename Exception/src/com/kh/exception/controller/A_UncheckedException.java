package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	
	Scanner sc = new Scanner(System.in);
	
	// ArithmeticException
	public void method1() {
		
		// ����ڷκ��� �ΰ��� �������� �Է¹޾� ������ ���� ���
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ����(0 ����) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		

		try {
			int result = num1 / num2;
			System.out.println("������ ���� ��� : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
	
	
	// ArithmeticException
	// InputMismatchException
	public void method2() {
		
		System.out.print("���� �Է� (0 ����) : ");
		try {
			int num = sc.nextInt(); 
			sc.nextLine();
			
			int result = 10 / num; 
			System.out.println("������ ��� : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch(InputMismatchException e) {
			System.out.println("������ ����� �Է��ؾ��մϴ�.");
		} 
		
		System.out.println("���α׷� ����");
	}
	
	
	// ArrayIndextOutOfBoundsExcepton
	// NegativeArraySizeException
	public void method3() {
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		
		
		int size = sc.nextInt(); 
		sc.nextLine();
		

		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		} catch(NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		} catch(RuntimeException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		// �������� ������ �θ� ���� Ŭ������ �ڽ� ���� Ŭ������ catch���� �������� �ۼ��Ϸ��� 
		// => catch ���� ������ ������ ���� �ڽ� ���� Ŭ���� -> ������ ū �θ� ���� Ŭ���� ������ �ؾ���
		
		System.out.println("���α׷� ����");
	}
	
	
}
