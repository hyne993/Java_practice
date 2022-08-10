package com.kh.hw2.run;

import java.util.Scanner;

import com.kh.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// �ִ� 10���� �л� ������ ����� �� �ְ� ��ü �迭�� �Ҵ��ϰ�
		// �ݺ����� ����Ͽ� Ű����� �л� ������ �Է¹޵��� ����
		// while(true)���� int count�� 1�� ������Ű�鼭 ����
		// ��� �߰��� �������� ����� 'n'�� �Է½� �ݺ��� ��������
		Student[] arr = new Student[10];
		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		while(true) {
			
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			arr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			count++;
			
			System.out.print("���Ḧ ���Ͻø� n��, ��� �߰��� ���Ͻø� �� ���� ���� �Է��ϼ��� : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' ) {
				break;
			}
			
			
			
		}
			
		
		// 3���� �л� ������ �Է¹޾�, �� ��ü�� ����
		// ����  ��    �̸�    ��������     ��������    ��������
		//  1  5    ȫ�浿      40		  60	 70  
		//	2  1    �踻��	  70      80     100
		//	3  3    ������     100      75     86
		
		// ���� ��ϵ� �л����� ������ �� �л��� ��� ������ ���
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i].information());
			System.out.println(", ��� ���� : " + (arr[i].getKor() + arr[i].getEng() + arr[i].getMath()) / 3);
		}
		
	}

}
