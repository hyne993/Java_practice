package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		// 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값으 다음과 같이 출력
		// ex) 1 2 3 4 5 6 7 8 9 10
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice2() {
		
		// 길이가 10인 정수형 배열을 만들고 반복문을 이용하여 
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력
		// ex) 10 9 8 7 6 5 4 3 2 1 
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice3() {
		
		// 사용자에게 입력받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화 한 후 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice4() {
		
		// 길이가 5인  String배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"로 초기화 한 후
		// 배열 인덱스를 활용해 귤을 출력
		
		String[] fruits = new String[5];
		
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		
		System.out.println(fruits[1]);
		
	}
	
	
	public void practice5() {
		
		// 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
			
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.printf("\n%c의 개수 : %d\n", ch, count);
		
	}
	
	
	public void practice6() {
		
		// "월" ~ "일" 요일까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다."를 출력
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num >= 0 && num <= 6) {
			for(int i = 0; i < day.length; i++) {
				if(i == num) {
					System.out.print(day[i] + "요일");
				}
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	
	public void practice7() {
		
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		sc.nextLine();
	
		int[] arr = new int[size];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			arr[i] = num;
			sum += num;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 :" + sum);
	}
	
	
	public void practice8() {
		// 3 이상인 홀수 정수를 배열의 크기로 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력
		// 단 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요."를 출력하고
		// 다시 정수를 입력받도록 하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num % 2 == 1 && num > 3) {
				int[] arr = new int[num];
				for(int i = 0; i < (num - 1) / 2; i++) {
					arr[i] = i + 1;
				}
				for(int i = (num - 1) / 2; i < arr.length; i++) {
					arr[i] =  arr.length - i;
				}
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				return;
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		
	}
	
	
	public void practice9() {
		
		// 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 "XX 치킨 배달 가능",
		// 없으면 "XX 치킨은 없는 메뉴입니다."를 출력
		// 단, 치킨 메뉴가 들어있는 배열은 스스로 정하기
		
		String[] chicken = {"후라이드", "양념", "간지", "고추", "더매운고추", "6초", "장스", "호랑이" }	;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(str)){
				System.out.println(str + "치킨 배달 가능");
				return;
			}
		}
		
		System.out.println(str + "치킨은 없는 메뉴입니다.");
	}

	
	public void practice10() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화한 후 출력
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice11() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1 ~ 10 사이의 난수를 발생시켜
		// 배열에 초기화한 후, 배열 전체 값과 그 값 중에 최대값과 최소값을 출력
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	public void practice12() {
		
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1 ~ 10 사이의 난수를 발생시켜 중복된 값이 없게 배열을 초기화한 후 출력
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice13() {
		
		// 주민등록번호를 String문자열로 입력받고 입력받은 그 문자열의 각 인덱스별 문자를
		// char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String personId = sc.nextLine();
		
		char[] arr = new char[personId.length()];
		
		for(int i = 0; i < arr.length; i++) {
			if(i <= 7 ) {
				arr[i] = personId.charAt(i);
			}
			else {
				arr[i] = '*';
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	
	public void practice14() {
		
		// 로또 번호 자동 생성기 프로그램을 작성하되 중복값 없이 오름차순으로 정렬하여 출력
		// (1 ~ 45 사이의 수 6개 발생)--
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}
	
}
