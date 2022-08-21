package com.kh.chap01.list.part02.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01.list.part02.mvc.controller.MusicController;
import com.kh.chap01.list.part02.mvc.model.vo.Music;

//View : �ð����� ���(����ڰ� ���� �� ȭ��)�� ���
//��¹��� �Է¹��� ��� 
public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	// ���α׷� ���۽�, ����ڿ��� ���� ó�� �������� ȭ�� : ����ȭ��
	// ���� ȭ���� ����� �޼ҵ�
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("*** Welcome ���� ***");
			System.out.println("1. ���ο� �� �߰�");
			System.out.println("2. ��ü �� ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("0. ���α׷� ����");
			
			System.out.println("------------------");
			System.out.print("�޴� �Է� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertMusic(); break;
			case 2 : selectMusic(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��� �޴��Դϴ�. �ٽ� �Է����ּ���");
			}
			
		}
	}	
		
	
	// 1. ���ο� �� �߰���ų �� �ִ� ȭ��
	public void insertMusic() {
					
		System.out.println("=== ���ο� �� �߰� ===");
		System.out.print("��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("������ �Է� : ");
		String artist = sc.nextLine();
						
		int result = mc.insertMusic(title, artist);
		
		if(result > 0) {
			System.out.println("���������� �߰��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�߰��� �����߽��ϴ�.");
		}
	}
	
	
	// 2. ��ü �� ��ȸ�� �� �ִ� ȭ��
	public void selectMusic() {
		
		System.out.println("=== ��ü �� ��ȸ ===");
		
		ArrayList<Music> list = mc.selectMusic();
		for(Music m : list) {
			System.out.println(m);
		}
	}
	
	
	// 3. Ư�� �� �˻��� �� �ִ� ȭ��
	public void searchMusic() {
		
		System.out.println("=== Ư�� �� ��ȸ ===");
		System.out.print("�˻��� ��� Ű���� : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searched = mc.searchMusic(keyword);
		
		if(searched.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		else {
			System.out.println(searched);
		}
	}
	
	
	// 4. Ư�� �� ������ �� �ִ� ȭ��
	public void deleteMusic() {
		
		System.out.println("=== Ư�� �� ���� ===");
		System.out.print("������ ��� : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
	
	
	// 5. Ư�� �� ������ �� �ִ� ȭ��
	public void updateMusic() {
		
		System.out.println("=== Ư�� �� ���� ===");
		System.out.print("���� ��� : ");
		String title = sc.nextLine();
		System.out.print("��������(���) : ");
		String upTitle = sc.nextLine();
		System.out.print("��������(������) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
	}
	
}
