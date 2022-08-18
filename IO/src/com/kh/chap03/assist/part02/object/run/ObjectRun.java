package com.kh.chap03.assist.part02.object.run;

import com.kh.chap03.assist.part02.object.model.dao.ObjectDao;
import com.kh.chap03.assist.part02.object.model.dao.ObjectsDao;

public class ObjectRun {
	
	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
		
		od.fileSave();
		
		od.fileRead();
		
		
		ObjectsDao ods = new ObjectsDao();
		
		ods.fileSave(); 
		
		ods.fileRead();
		
	}

}
