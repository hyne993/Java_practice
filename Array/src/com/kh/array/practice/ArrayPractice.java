package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		// ���̰� 10�� ������ �迭�� ����� �ݺ����� �̿��Ͽ�
		// ������� �迭 �ε����� ���� �� �� ���� ������ ���� ���
		// ex) 1 2 3 4 5 6 7 8 9 10
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice2() {
		
		// ���̰� 10�� ������ �迭�� ����� �ݺ����� �̿��Ͽ� 
		// �������� �迭 �ε����� ���� �� �� ���� ���
		// ex) 10 9 8 7 6 5 4 3 2 1 
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice3() {
		
		// ����ڿ��� �Է¹��� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		// 1���� �Է¹��� ������ �迭�� �ʱ�ȭ �� �� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice4() {
		
		// ���̰� 5��  String�迭�� �����ϰ� "���", "��", "����", "������", "����"�� �ʱ�ȭ �� ��
		// �迭 �ε����� Ȱ���� ���� ���
		
		String[] fruits = new String[5];
		
		fruits[0] = "���";
		fruits[1] = "��";
		fruits[2] = "����";
		fruits[3] = "������";
		fruits[4] = "����";
		
		System.out.println(fruits[1]);
		
	}
	
	
	public void practice5() {
		
		// ���ڿ��� �Է¹޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� ���ִ���
		// ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
			
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.printf("\n%c�� ���� : %d\n", ch, count);
		
	}
	
	
	public void practice6() {
		
		// "��" ~ "��" ���ϱ��� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է¹޾�
		// �Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		// ������ ���� ���ڸ� �Է� �� "�߸� �Է��ϼ̽��ϴ�."�� ���
		
		String[] day = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 0 && num <= 6) {
			for(int i = 0; i < day.length; i++) {
				if(i == num) {
					System.out.print(day[i] + "����");
				}
			}
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	
	public void practice7() {
		
		// ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ� 
		// �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
		// �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int size = sc.nextInt();
		sc.nextLine();
	
		int[] arr = new int[size];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			arr[i] = num;
			sum += num;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n�� �� :" + sum);
	}
	
	
	public void practice8() {
		// 3 �̻��� Ȧ�� ������ �迭�� ũ��� �Է¹޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�
		// �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ���
		// �� �Է��� ������ Ȧ���� �ƴϰų� 3�̸��� ��� "�ٽ� �Է��ϼ���."�� ����ϰ�
		// �ٽ� ������ �Է¹޵��� �ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num % 2 == 1 && num > 3) {
				int[] arr = new int[num];
				for(int i = 0; i < (num - 1) / 2; i++) {
					arr[i] = i + 1;
				}
				for(int i = (num - 1) / 2; i < arr.length; i++) {
					arr[i] =  arr.length - i;
				}
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				return;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
	}
	
	
	public void practice9() {
		
		// ����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ� ������ "XX ġŲ ��� ����",
		// ������ "XX ġŲ�� ���� �޴��Դϴ�."�� ���
		// ��, ġŲ �޴��� ����ִ� �迭�� ������ ���ϱ�
		
		String[] chicken = {"�Ķ��̵�", "���", "����", "����", "���ſ����", "6��", "�彺", "ȣ����" }	;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(str)){
				System.out.println(str + "ġŲ ��� ����");
				return;
			}
		}
		
		System.out.println(str + "ġŲ�� ���� �޴��Դϴ�.");
	}

	
	public void practice10() {
		
		// 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		// 1 ~ 10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ���
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice11() {
		
		// 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ� 1 ~ 10 ������ ������ �߻�����
		// �迭�� �ʱ�ȭ�� ��, �迭 ��ü ���� �� �� �߿� �ִ밪�� �ּҰ��� ���
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	
	
	public void practice12() {
		
		// 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		// 1 ~ 10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ���
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice13() {
		
		// �ֹε�Ϲ�ȣ�� String���ڿ��� �Է¹ް� �Է¹��� �� ���ڿ��� �� �ε����� ���ڸ�
		// char[]�� �Ű� ��� (��, ���� �ڸ� ���ĺ��ʹ� *�� ���)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String personId = sc.nextLine();
		
		char[] arr = new char[personId.length()];
		
		for(int i = 0; i < arr.length; i++) {
			if(i <= 7 ) {
				arr[i] = personId.charAt(i);
			}
			else {
				arr[i] = '*';
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	
	public void practice14() {
		
		// �ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϵ� �ߺ��� ���� ������������ �����Ͽ� ���
		// (1 ~ 45 ������ �� 6�� �߻�)--
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
	
}
