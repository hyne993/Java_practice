package com.kh.chap01.list.part02.mvc.controller;

import java.util.ArrayList;

import com.kh.chap01.list.part02.mvc.model.vo.Music;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("�������", "������"));
		list.add(new Music("����ΰ���", "��θ���"));
	}
	
	
	// ���ο� �� �߰� ��û�� ����� �޼ҵ�
	public int insertMusic(String title, String artist) {
		
		int before = list.size();
		
		list.add(new Music(title, artist));
		
		return list.size() - before;
	}
	
	
	// ��ü �� ��ȸ ��û�� ����� �޼ҵ�
	public ArrayList<Music> selectMusic(){
		
		return list;
	}
	
	
	// Ư�� �� �˻� ��û�� ����� �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searched = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		
		return searched;
		
	}
	
	
	// Ư�� �� ���� ��û�� ����� �޼ҵ�
	public int deleteMusic(String title) {
		
		int result = 0; 
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i--);
				result++;
			}
		}
		
		return result;
	}
	
	
	// Ư�� �� ���� ��û�� ����� �޼ҵ�
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result++;
			}
		}
		
		return result;
	}
	
	
}
