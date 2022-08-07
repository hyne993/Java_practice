package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		// �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� �Է��ϸ� "OO�޴��Դϴ�"��,
		// ���� ��ȣ�� �Է��ϸ� "���α׷��� ����˴ϴ�"�� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		String str = " ";
		
		switch(num) {
		case 1 : str = "�Է�"; break;
		case 2 : str = "����"; break;
		case 3 : str = "��ȸ"; break;
		case 4 : str = "����"; break;
		case 9 : System.out.println("���α׷��� ����˴ϴ�."); return;
		}
		
		System.out.println(str + "�޴��Դϴ�");
		
	}
	
	
	public void practice2() {
		
		// Ű����� ������ �Է¹��� ������ ����̸鼭 ¦���� ���� "¦���̴�"�� ����ϰ�
		// ¦���� �ƴϸ� "Ȧ���̴�"�� ���
		// ����� �ƴϸ� "����� �Է����ּ���"�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		sc.nextLine(); 
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("¦���̴�");
			}
			else {
				System.out.println("Ȧ���̴�");
			}
		}
		else {
			System.out.println("����� �Է����ּ���");
		}
		
	}
	
	
	public void practice3() {
		
		// ����, ����, ���� �� ������ ������ Ű����� �Է¹ް� �հ�� ����� ����ϰ�
		// �հ�� ����� �̿��Ͽ� �հ� / ���հ��� ó���ϴ� ����� ����
		// �հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
		// �հ����� ��� ���� �� ������ �հ�, ���, "�����մϴ�. �հ��Դϴ�!"�� ����ϰ�
		// ���հ��� ��쿡�� "���հ��Դϴ�."�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�. �հ��Դϴ�!");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	
	public void practice4() {
		
		// switch���� ���
		// 1 ~ 12 ������ ������ �Է¹޾� ���� ��� "xx���� xx�Դϴ�."
		// 1 ~ 12�� �ƴ� ������ �ԷµǸ� "xx���� �߸� �Էµ� ���Դϴ�." ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String result = " ";
		
		switch(month) {
		case 3 : 
		case 4 :	
		case 5 : result = "��"; break;	
		case 6 :	
		case 7 :	
		case 8 : result = "����"; break;
		case 9 :
		case 10 :
		case 11 : result = "����"; break;
		case 12 :
		case 1 :
		case 2 : result = "�ܿ�"; break;
		default : System.out.println(month + "���� �߸� �Էµ� ���Դϴ�."); return;
		}
		
		System.out.println(month + "���� " + result + "�Դϴ�.");
		
	
	
	}
	
	
	public void practice5() {
		
		// ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ�
		// �α��� ���� �� "�α��� ����"
		// ���̵� Ʋ���� �� "���̵� Ʋ�Ƚ��ϴ�."
		// ��й�ȣ�� Ʋ���� �� "��й�ȣ�� Ʋ�Ƚ��ϴ�." ���
		
		String id1 = "heeyeon";
		String pwd1 = "hy1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id2 = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pwd2 = sc.nextLine();
		
		boolean b1 = id2.equals(id1);
		boolean b2 = pwd2.equals(pwd1);
		
		if(b1 == false) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		if(b2 == false) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} 
		if(b1 == true && b2 == true) {
			System.out.println("�α��� ����");
		}
		
	}
	
	
	public void practice6() {
		
		// ����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է¹޾� �� ����� ���� �� �ִ� ���� ���
		// �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� ����
		// ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� ����
		// ��ȸ���� �Խñ� ��ȸ�� ����
		// ��, �߸� �Է��Ͽ��� ��� "�߸� �Է��߽��ϴ�." ��� ��¹� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String rank = sc.nextLine();
		
		switch(rank) {
		case "������" : System.out.println("ȸ������, �Խñ� ����");
		case "ȸ��" : System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
		case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break;
		}
		
	}
	
	
	public void practice7() {
		
		// Ű, �����Ը� double�� �Է¹ް� BMI������ ����Ͽ� ������� ���� 
		// ��ü�� / ����ü�� / ��ü�� / ���� ���
		// BMI = ������ / (Ű(m) * Ű(m))
		// BMI�� 18.5�̸��� ��� ��ü��, 18.5�̻� 23�̸��� ��� ����ü��
		// 23�̻� 25�̸��� ��� ��ü��, 25�̻� 30�̸��� ��� ��, 30�̻��� ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		double bmi = weight / (height * height);
		System.out.println("BMI ���� :" + bmi);
		
		String result = " ";
		if(bmi < 18.5) {
			result = "��ü��";
		}
		else if(bmi < 23) {
			result = "����ü��";
		}
		else if(bmi < 25) {
			result = "��ü��";
		}
		else if(bmi < 30) {
			result = "��";
		}
		else {
			result = "����";
		}
		
		System.out.println(result);
	}
	
	
	public void practice8() {
		
		// Ű����� �ΰ��� ����� ���� ��ȣ�� �Է¹޾� ���� ��ȣ�� ���� ���� ����� ���
		// ��, ����� �ƴ� ���� �Է��ϰų� ���õǾ����� ���� �����ȣ�� �Է����� �� 
		// "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�." ���
		// �����ȣ : +, -, *, /, % 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(num1 > 0 && num2 > 0 ) {
			if(op == '+') {
				result = num1 + num2;
			}
			else if(op == '-') {
				result = num1 - num2;
			}
			else if(op == '*') {
				result = num1 * num2;
			}
			else if(op == '/') {
				result = num1 / num2;
			}
			else if(op == '%'){
				result = num1 % num2;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
			}
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return; 
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result );
	}
	
	
	public void practice9() {
		
		// �߰����, �⸻���, ��������, �⼮Ƚ���� �Է¹ް� Pass �Ǵ� Fail�� ���
		// ���� 100�� �� ������ ������ ���� : �߰����(20%) �⸻���(30%) ����(30%) �⼮(20%)
		// �� �� �⼮Ƚ���� �� ����Ƚ�� 20ȸ �߿��� �⼮�� ���� �Է�
		// ������ 70�� �̻��̸鼭 ��ü������ 70% �̻� �⼮�� ���� ��� Pass �ƴϸ� Fail ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int score1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�⸻ ��� ���� : ");
		int score2 = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ���� : ");
		int assign = sc.nextInt();
		sc.nextLine();
		System.out.print("�⼮ Ƚ�� : ");
		int attend = sc.nextInt();
		sc.nextLine();
		
		double sum = score1 * 0.2 + score2 * 0.3 + assign * 0.3 + attend * 5 * 0.2;
		
		System.out.println("==========���=========");
		if(sum >= 70 && attend > 20 * 0.7) {
			System.out.println("�߰� ��� ����(20) : " + score1 * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + score2 * 0.3);
			System.out.println("���� ���� (30) : " + assign * 0.3);
			System.out.println("�⼮ ���� (20) : " + attend * 5 * 0.2);
			System.out.println("���� : " + sum);
			System.out.println("PASS");
		}
		if(attend < 20 * 0.7) {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attend + "/20)");
		}
		if(sum < 70) {
			System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
		}
		
	}
	
	
	public void practice10() {
		
		// �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.printf("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	
	
}	

