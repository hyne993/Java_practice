package com.kh.chap03.assist.part01.buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// 출력
	public void fileSave() {
		
		
		
		BufferedWriter bw = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
							
			bw.write("안녕하세요.");
			bw.newLine();  
			bw.write("반갑습니다.\n"); 
			bw.write("어서오세요.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	// 입력
	public void fileRead() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}

