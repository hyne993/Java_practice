package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		// Ű����� �Է¹��� �ϳ��� ������ ����̸� "����̴�"
		// ����� �ƴϸ� "����� �ƴϴ�"�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String result = (num > 0) ? "����̴�" : "����� �ƴϴ�";
		
		System.out.println(result);
		
	}
	
	
	public void practice2() {
		
		// Ű����� �Է¹��� �ϳ��� ������ ����̸� "����̴�"
		// ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "�����̴�"�� ���
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String result = (num > 0) ? "����̴�" : ((num == 0) ? "0�̴�" : "�����̴�");
		
		System.out.println(result);
	
	}
	
	
	public void practice3() {
		
		// Ű����� �Է¹��� �ϳ��� ������ ¦���̸� "¦���̴�"
		// ¦���� �ƴϸ� "Ȧ���̴�"�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String result = (num % 2 == 0) ? "¦���̴�" : "Ȧ���̴�";
		
		System.out.println(result);
		
	}
	
	
	public void practice4() {
		
		// ��� ����� ������ ���� ������������ ��
		// �ο� ���� ���� ������ Ű����� �Է¹ް�
		// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ���� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1�δ� ���� ���� : " + (candy / person));
		System.out.println("���� ���� ���� : " + (candy % person));
	
	}
	
	
	public void practice5() {
		
		// Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ���
		// �̸�, �г�, ��, ��ȣ, ����(M/F), ����(�Ҽ��� �Ƹ� ��° �ڸ�����)
		// �̶� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��(���ڸ�) : ");
		int ban = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String student = (gender == 'M') ? "���л�" : "���л�";
		
		System.out.print("����(�Ҽ��� �Ƹ� ��° �ڸ�����) : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", grade, ban, num, name, student, score);
		
	}
	
	public void practice6() {
		
		// Ű����� ���̸� �Է¹޾� ���(13�� ����)����,
		// û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		// ����(19�� �ʰ�)���� ��� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		String result = (age <= 13) ? "���" : ((age > 13 && age <= 19) ? "û�ҳ�" : "����");
		
		System.out.println(result);
		
	}
	
	
	public void practice7() {
		
		// ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է¹ް�
		// �� ���� ���� �հ�� ����� ���
		// �� ������ ������ ����� ������ �հ� ���θ� ó��
		// �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�";
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println(result);
		
	}
	
	
	public void practice8() {
		
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String personId = sc.nextLine();
		
		String gender = (personId.charAt(7) == '1' || personId.charAt(7) == '3') ? "����" : ((personId.charAt(7) == '2' || personId.charAt(7) == '4') ? "����" : "�߸� �Է��߽��ϴ�.");
		
		System.out.println(gender);
		
	}
	
	
	public void practice9() {
		
		// Ű����� ���� �ΰ��� �Է¹޾� ���� ���� num1, num2�� ����
		// �� �ٸ� ������ �Է¹޾� �� ����  num1 ���ϰų� num2 �ʰ��̸� true ���
		// �ƴϸ�  false (�Է��� �� num1��  num2���� �۾ƾ���)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����2(����1���� ū ��) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�Է� : ");
		int input =  sc.nextInt();
		sc.nextLine();
		
		boolean result = (input <= num1 | input > num2) ? true : false;
		
		System.out.println(result);
		
	}
	
	
	public void practice10() {
		
		// 3���� ���� Ű����� �Է¹޾� �Է¹��� ���� ��� ������  true �ƴϸ� false ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�Է�3 : ");
		int num3 =  sc.nextInt();
		sc.nextLine();
		
		boolean result = (num1 == num2 && num2 == num3) ? true : false;
	
		System.out.println(result);
	}
	
}
