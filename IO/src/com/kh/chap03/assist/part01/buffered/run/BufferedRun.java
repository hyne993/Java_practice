package com.kh.chap03.assist.part01.buffered.run;

import com.kh.chap03.assist.part01.buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		BufferedDao bd = new BufferedDao();
		
		bd.fileSave();
		
		bd.fileRead();
		
	}

}

