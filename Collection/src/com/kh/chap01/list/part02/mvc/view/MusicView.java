package com.kh.chap01.list.part02.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01.list.part02.mvc.controller.MusicController;
import com.kh.chap01.list.part02.mvc.model.vo.Music;

//View : 시각적인 요소(사용자가 보게 될 화면)를 담당
//출력문과 입력문을 사용 
public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	// 프로그램 시작시, 사용자에게 가장 처음 보여지는 화면 : 메인화면
	// 메인 화면을 담당할 메소드
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("*** Welcome 별밤 ***");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 전체 곡 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("------------------");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectMusic(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 메뉴입니다. 다시 입력해주세요");
			}
			
		}
	}	
		
	
	// 1. 새로운 곡 추가시킬 수 있는 화면
	public void insertMusic() {
					
		System.out.println("=== 새로운 곡 추가 ===");
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String artist = sc.nextLine();
						
		int result = mc.insertMusic(title, artist);
		
		if(result > 0) {
			System.out.println("성공적으로 추가되었습니다.");
		}
		else {
			System.out.println("추가에 실패했습니다.");
		}
	}
	
	
	// 2. 전체 곡 조회할 수 있는 화면
	public void selectMusic() {
		
		System.out.println("=== 전체 곡 조회 ===");
		
		ArrayList<Music> list = mc.selectMusic();
		for(Music m : list) {
			System.out.println(m);
		}
	}
	
	
	// 3. 특정 곡 검색할 수 있는 화면
	public void searchMusic() {
		
		System.out.println("=== 특정 곡 조회 ===");
		System.out.print("검색할 곡명 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println(searched);
		}
	}
	
	
	// 4. 특정 곡 삭제할 수 있는 화면
	public void deleteMusic() {
		
		System.out.println("=== 특정 곡 삭제 ===");
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}
	
	
	// 5. 특정 곡 수정할 수 있는 화면
	public void updateMusic() {
		
		System.out.println("=== 특정 곡 수정 ===");
		System.out.print("기존 곡명 : ");
		String title = sc.nextLine();
		System.out.print("수정내용(곡명) : ");
		String upTitle = sc.nextLine();
		System.out.print("수정내용(가수명) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		}
		else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}
	
}
