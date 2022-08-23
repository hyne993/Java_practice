package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	private ArrayList<Car> carList = new ArrayList<>();
	
	public int insertCar(int carNum, int carType, String owner) {
		
		int lastNum = 0;
		int before = carList.size();
		
		if(carList.isEmpty()) {
			lastNum = 1;
		}
		else {
			lastNum = carList.get(carList.size() - 1).getParkingNum() + 1;
		}
		
		carList.add(new Car(lastNum, carNum, carType, owner));
		
		return carList.size() - before;
	}
	
	public int deleteCar(int carNum) {
		
		int result = 0;
		
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				carList.remove(i--);
				result++;
			}
		}
		
		return result;
	}
	
	public ArrayList<Car> searchCar(String owner){
		
		ArrayList<Car> searchList = new ArrayList<>();
		
		for(Car c : carList) {
			if(c.getOwner().equals(owner)) {
				searchList.add(c);
			}
		}
		
		return searchList;
	}
	
	public ArrayList<Car> selectList(){
		
		return carList;
	}
	
}
