package com.kh.chap02.char_.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	// 출력
	public void fileSave() {
	
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("b_char.txt"); 
			
			fw.write("안녕하세요!!"); 
			fw.write('A'); 
			fw.write(97); 
			fw.write("\n");
			
			char[] cArr = {'j', 'a', 'v', 'a'};
			fw.write(cArr);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

	// 입력 
	public void fileRead() {
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
//				System.out.println(value);
				System.out.print((char)value); // 문자형태, 개행 없이 가로로 출력
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}
	
}

