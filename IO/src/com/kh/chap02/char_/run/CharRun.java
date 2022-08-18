package com.kh.chap02.char_.run;

import com.kh.chap02.char_.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		
		FileCharDao fc = new FileCharDao();
		
		fc.fileSave();
		
		fc.fileRead();
		
	}

}
