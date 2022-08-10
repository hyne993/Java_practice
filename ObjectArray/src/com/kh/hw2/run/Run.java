package com.kh.hw2.run;

import java.util.Scanner;

import com.kh.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// 최대 10명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고
		// 반복문을 사용하여 키보드로 학생 정보를 입력받도록 구현
		// while(true)문과 int count를 1씩 증가시키면서 진행
		// 계속 추가할 것인지를 물어보고 'n'을 입력시 반복문 빠져나감
		Student[] arr = new Student[10];
		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		while(true) {
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			sc.nextLine();
			
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			sc.nextLine();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			arr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			count++;
			
			System.out.print("종료를 원하시면 n을, 계속 추가를 원하시면 그 외의 값을 입력하세요 : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' ) {
				break;
			}
			
			
			
		}
			
		
		// 3명의 학생 정보를 입력받아, 각 객체에 저장
		// 힉년  반    이름    국어점수     영어점수    수학점수
		//  1  5    홍길동      40		  60	 70  
		//	2  1    김말똥	  70      80     100
		//	3  3    강개순     100      75     86
		
		// 현재 기록된 학생들의 정보와 각 학생의 평균 점수를 출력
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i].information());
			System.out.println(", 평균 점수 : " + (arr[i].getKor() + arr[i].getEng() + arr[i].getMath()) / 3);
		}
		
	}

}
