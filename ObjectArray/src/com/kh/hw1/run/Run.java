package com.kh.hw1.run;

import com.kh.hw1.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		// 3명의 사원정보를 배열을 통해 생성한 후 출력
		// 0번 인덱스는 기본생성자 이용. 1번 인덱스는 매개변수 6개짜리 생성자를 이용. 2번 인덱스는 매개변수 전체의 생성자 이용
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee();
		arr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		arr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("emp["+ i +"] : " + arr[i].information());
		}
		
		// 객체들 중 값이 없는 필드에는 setter를 통해 각각 값을 수정하는 후 다시 출력
		arr[0].setEmpNo(0);
		arr[0].setEmpName("김말똥");
		arr[0].setDept("영업부");
		arr[0].setJob("팀장");
		arr[0].setAge(30);
		arr[0].setGender('M');
		arr[0].setSalary(3000000);
		arr[0].setBonusPoint(0.2);
		arr[0].setPhone("01055559999");
		arr[0].setAddress("전라도 광주");
		
		arr[1].setDept("기획부");
		arr[1].setJob("부장");
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		
		System.out.println("========================================================================");
		for(int i = 0; i < 2; i++) {
			System.out.println("emp[" + i + "] : " + arr[i].information());
		}
		
		// 직원 각각의 보너스가 적용된 연봉을 계산하여 출력하고
		// 총 직원 연봉의 평균을 구하여 출력
		System.out.println("========================================================================");
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i].getEmpName() + "의 연봉 : " + (int)(arr[i].getSalary() * (1 + arr[i].getBonusPoint()) * 12) + "원");
			sum += arr[i].getSalary() * (1 + arr[i].getBonusPoint()) * 12;
		}
		System.out.println("========================================================================");
		System.out.println("직원들의 연봉의 평균 : " + sum / arr.length + "원");
	}
	
	
}
