package com.kh.chap01.byte_.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	
	// 출력 
	public void filesave() {
		
		// FileOutputStream : "파일"로 데이터를 1byte 단위로 출력하는 스트림
		
		FileOutputStream fout = null; 
		try {
			
			fout = new FileOutputStream("a_byte.txt"); 
			
			fout.write(97);	
			fout.write('b');
			
			byte[] bArr = {99, 100, 101}; 
			fout.write(bArr); 
			fout.write(bArr, 1, 2); 			
			
		} catch(FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fout.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	
	
	
	// 입력 
	public void fileRead() {
		
		FileInputStream fin = null;
		
		try {
			
			fin = new FileInputStream("a_byte.txt"); 
			
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println(value);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fin.close(); // IOException 발생 가능
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
