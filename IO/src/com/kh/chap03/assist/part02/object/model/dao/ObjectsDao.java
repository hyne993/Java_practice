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
	
	// ���α׷� ---> �ܺ� ��ü(����)
	// ���
	public void fileSave() {
		
		// FileOutputStream + ObjectOutputSteam (1byte¥�� ���� ���)
		
		// �׽�Ʈ�� ��ü �迭 ����
		Phone[] arr = new Phone[3];
		
		// �׽�Ʈ�� ������ ���
		arr[0] = new Phone("������", 1300000);
		arr[1] = new Phone("������", 1500000);
		arr[2] = new Phone("�ø���", 2000000);
		
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
	
	
	// �Է�
	public void fileRead() {
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			while(true) {
				System.out.println(ois.readObject()); 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { 
			System.out.println("������ �� �о����ϴ�.");
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("���α׷� ����"); 
		
	}
	
}
