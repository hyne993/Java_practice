package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 입력하면 "OO메뉴입니다"를,
		// 종료 번호를 입력하면 "프로그램이 종료됩니다"를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int num = sc.nextInt();
		String str = " ";
		
		switch(num) {
		case 1 : str = "입력"; break;
		case 2 : str = "수정"; break;
		case 3 : str = "조회"; break;
		case 4 : str = "삭제"; break;
		case 9 : System.out.println("프로그램이 종료됩니다."); return;
		}
		
		System.out.println(str + "메뉴입니다");
		
	}
	
	
	public void practice2() {
		
		// 키보드로 정수를 입력받은 정수가 양수이면서 짝수일 때만 "짝수이다"를 출력하고
		// 짝수가 아니면 "홀수이다"를 출력
		// 양수가 아니면 "양수만 입력해주세요"를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine(); 
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수이다");
			}
			else {
				System.out.println("홀수이다");
			}
		}
		else {
			System.out.println("양수만 입력해주세요");
		}
		
	}
	
	
	public void practice3() {
		
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격을 처리하는 기능을 구현
		// 합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상인 경우
		// 합격했을 경우 과목 별 점수와 합계, 평균, "축하합니다. 합격입니다!"를 출력하고
		// 불합격인 경우에는 "불합격입니다."를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다. 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	
	public void practice4() {
		
		// switch문을 사용
		// 1 ~ 12 사이의 정수를 입력받아 계절 출력 "xx월은 xx입니다."
		// 1 ~ 12가 아닌 정수가 입력되면 "xx월은 잘못 입력된 달입니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result = " ";
		
		switch(month) {
		case 3 : 
		case 4 :	
		case 5 : result = "봄"; break;	
		case 6 :	
		case 7 :	
		case 8 : result = "여름"; break;
		case 9 :
		case 10 :
		case 11 : result = "가을"; break;
		case 12 :
		case 1 :
		case 2 : result = "겨울"; break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다."); return;
		}
		
		System.out.println(month + "월은 " + result + "입니다.");
		
	
	
	}
	
	
	public void practice5() {
		
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성
		// 로그인 성공 시 "로그인 성공"
		// 아이디가 틀렸을 시 "아이디가 틀렸습니다."
		// 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다." 출력
		
		String id1 = "heeyeon";
		String pwd1 = "hy1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id2 = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd2 = sc.nextLine();
		
		boolean b1 = id2.equals(id1);
		boolean b2 = pwd2.equals(pwd1);
		
		if(b1 == false) {
			System.out.println("아이디가 틀렸습니다.");
		}
		if(b2 == false) {
			System.out.println("비밀번호가 틀렸습니다.");
		} 
		if(b1 == true && b2 == true) {
			System.out.println("로그인 성공");
		}
		
	}
	
	
	public void practice6() {
		
		// 사용자에게 관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한 출력
		// 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능
		// 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능
		// 비회원은 게시글 조회만 가능
		// 단, 잘못 입력하였을 경우 "잘못 입력했습니다." 라는 출력문 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.nextLine();
		
		switch(rank) {
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원" : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break;
		}
		
	}
	
	
	public void practice7() {
		
		// 키, 몸무게를 double로 입력받고 BMI지수를 계산하여 계산결과에 따라 
		// 저체중 / 정상체중 / 과체중 / 비만을 출력
		// BMI = 몸무게 / (키(m) * 키(m))
		// BMI가 18.5미만일 경우 저체중, 18.5이상 23미만일 경우 정상체중
		// 23이상 25미만일 경우 과체중, 25이상 30미만일 경우 비만, 30이상일 경우 고도비만
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 :" + bmi);
		
		String result = " ";
		if(bmi < 18.5) {
			result = "저체중";
		}
		else if(bmi < 23) {
			result = "정상체중";
		}
		else if(bmi < 25) {
			result = "과체중";
		}
		else if(bmi < 30) {
			result = "비만";
		}
		else {
			result = "고도비만";
		}
		
		System.out.println(result);
	}
	
	
	public void practice8() {
		
		// 키보드로 두개의 양수와 연산 기호를 입력받아 연산 기호에 맞춰 연산 결과를 출력
		// 단, 양수가 아닌 값을 입력하거나 제시되어있지 않은 연산기호를 입력했을 시 
		// "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력
		// 연산기호 : +, -, *, /, % 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(num1 > 0 && num2 > 0 ) {
			if(op == '+') {
				result = num1 + num2;
			}
			else if(op == '-') {
				result = num1 - num2;
			}
			else if(op == '*') {
				result = num1 * num2;
			}
			else if(op == '/') {
				result = num1 / num2;
			}
			else if(op == '%'){
				result = num1 % num2;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); return; 
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result );
	}
	
	
	public void practice9() {
		
		// 중간고사, 기말고사, 과제점수, 출석횟수를 입력받고 Pass 또는 Fail을 출력
		// 총점 100점 중 배점은 다음과 같음 : 중간고사(20%) 기말고사(30%) 과제(30%) 출석(20%)
		// 이 때 출석횟수는 총 강의횟수 20회 중에서 출석한 날만 입력
		// 총점이 70점 이상이면서 전체강의의 70% 이상 출석을 했을 경우 Pass 아니면 Fail 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();
		sc.nextLine();
		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();
		sc.nextLine();
		System.out.print("과제 점수 : ");
		int assign = sc.nextInt();
		sc.nextLine();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		sc.nextLine();
		
		double sum = score1 * 0.2 + score2 * 0.3 + assign * 0.3 + attend * 5 * 0.2;
		
		System.out.println("==========결과=========");
		if(sum >= 70 && attend > 20 * 0.7) {
			System.out.println("중간 고사 점수(20) : " + score1 * 0.2);
			System.out.println("기말 고사 점수(30) : " + score2 * 0.3);
			System.out.println("과제 점수 (30) : " + assign * 0.3);
			System.out.println("출석 점수 (20) : " + attend * 5 * 0.2);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}
		if(attend < 20 * 0.7) {
			System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
		}
		if(sum < 70) {
			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
		}
		
	}
	
	
	public void practice10() {
		
		// 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.printf("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	
	
}	

