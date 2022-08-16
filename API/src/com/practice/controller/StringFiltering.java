package com.practice.controller;

import java.util.Scanner;

public class StringFiltering {

	public void method1() {
		
		/*
		 * �弳 ���͸� ���α׷�
		 * 
		 * ����ڿ��� ������ �ϳ� �Է¹޽��ϴ�
		 * ���� ���õǴ� �ܾ �ش��� ��� *���� ��ü�ؼ� ����ϵ��� �����غ���
		 * 
		 * - �Ź߲�, ������, ���ھ�, ȣ����, �ú�����, �����, ��ī, �ֿ�, �ֹֽ�, ���ڼ�, �Ļ�
		 * 
		 * ex) �̷� �Ź߲����� ������ ȣ�����!!!
		 * => �̷� ***���� *** *****��!!!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		String curse = "�Ź߲�, ������, ���ھ�, ȣ����, �ú�����, �����, ��ī, �ֿ�, �ֹֽ�, ���ڼ�, �Ļ�";
		String[] arr = curse.split(", ");
		
		for(String s : arr) {
			String star = "";
			for(int i = 0; i < s.length(); i++) {
				star = star.concat("*");
			}
			str = str.replace(s, star);
		}	
		System.out.println(str);
	}
	
	
	
	public void method2() {
		/*
		 * �弳 ���͸� ���α׷� ver.2 
		 * 
		 * ����ڿ��� ������ �ϳ� �Է¹޽��ϴ�
		 * ���� ���õǴ� �ܾ �ش��� ��� ù���ڸ� �����ϰ� *���� ��ü�ؼ� ����ϵ��� �����غ���
		 * 
		 * - �Ź߲�, ������, ���ھ�, ȣ����, �ú�����, �����, ��ī, �ֿ�, �ֹֽ�, ���ڼ�, �Ļ�
		 * 
		 * ex) �̷� �Ź߲����� ������ ȣ�����!!!
		 * => �̷� ��**���� ��** ȣ****��!!!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		String curse = "�Ź߲�, ������, ���ھ�, ȣ����, �ú�����, �����, ��ī, �ֿ�, �ֹֽ�, ���ڼ�, �Ļ�";
		String[] arr = curse.split(", ");
		
		for(String s : arr) {
			String star = "" + s.charAt(0);
			for(int i = 0; i < s.length() - 1; i++) {
				star = star.concat("*");
			}
			str = str.replace(s, star);
		}	
		System.out.println(str);
		
		
		
	}
}
