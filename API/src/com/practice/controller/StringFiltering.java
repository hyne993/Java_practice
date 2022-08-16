package com.practice.controller;

import java.util.Scanner;

public class StringFiltering {

	public void method1() {
		
		/*
		 * 욕설 필터링 프로그램
		 * 
		 * 사용자에게 문장을 하나 입력받습니다
		 * 다음 제시되는 단어에 해당할 경우 *으로 대체해서 출력하도록 구현해보기
		 * 
		 * - 신발끈, 개나리, 수박씨, 호루라기, 시베리아, 십장생, 조카, 주옥, 쌍쌍바, 십자수, 식빵
		 * 
		 * ex) 이런 신발끈같은 개나리 호루라기야!!!
		 * => 이런 ***같은 *** *****야!!!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		String curse = "신발끈, 개나리, 수박씨, 호루라기, 시베리아, 십장생, 조카, 주옥, 쌍쌍바, 십자수, 식빵";
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
		 * 욕설 필터링 프로그램 ver.2 
		 * 
		 * 사용자에게 문장을 하나 입력받습니다
		 * 다음 제시되는 단어에 해당할 경우 첫글자를 제외하고 *으로 대체해서 출력하도록 구현해보기
		 * 
		 * - 신발끈, 개나리, 수박씨, 호루라기, 시베리아, 십장생, 조카, 주옥, 쌍쌍바, 십자수, 식빵
		 * 
		 * ex) 이런 신발끈같은 개나리 호루라기야!!!
		 * => 이런 신**같은 개** 호****야!!!
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		String curse = "신발끈, 개나리, 수박씨, 호루라기, 시베리아, 십장생, 조카, 주옥, 쌍쌍바, 십자수, 식빵";
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
