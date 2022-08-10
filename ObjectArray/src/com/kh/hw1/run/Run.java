package com.kh.hw1.run;

import com.kh.hw1.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		// 3���� ��������� �迭�� ���� ������ �� ���
		// 0�� �ε����� �⺻������ �̿�. 1�� �ε����� �Ű����� 6��¥�� �����ڸ� �̿�. 2�� �ε����� �Ű����� ��ü�� ������ �̿�
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee();
		arr[1] = new Employee(1, "ȫ�浿", 19, 'M', "01022223333", "���� ���");
		arr[2] = new Employee(2, "������", "������", "����", 20, 'F', 1000000, 0.01, "01011112222", "���� ����");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("emp["+ i +"] : " + arr[i].information());
		}
		
		// ��ü�� �� ���� ���� �ʵ忡�� setter�� ���� ���� ���� �����ϴ� �� �ٽ� ���
		arr[0].setEmpNo(0);
		arr[0].setEmpName("�踻��");
		arr[0].setDept("������");
		arr[0].setJob("����");
		arr[0].setAge(30);
		arr[0].setGender('M');
		arr[0].setSalary(3000000);
		arr[0].setBonusPoint(0.2);
		arr[0].setPhone("01055559999");
		arr[0].setAddress("���� ����");
		
		arr[1].setDept("��ȹ��");
		arr[1].setJob("����");
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		
		System.out.println("========================================================================");
		for(int i = 0; i < 2; i++) {
			System.out.println("emp[" + i + "] : " + arr[i].information());
		}
		
		// ���� ������ ���ʽ��� ����� ������ ����Ͽ� ����ϰ�
		// �� ���� ������ ����� ���Ͽ� ���
		System.out.println("========================================================================");
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i].getEmpName() + "�� ���� : " + (int)(arr[i].getSalary() * (1 + arr[i].getBonusPoint()) * 12) + "��");
			sum += arr[i].getSalary() * (1 + arr[i].getBonusPoint()) * 12;
		}
		System.out.println("========================================================================");
		System.out.println("�������� ������ ��� : " + sum / arr.length + "��");
	}
	
	
}
