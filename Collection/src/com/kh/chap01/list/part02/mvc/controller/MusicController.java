package com.kh.chap01.list.part02.mvc.controller;

import java.util.ArrayList;

import com.kh.chap01.list.part02.mvc.model.vo.Music;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("도깨비불", "에스파"));
		list.add(new Music("사랑인가봐", "멜로망스"));
	}
	
	
	// 새로운 곡 추가 요청시 실행될 메소드
	public int insertMusic(String title, String artist) {
		
		int before = list.size();
		
		list.add(new Music(title, artist));
		
		return list.size() - before;
	}
	
	
	// 전체 곡 조회 요청시 실행될 메소드
	public ArrayList<Music> selectMusic(){
		
		return list;
	}
	
	
	// 특정 곡 검색 요청시 실행될 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searched = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		
		return searched;
		
	}
	
	
	// 특정 곡 삭제 요청시 실행될 메소드
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
	
	
	// 특정 곡 수정 요청시 실행될 메소드
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
