package com.kh.hw.run;

import com.kh.hw.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// ���̰� 3�� ��ü �迭�� ����� �ش� �ε������� �Ű����� �����ڸ� ���� ��ü ������ ����
		// information()�� ����Ͽ� ���
		// ���� ��� : 3�г� 1�� 1�� ȫ�浿
		//			4�г� 3�� 2�� �ڸ���
		//			2�г� 7�� 5�� ������
		
		Student[] arr = new Student[3];
		
		arr[0] = new Student(3, 1, 1, "ȫ�浿");
		arr[1] = new Student(4, 3, 2, "�ڸ���");
		arr[2] = new Student(2, 7, 5, "������");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i].information());
		}
	}

}
