package com.hw6.controller;

import java.util.Scanner;

public class NumberOk {
	
	// 필드부
	private int ran;
	
	// 생성자부
	public NumberOk() {
		
	}
	
	// 메소드부
	public void numGame() {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100) + 1;
		
		ran = 1;
		
		while(true) {
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(random > num) {
				System.out.println(num + "보다 큽니다." + ran + "번째 실패!!");
			}
			else if(random < num) {
				System.out.println(num + "보다 작습니다." + ran + "번째 실패!!");
			}
			else {
				System.out.println(ran + "번 만에 맞췄습니다!");
				while(true) {
					System.out.print("계속 하시겠습니까?(y/n) : ");
					char ch = sc.nextLine().toLowerCase().charAt(0);
					if(ch == 'y') {
						System.out.println();
						System.out.println("새로운 게임을 시작합니다!!");
						ran = 0;
						break;
					}
					else if(ch == 'n') {
						System.out.println("게임을 종료합니다.");
						return;
					}
					else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
			}
			ran++;
		}
			
	}
	
}
