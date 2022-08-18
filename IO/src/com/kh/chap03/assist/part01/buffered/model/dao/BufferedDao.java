package com.kh.chap03.assist.part01.buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	// ���
	public void fileSave() {
		
		
		
		BufferedWriter bw = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
							
			bw.write("�ȳ��ϼ���.");
			bw.newLine();  
			bw.write("�ݰ����ϴ�.\n"); 
			bw.write("�������.");
			
			
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
	
	
	// �Է�
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

