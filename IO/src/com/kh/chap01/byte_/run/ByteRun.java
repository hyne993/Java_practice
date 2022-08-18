package com.kh.chap01.byte_.run;

import com.kh.chap01.byte_.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {
		
		
		FileByteDao fb = new FileByteDao();
		
		fb.filesave();
		
		fb.fileRead();
		
	}

}
