package com.kh.model.vo;

public class Car {
	
	// �ʵ��
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	// �����ں�
	public Car() {
		
	}
	
	public Car(int parkingNum, int carNum, int carType, String owner) {
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	// �޼ҵ��
	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		String newCarType = "";
		
		switch(carType) {
		case 1 : newCarType = "����"; break; 
		case 2 : newCarType = "����"; break;
		case 3 : newCarType = "SUV"; break;
		case 4 : newCarType = "Ʈ��"; break;
		}
		
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + newCarType + ", owner=" + owner
				+ "]";
	}
	
}
