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
			
			System.out.println(">> �޴� ���� ");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ������ ���� �˻�");
			System.out.println("4. ��ü ���");
			System.out.println("0. ���α׷� �����ϱ�");
			
			System.out.print("�޴� �Է� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("���α׷� ����"); return;
			default : System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���."); 
			}
		}
		
	}
	
	public void insertCar() {
		
		System.out.print("���� ��ȣ : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ����(1:���� / 2:���� / 3:SUV / 4:Ʈ��) : ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.print("���ָ� : ");
		String owner = sc.nextLine();
		
		int result = ptc.insertCar(carNum, carType, owner);
		
		if(result > 0) {
			System.out.println("������ ���������� �̷�������ϴ�.");
		}
		else {
			System.out.println("������ ������ �����ϴ�.");
		}
		
	}
	
	public void deleteCar() {
		
		System.out.print("���� ��ȣ : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		int result = ptc.deleteCar(carNum);
		
		if(result > 0) {
			System.out.println("������ ���������� �̷�������ϴ�.");
		}
		else {
			System.out.println("������ ������ �����ϴ�.");
		}
	}
	
	public void searchCar() {
		
		System.out.print("���ָ� : ");
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
