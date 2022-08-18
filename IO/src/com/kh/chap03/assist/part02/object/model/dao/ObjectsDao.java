package com.kh.chap03.assist.part02.object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap03.assist.part02.object.model.vo.Phone;

public class ObjectsDao {
	
	// 프로그램 ---> 외부 매체(파일)
	// 출력
	public void fileSave() {
		
		// FileOutputStream + ObjectOutputSteam (1byte짜리 좁은 통로)
		
		// 테스트용 객체 배열 생성
		Phone[] arr = new Phone[3];
		
		// 테스트용 데이터 담기
		arr[0] = new Phone("아이폰", 1300000);
		arr[1] = new Phone("갤럭시", 1500000);
		arr[2] = new Phone("플립폰", 2000000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.txt"))){
			
			for(int i = 0; i < arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 입력
	public void fileRead() {
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			while(true) {
				System.out.println(ois.readObject()); 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { 
			System.out.println("파일을 다 읽었습니다.");
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료"); 
		
	}
	
}
