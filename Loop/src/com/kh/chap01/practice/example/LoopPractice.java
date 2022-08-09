package com.kh.chap01.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1(){
		
		// ����ڷκ��� �� ���� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڵ��� ��� ���
		// �� �Է��� ���� 1���� ũ�ų� ���ƾ���
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "�߸� �Է��ϼ̽��ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	
	public void practice2() {
		
		// practice1() �� �����ϳ� 1�̸��� ���ڰ� �ԷµǸ�
		// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."�� ��µǸ鼭 ����ڰ� �ٽ� ���� �Է��ϵ��� �ϼ���
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " "); 
				}
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	
	}
	
	
	public void practice3() {
		
		// ����ڷκ��� �Ѱ��� ���� �Է¹޾� 1���� �� ���ڱ��� ��� ���ڸ� �Ųٷ� ���
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �� - for�� �̿�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	
	}
	
	
	public void practice4() {
		
		// practice3()������ �����ϳ� 1 �̸��� ���ڰ� �Էµƴٸ�
		// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."�� ��µǸ鼭 ����ڰ� �ٽ� ���� �Է��ϵ��� �ϱ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num >= 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}
	
	
	public void practice5() {
		
		// 1���� ����ڿ��� �Է¹��� �������� �������� ���� for���� �̿��Ͽ� ���
		// 1 + 2 + .. + x = xx ���·� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int sum = 1;
		System.out.print(1);
		
		for(int i = 2; i <= num; i++) {
			System.out.print(" + " + i);
			sum += i;
		}
		
		System.out.println(" = " + sum);
	}
	
	
	public void practice6() {
		
		// ����ڷκ��� �� ���� ���� �Է¹޾� �� ������ ���ڸ� ��� ���
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ����� �Է����ּ���"�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 >= 1 && num2 >= 1) {
			
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
				
			}
			else {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
			
		}
		else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}
		
	}
	
	
	public void practice7() {
		// practice6()�� �����ϳ� 1 �̸��� ���ڰ� �Էµƴٸ�
		// "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if(num1 >= 1 && num2 >= 1) {
				
				if(num1 > num2) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					} 
					break;
					
				} 
				else {
					for(int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}; 
					break;
				} 
				
			}
			else {
				System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
			}
			
		}
		
	}
	
	
	public void practice8() {
		
		// ����ڷκ��� �Է¹��� ������ ���� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");	
		int num = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("===== " + num + "�� =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
		
	}
	
	
	public void practice9() {
		
		// ����ڷκ��� �Է¹��� ������ �ܺ��� 9�ܱ��� ���
		// �� 2 ~ 9 ������ ���ڰ� �ƴ� ��� "2 ~ 9 ������ ���ڸ� �Է����ּ���."�� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");	
		int num = sc.nextInt(); 
		sc.nextLine();
		
		if(num >= 2 && num <= 9) {
			for(int i = num ; i <= 9; i++) {
				System.out.println("===== " + i + "�� =====");
				
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		}
		else {
			System.out.println("2 ~ 9 ������ ���ڸ� �Է����ּ���.");
		}
		
	}
	
	
	public void practice10() {
		
		// practice9() ������ �����ϳ� 2 ~ 9 ������ ���ڰ� �ƴ� ���� �Էµƴٸ� 
		//  "2 ~ 9 ������ ���ڸ� �Է����ּ���."�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϰ� �ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");	
			int num = sc.nextInt(); 
			sc.nextLine();
			
			if(num >= 2 && num <= 9) {
				for(int i = num ; i <= 9; i++) {
					System.out.println("===== " + i + "�� =====");
					
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, (i * j));
					}
				} 
				break;
			}
			else {
				System.out.println("2 ~ 9 ������ ���ڸ� �Է����ּ���.");
			}
		}
		
	}
	
	
	public void practice11() {
		
		// ����ڷκ��� ���� ���ڿ� ������ �Է¹޾� ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷� ����
		// �߷µǴ� ���ڴ� �� 10��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");	
		int start = sc.nextInt(); 
		sc.nextLine();
		System.out.print("���� : ");	
		int diff = sc.nextInt(); 
		sc.nextLine();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(start + " ");
			start += diff;
		}
		
	}
	
	
	public void practice12() {
		
		// ���� �ΰ��� ������(���ڿ�)�� �Է¹ް� �Էµ� �����ڿ� ���� �˸��� ��� ���
		// ��, �ش� ���α׷��� ������ �Է¿� "exit"��� ���� ���� ������ ���� �ݺ��ϸ�
		// exit�� ������ "���α׷��� �����մϴ�."�� ����ϰ� ����
		// ���� �����ڰ� �������̸鼭 �ι�° ������ 0�� ������ "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���." ��� ����ϸ�
		// ���� �����ڱ� ���� ��  "���� �������Դϴ�. �ٽ� �Է����ּ���." ��� ����ϰ�
		// �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("������(+, -, *, /, %) : ");	
			String op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			System.out.print("����1 : ");	
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.print("����2 : ");	
			int num2 = sc.nextInt();
			sc.nextLine();
			
			int result = 0;
			if(op.equals("+")) {
				result = num1 + num2;
			}
			else if(op.equals("-")) {
				result = num1 - num2;
			}
			else if(op.equals("*")) {
				result = num1 * num2;
			}
			else if(op.equals("/")) {
				if(num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				result = num1 / num2;
			}
			else if(op.equals("%")) {
				result = num1 % num2;
			}
			else {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
		}
		
	}
	
}
