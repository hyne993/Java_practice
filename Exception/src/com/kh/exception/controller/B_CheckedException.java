package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	
	public void method1() {
		
		try {
			method2();
		} catch(IOException e) {
			System.out.println("���� �߻���");
		}
	}
	
	// throws ���
	public void method2() throws IOException {
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü (��, ���ڿ��θ� �Է� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ��� : ");

		String str = br.readLine();
		System.out.println("���ڿ��� ���� : " + str.length());
		
	}
	
}
