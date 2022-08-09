package com.kh.chap01.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1(){
		
		// 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력
		// 단 입력한 수는 1보다 크거나 같아야함
		// 만일 1 미만의 숫자가 입력됐다면 "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	
	public void practice2() {
		
		// practice1() 과 동일하나 1미만의 숫자가 입력되면
		// "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서 사용자가 다시 값을 입력하도록 하세요
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " "); 
				}
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	
	}
	
	
	public void practice3() {
		
		// 사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지 모든 숫자를 거꾸로 출력
		// 단, 입력한 수는 1보다 크거나 같아야 함 - for문 이용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	
	}
	
	
	public void practice4() {
		
		// practice3()문제오 동일하나 1 미만의 숫자가 입력됐다면
		// "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서 사용자가 다시 값을 입력하도록 하기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num >= 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
	
	
	public void practice5() {
		
		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을 for문을 이용하여 출력
		// 1 + 2 + .. + x = xx 형태로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int sum = 1;
		System.out.print(1);
		
		for(int i = 2; i <= num; i++) {
			System.out.print(" + " + i);
			sum += i;
		}
		
		System.out.println(" = " + sum);
	}
	
	
	public void practice6() {
		
		// 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력
		// 만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자만ㅇ르 입력해주세요"를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 >= 1 && num2 >= 1) {
			
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
				
			}
			else {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
			
		}
		else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
		
	}
	
	
	public void practice7() {
		// practice6()과 동일하나 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하기
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if(num1 >= 1 && num2 >= 1) {
				
				if(num1 > num2) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					} 
					break;
					
				} 
				else {
					for(int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}; 
					break;
				} 
				
			}
			else {
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}
			
		}
		
	}
	
	
	public void practice8() {
		
		// 사용자로부터 입력받은 숫자의 단을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");	
		int num = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
		
	}
	
	
	public void practice9() {
		
		// 사용자로부터 입력받은 숫자의 단부터 9단까지 출력
		// 단 2 ~ 9 사이의 숫자가 아닌 경우 "2 ~ 9 사이의 숫자만 입력해주세요."를 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");	
		int num = sc.nextInt(); 
		sc.nextLine();
		
		if(num >= 2 && num <= 9) {
			for(int i = num ; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
			}
		}
		else {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
		}
		
	}
	
	
	public void practice10() {
		
		// practice9() 문제와 동일하나 2 ~ 9 사이의 숫자가 아닌 값이 입력됐다면 
		//  "2 ~ 9 사이의 숫자만 입력해주세요."를 출력되면서 다시 사용자가 값을 입력하게 하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");	
			int num = sc.nextInt(); 
			sc.nextLine();
			
			if(num >= 2 && num <= 9) {
				for(int i = num ; i <= 9; i++) {
					System.out.println("===== " + i + "단 =====");
					
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, (i * j));
					}
				} 
				break;
			}
			else {
				System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
			}
		}
		
	}
	
	
	public void practice11() {
		
		// 사용자로부터 시작 숫자와 공차를 입력받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램 구현
		// 추력되는 숫자는 총 10개
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");	
		int start = sc.nextInt(); 
		sc.nextLine();
		System.out.print("공차 : ");	
		int diff = sc.nextInt(); 
		sc.nextLine();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(start + " ");
			start += diff;
		}
		
	}
	
	
	public void practice12() {
		
		// 정수 두개와 연산자(문자열)를 입력받고 입력된 연산자에 따라 알맞은 결과 출력
		// 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올 때까지 무한 반복하며
		// exit가 들어오면 "프로그램을 종료합니다."를 출력하고 종료
		// 또한 연산자가 나누기이면서 두번째 정수가 0이 들어오면 "0으로 나눌 수 없습니다. 다시 입력해주세요." 라고 출력하며
		// 없는 연산자그 들어올 시  "없는 연산자입니다. 다시 입력해주세요." 라고 출력하고
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");	
			String op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.print("정수1 : ");	
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.print("정수2 : ");	
			int num2 = sc.nextInt();
			sc.nextLine();
			
			int result = 0;
			if(op.equals("+")) {
				result = num1 + num2;
			}
			else if(op.equals("-")) {
				result = num1 - num2;
			}
			else if(op.equals("*")) {
				result = num1 * num2;
			}
			else if(op.equals("/")) {
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 / num2;
			}
			else if(op.equals("%")) {
				result = num1 % num2;
			}
			else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
		}
		
	}
	
}
