package com.kh.hw.run;

import com.kh.hw.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// 길이가 3인 객체 배열을 만들고 해당 인덱스마다 매개변수 생성자를 통해 객체 생성후 실행
		// information()을 사용하여 출력
		// 실행 결과 : 3학년 1반 1번 홍길동
		//			4학년 3반 2번 박말자
		//			2학년 7반 5번 윤숙희
		
		Student[] arr = new Student[3];
		
		arr[0] = new Student(3, 1, 1, "홍길동");
		arr[1] = new Student(4, 3, 2, "박말자");
		arr[2] = new Student(2, 7, 5, "윤숙희");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i].information());
		}
	}

}
