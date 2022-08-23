package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println(">> 메뉴 구성 ");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력했습니다. 다시 입력하세요."); 
			}
		}
		
	}
	
	public void insertCar() {
		
		System.out.print("차량 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.print("차량 종류(1:경차 / 2:세단 / 3:SUV / 4:트럭) : ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.print("차주명 : ");
		String owner = sc.nextLine();
		
		int result = ptc.insertCar(carNum, carType, owner);
		
		if(result > 0) {
			System.out.println("주차가 성공적으로 이루어졌습니다.");
		}
		else {
			System.out.println("주차한 차량이 없습니다.");
		}
		
	}
	
	public void deleteCar() {
		
		System.out.print("차량 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		int result = ptc.deleteCar(carNum);
		
		if(result > 0) {
			System.out.println("출차가 성공적으로 이루어졌습니다.");
		}
		else {
			System.out.println("출차한 차량이 없습니다.");
		}
	}
	
	public void searchCar() {
		
		System.out.print("차주명 : ");
		String owner = sc.nextLine();
		
		ArrayList<Car> searchList = ptc.searchCar(owner);
		
		for(Car c : searchList) {
			System.out.println(c);
		}
	}
	
	public void selectList() {
		
		ArrayList<Car> list = ptc.selectList();
		
		for(Car c : list) {
			System.out.println(c);
		}
	}
	
}
