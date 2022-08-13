package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// 3���� �л� ������ ����� �� �ֵ��� ��ü �迭�� �Ҵ��ϰ� 
		// �����͸� �����Ͽ� 3���� �л� ��ü ���� �� �ݺ����� ���� ���
		Student[] arr1 = new Student[3];
		arr1[0] = new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�");
		arr1[1] = new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		arr1[2] = new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�");
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i].toString());
		}
		
		// �ִ� 10���� ��� ������ ����� �� �ְ� ��ü �迭�� �Ҵ��ϰ�
		// �ݺ����� ����Ͽ� Ű����� ��� ������ �Է¹޵��� ���� - while(true) ���� �ݺ��� �̿�
		// �Է¹��� ������� �Ű����� �����ڸ� �̿��Ͽ� ��ü�迭�� ��ü ����
		// �� �� �߰��� ������ ī��Ʈ
		// ��� �߰��� ������ ����� ��ҹ��� ��� ���� 'y'�̸� ��� ��ü �߰� 'n'�� ��� �׸� �Է� �޵��� ����
		// 2�� ������ ��� ������ �Է¹޾� �� ��ü�� �����ϰ� 
		// ������� ��ϵ� ������� ���� ���
		Employee[] arr2 = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("���� : ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			sc.nextLine();
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			
			arr2[count] = new Employee(name, age, height, weight, salary, dept);
			
			count++;
			
			System.out.print("��� �߰��Ͻðڽ��ϱ�?(�� : y, Y / �ƴϿ� : n, N) : ");
			char ch = sc.nextLine().charAt(0);
			if(ch == 'n' || ch == 'N') {
				break;
			}
			else if (ch == 'y' || ch == 'Y') {
				continue;
			}
			
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr2[i].toString());
		}
		
	}

}
