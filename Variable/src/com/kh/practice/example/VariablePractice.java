package com.kh.practice.example;

import java.util.Scanner;

public class VariablePractice {

	// 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하기
	// 출력형태 : 키 xxx.xx인 xx살 x자 xxx님 반갑습니다^^
	public void method1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		sc.nextLine();

		System.out.printf("키 %.2f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);

	}


	// 키보드로 정수 두 개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요
	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));

	}


	// 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double width = sc.nextDouble();
		sc.nextLine();

		System.out.print("세로 : ");
		double length = sc.nextDouble();
		sc.nextLine();

		System.out.println("면적 : " + (width * length));
		System.out.println("둘레 : " + (width + length) * 2);

	}


	// 영어 문자열 값을 키보드로 입력받아 앞의 문자 세 개를 출력하기
	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);

		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);

	}
}

