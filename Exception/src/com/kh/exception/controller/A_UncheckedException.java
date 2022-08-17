package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	
	Scanner sc = new Scanner(System.in);
	
	// ArithmeticException
	public void method1() {
		
		// 사용자로부터 두개의 정수값을 입력받아 나눗셈 연산 출력
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수(0 제외) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		

		try {
			int result = num1 / num2;
			System.out.println("나눗셈 연산 결과 : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 종료");
	}
	
	
	// ArithmeticException
	// InputMismatchException
	public void method2() {
		
		System.out.print("정수 입력 (0 제외) : ");
		try {
			int num = sc.nextInt(); 
			sc.nextLine();
			
			int result = 10 / num; 
			System.out.println("나눗셈 결과 : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("정수로 제대로 입력해야합니다.");
		} 
		
		System.out.println("프로그램 종료");
	}
	
	
	// ArrayIndextOutOfBoundsExcepton
	// NegativeArraySizeException
	public void method3() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		
		
		int size = sc.nextInt(); 
		sc.nextLine();
		

		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		} catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로는 음수를 제시할 수 없습니다.");
		} catch(RuntimeException e) {
			System.out.println("예외가 발생했습니다.");
		}
		// 다형성을 적용해 부모 예외 클래스와 자식 예외 클래스의 catch블럭을 다중으로 작성하려면 
		// => catch 블럭의 순서를 범위가 작은 자식 예외 클래스 -> 범위가 큰 부모 예외 클래스 순으로 해야함
		
		System.out.println("프로그램 종료");
	}
	
	
}
