package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		// 키보드로 입력받은 하나의 정수가 양수이면 "양수이다"
		// 양수가 아니면 "양수가 아니다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String result = (num > 0) ? "양수이다" : "양수가 아니다";
		
		System.out.println(result);
		
	}
	
	
	public void practice2() {
		
		// 키보드로 입력받은 하나의 정수가 양수이면 "양수이다"
		// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수이다"를 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String result = (num > 0) ? "양수이다" : ((num == 0) ? "0이다" : "음수이다");
		
		System.out.println(result);
	
	}
	
	
	public void practice3() {
		
		// 키보드로 입력받은 하나의 정수가 짝수이면 "짝수이다"
		// 짝수가 아니면 "홀수이다"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
		
		System.out.println(result);
		
	}
	
	
	public void practice4() {
		
		// 모든 사람이 사탕을 골고루 나눠가지려고 함
		// 인원 수와 사탕 개수를 키보드로 입력받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕 개수를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 사탕 개수 : " + (candy / person));
		System.out.println("남는 사탕 개수 : " + (candy % person));
	
	}
	
	
	public void practice5() {
		
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력
		// 이름, 학년, 반, 번호, 성별(M/F), 성적(소수점 아리 둘째 자리까지)
		// 이때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		sc.nextLine();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String student = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아리 둘째 자리까지) : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, ban, num, name, student, score);
		
	}
	
	public void practice6() {
		
		// 키보드로 나이를 입력받아 어린이(13세 이하)인지,
		// 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		String result = (age <= 13) ? "어린이" : ((age > 13 && age <= 19) ? "청소년" : "성인");
		
		System.out.println(result);
		
	}
	
	
	public void practice7() {
		
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		// 세 과목에 대한 합계와 평균을 출력
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);
		
	}
	
	
	public void practice8() {
		
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String personId = sc.nextLine();
		
		String gender = (personId.charAt(7) == '1' || personId.charAt(7) == '3') ? "남자" : ((personId.charAt(7) == '2' || personId.charAt(7) == '4') ? "여자" : "잘못 입력했습니다.");
		
		System.out.println(gender);
		
	}
	
	
	public void practice9() {
		
		// 키보드로 정수 두개를 입력받아 각각 변수 num1, num2에 저장
		// 또 다른 정수를 입력받아 그 수가  num1 이하거나 num2 초과이면 true 출력
		// 아니면  false (입력할 때 num1은  num2보다 작아야함)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2(정수1보다 큰 값) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력 : ");
		int input =  sc.nextInt();
		sc.nextLine();
		
		boolean result = (input <= num1 | input > num2) ? true : false;
		
		System.out.println(result);
		
	}
	
	
	public void practice10() {
		
		// 3개의 수를 키보드로 입력받아 입력받은 수가 모두 같으면  true 아니면 false 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("입력3 : ");
		int num3 =  sc.nextInt();
		sc.nextLine();
		
		boolean result = (num1 == num2 && num2 == num3) ? true : false;
	
		System.out.println(result);
	}
	
}
