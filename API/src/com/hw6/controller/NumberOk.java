package com.hw6.controller;

import java.util.Scanner;

public class NumberOk {
	
	// �ʵ��
	private int ran;
	
	// �����ں�
	public NumberOk() {
		
	}
	
	// �޼ҵ��
	public void numGame() {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100) + 1;
		
		ran = 1;
		
		while(true) {
			System.out.print("1���� 100 ������ ������ �ϳ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(random > num) {
				System.out.println(num + "���� Ů�ϴ�." + ran + "��° ����!!");
			}
			else if(random < num) {
				System.out.println(num + "���� �۽��ϴ�." + ran + "��° ����!!");
			}
			else {
				System.out.println(ran + "�� ���� ������ϴ�!");
				while(true) {
					System.out.print("��� �Ͻðڽ��ϱ�?(y/n) : ");
					char ch = sc.nextLine().toLowerCase().charAt(0);
					if(ch == 'y') {
						System.out.println();
						System.out.println("���ο� ������ �����մϴ�!!");
						ran = 0;
						break;
					}
					else if(ch == 'n') {
						System.out.println("������ �����մϴ�.");
						return;
					}
					else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					}
				}
			}
			ran++;
		}
			
	}
	
}
