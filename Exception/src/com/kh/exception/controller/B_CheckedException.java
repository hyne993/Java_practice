package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	
	public void method1() {
		
		try {
			method2();
		} catch(IOException e) {
			System.out.println("예외 발생됨");
		}
	}
	
	// throws 방법
	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 문자열로만 입력 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자열이나 입력하세요 : ");

		String str = br.readLine();
		System.out.println("문자열의 길이 : " + str.length());
		
	}
	
}
