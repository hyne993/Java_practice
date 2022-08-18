package com.kh.chap03.assist.part02.object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap03.assist.part02.object.model.vo.Phone;

public class ObjectDao {
	
	// 출력
	public void fileSave() {
		
		Phone ph = new Phone("아이폰", 1300000);
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));
			
			oos.writeObject(ph); 
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	// 입력
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.txt"))){
			
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
}
